/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsys.dao;

import hrsys.obj.AttendanceObj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import static java.util.Collections.list;
/**
 *
 * @author user
 */
public class AttendanceDao {

    public void addAttendance(AttendanceObj attendanceObj) throws SQLException {

        System.out.println("5555?");
        String jdbcUrl = "jdbc:postgresql://localhost:5432/zhao";
        String username = "postgres";
        String password = "postgres";

        // 获取当前系统时间
        LocalDateTime currentTime = LocalDateTime.now();

        try {
            // 1. 注册 PostgreSQL 驱动程序
            Class.forName("org.postgresql.Driver");
            // 2. 建立数据库连接
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. 创建 SQL 语句
            // String sql = "INSERT INTO EmployeeInfoDao (Name, Katakana, Gender, Birth, Phone_Number, Email, Date_of_Joining, Date_of_Resignation, Postal_Code, Address, Nationality, Contract_Type, Salary_Type, Job_Title, Office_Location, Position, Health_Insurance_Number, Labor_Insurance_Number, Period_of_Stay, Residence_Status, Deletion_Flag, Creation_Date, Update_Date) VALUES"
            //       + "(jTextField1', 'jTextField4', 'jTextField5', 'jTextField6', 'jTextField2', 'jTextField7', 'jTextField8', 'jTextField9', 'jTextField10', 'jTextField11', 'jTextField13', 'jTextField14', 'jTextField15', 'jTextField16', 'jTextField19', 'jTextField20', 'jTextField21', 'jTextField22', 'jTextField23', 'jTextField24');";
            StringBuffer sb = new StringBuffer();
            sb.append("INSERT INTO attendance (employee_code, name, year_month, month_attendance_days, actual_attendance_days, monthly_working_hours, actual_working_hours, absent_ays, holiday_work_days, holiday_working_hours, weekday_overtime, late_night_overtime, tardiness_and_early_departure, remaining_paid_leave_days, consumed_paid_leave_days,remarks) VALUES(");

            sb.append("'" + attendanceObj.getEmployeeCode() + "',");
            sb.append("'" + attendanceObj.getName() + "',");
            sb.append("'" + attendanceObj.getYearMonth() + "',");
            sb.append("'" + attendanceObj.getMonthAttendanceDays() + "',");
            sb.append("'" + attendanceObj.getActualAttendanceDays() + "',");
            sb.append("'" + attendanceObj.getMonthlyWorkingHours() + "',");
            sb.append("'" + attendanceObj.getActualWorkingHours() + "',");
            sb.append("'" + attendanceObj.getAbsentAys() + "',");
            sb.append("'" + attendanceObj.getHolidayWorkDays() + "',");
            sb.append("'" + attendanceObj.getHolidayWorkingHours() + "',");
            sb.append("'" + attendanceObj.getWeekdayOvertime() + "',");
            sb.append("'" + attendanceObj.getLateNightOvertime() + "',");
            sb.append("'" + attendanceObj.getTardinessAndEarlyDeparture() + "',");
            sb.append("'" + attendanceObj.getRemainingPaidLeaveDays() + "',");
            sb.append("'" + attendanceObj.getConsumedPaidLeaveDays() + "',");
            sb.append("'" + attendanceObj.getRemarks() + "',");
            sb.append("'" + 0 + "',");
            sb.append("'" + currentTime + "',");
            sb.append("'" + currentTime + "');");

            System.out.println(sb.toString());

            // 4. 创建 Statement 对象
            Statement statement = connection.createStatement();

            // 5. 执行查询并获取结果集
            statement.executeUpdate(sb.toString());

            // 7. 关闭资源
            statement.close();
            connection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<AttendanceObj> getAttendanceList() {

        System.out.println("ccccccc");
        List<AttendanceObj> list = new ArrayList<AttendanceObj>();

        String jdbcUrl = "jdbc:postgresql://localhost:5432/zhao";
        String username = "postgres";
        String password = "postgres";

        try {
            // 1. 注册 PostgreSQL 驱动程序
            Class.forName("org.postgresql.Driver");
            // 2. 建立数据库连接
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. 创建 SQL 语句
            String sql = "select * from Attendance;";

            // 4. 创建 Statement 对象
            Statement statement = connection.createStatement();

            System.out.println(sql);
            // 5. 执行查询并获取结果集
            ResultSet resultSet = statement.executeQuery(sql);

            // 6. 处理结果集
            while (resultSet.next()) {
                String employeeCode = resultSet.getString("employee_code");
                String name = resultSet.getString("name");
                String monthAttendanceDays = resultSet.getString("month_attendance_days");
                String actualAttendanceDays = resultSet.getString("actual_attendance_days");
                String monthlyWorkingHours = resultSet.getString("monthly_working_hours");
                String actualWorkingHours = resultSet.getString("actual_working_hours");
                String absentAys = resultSet.getString("absent_ays");
                String holidayWorkDays = resultSet.getString("holiday_work_days");
                String holidayWorkingHours = resultSet.getString("holiday_working_hours");
                String weekdayOvertime = resultSet.getString("weekday_overtime");
                String lateNightOvertime = resultSet.getString("late_night_overtime");
                String tardinessAndEarlyDeparture = resultSet.getString("tardiness_and_early_departure");
                String remainingPaidLeaveDays = resultSet.getString("remaining_paid_leave_days");
                String consumedPaidLeaveDays = resultSet.getString("consumed_paid_leave_days");
                String remarks = resultSet.getString("remarks");

                AttendanceObj obj = new AttendanceObj();
                obj.setEmployeeCode(employeeCode);
                obj.setName(name);
                obj.setMonthAttendanceDays(monthAttendanceDays);
                obj.setActualAttendanceDays(actualAttendanceDays);
                obj.setMonthlyWorkingHours(monthlyWorkingHours);
                obj.setActualWorkingHours(actualWorkingHours);
                obj.setAbsentAys(absentAys);
                obj.setHolidayWorkDays(holidayWorkDays);
                obj.setHolidayWorkingHours(holidayWorkingHours);
                obj.setWeekdayOvertime(weekdayOvertime);
                obj.setLateNightOvertime(lateNightOvertime);
                obj.setTardinessAndEarlyDeparture(tardinessAndEarlyDeparture);
                obj.setRemainingPaidLeaveDays(remainingPaidLeaveDays);
                obj.setConsumedPaidLeaveDays(consumedPaidLeaveDays);
                obj.setRemarks(remarks);

                list.add(obj);

            }

            // 7. 关闭资源
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public List<AttendanceObj> setAttendanceList() throws SQLException {

        System.out.println("aaaaa");

        List<AttendanceObj> list = new ArrayList<AttendanceObj>();

        String jdbcUrl = "jdbc:postgresql://localhost:5432/zhao";
        String username = "postgres";
        String password = "postgres";

        try {
            // 1. 注册 PostgreSQL 驱动程序
            Class.forName("org.postgresql.Driver");
            // 2. 建立数据库连接
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. 创建 SQL 语句
            String sql = "SELECT * FROM Attendance";

            // 4. 创建 Statement 对象
            Statement statement = connection.createStatement();

            // 5. 执行查询并获取结果集
            ResultSet resultSet = statement.executeQuery(sql);

            // 6. 处理结果集
            while (resultSet.next()) {
                String employeeCode = resultSet.getString("employee_code");
                String name = resultSet.getString("name");

                AttendanceObj obj = new AttendanceObj();
                obj.setEmployeeCode(employeeCode);
                obj.setName(name);
                list.add(obj);

            }

            // 7. 关闭资源
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public AttendanceObj getAttendance(String emCode) {

        System.out.println("6666?");
        AttendanceObj obj = new AttendanceObj();

        String jdbcUrl = "jdbc:postgresql://localhost:5432/zhao";
        String username = "postgres";
        String password = "postgres";

        try {
            // 1. 注册 PostgreSQL 驱动程序
            Class.forName("org.postgresql.Driver");
            // 2. 建立数据库连接
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. 创建 SQL 语句
            String sql = "select * from Attendance where employee_code = '" + emCode + "';";

            // 4. 创建 Statement 对象
            Statement statement = connection.createStatement();

            System.out.println(sql);
            // 5. 执行查询并获取结果集
            ResultSet resultSet = statement.executeQuery(sql);

            // 6. 处理结果集
            while (resultSet.next()) {
                String employeeCode = resultSet.getString("employee_code");
                String name = resultSet.getString("name");
                String monthAttendanceDays = resultSet.getString("month_attendance_days");
                String actualAttendanceDays = resultSet.getString("actual_attendance_days");
                String monthlyWorkingHours = resultSet.getString("monthly_working_hours");
                String actualWorkingHours = resultSet.getString("actual_working_hours");
                String absentAys = resultSet.getString("absent_ays");
                String holidayWorkDays = resultSet.getString("holiday_work_days");
                String holidayWorkingHours = resultSet.getString("holiday_working_hours");
                String weekdayOvertime = resultSet.getString("weekday_overtime");
                String lateNightOvertime = resultSet.getString("late_night_overtime");
                String tardinessAndEarlyDeparture = resultSet.getString("tardiness_and_early_departure");
                String remainingPaidLeaveDays = resultSet.getString("remaining_paid_leave_days");
                String consumedPaidLeaveDays = resultSet.getString("consumed_paid_leave_days");
                String remarks = resultSet.getString("remarks");

                obj.setEmployeeCode(employeeCode);
                obj.setName(name);
                obj.setMonthAttendanceDays(monthAttendanceDays);
                obj.setActualAttendanceDays(actualAttendanceDays);
                obj.setMonthlyWorkingHours(monthlyWorkingHours);
                obj.setActualWorkingHours(actualWorkingHours);
                obj.setAbsentAys(absentAys);
                obj.setHolidayWorkDays(holidayWorkDays);
                obj.setHolidayWorkingHours(holidayWorkingHours);
                obj.setWeekdayOvertime(weekdayOvertime);
                obj.setLateNightOvertime(lateNightOvertime);
                obj.setTardinessAndEarlyDeparture(tardinessAndEarlyDeparture);
                obj.setRemainingPaidLeaveDays(remainingPaidLeaveDays);
                obj.setConsumedPaidLeaveDays(consumedPaidLeaveDays);
                obj.setRemarks(remarks);

            }

            // 7. 关闭资源
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

        return obj;
    }
}