/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsys.dao;

import hrsys.obj.PayslipCreationObj;
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

/**
 *
 * @author user
 */
public class PayslipCreationDao {

    public PayslipCreationObj getPayslipCreation(String emCode, String yMonth) {

        System.out.println("6666?");
        PayslipCreationObj obj = new PayslipCreationObj();

        String jdbcUrl = "jdbc:postgresql://localhost:5432/zhao";
        String username = "postgres";
        String password = "postgres";

        try {
            // 1. 注册 PostgreSQL 驱动程序
            Class.forName("org.postgresql.Driver");
            // 2. 建立数据库连接
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. 创建 SQL 语句
            String sql = "SELECT\n"
                    + "    S.Employee_Code,\n"
                    + "    S.year_month,\n"
                    + "    A.Month_Attendance_Days,\n"
                    + "    A.Actual_Attendance_Days,\n"
                    + "    A.Monthly_Working_Hours,\n"
                    + "    A.Actual_Working_Hours,\n"
                    + "    A.Absent_ays,\n"
                    + "    A.Holiday_Work_Days,\n"
                    + "    A.Holiday_Working_Hours,\n"
                    + "    A.Weekday_Overtime,\n"
                    + "    A.Late_Night_Overtime,\n"
                    + "    A.Tardiness_and_Early_Departure,\n"
                    + "    A.Remaining_Paid_Leave_Days,\n"
                    + "    A.Consumed_Paid_Leave_Days,\n"
                    + "    S.Base_Salary,\n"
                    + "    S.Position_Allowance,\n"
                    + "    S.Qualification_Allowance,\n"
                    + "    S.Housing_Allowance,\n"
                    + "    S.Family_Allowance,\n"
                    + "    S.Commute_Allowance,\n"
                    + "    S.Expected_Monthly_Overtime_Allowance,\n"
                    + "    S.Late_Night_Allowance,\n"
                    + "    S.Holiday_Allowance,\n"
                    + "    S.Total_Payment_Amount,\n"
                    + "    S.Health_Insurance,\n"
                    + "    S.Employment_Insurance,\n"
                    + "    S.Welfare_Pension,\n"
                    + "    S.Long_Term_Care_Insurance,\n"
                    + "    S.Total_Insurance_Premiums,\n"
                    + "    S.Withholding_IncomeTax,\n"
                    + "    S.Resident_Tax,\n"
                    + "    S.Total_Deductions,\n"
                    + "    S.Total_Taxes,\n"
                    + "    S.Total_deductible,\n"
                    + "    S.Deletion_Flag,\n"
                    + "    S.Creation_Date,\n"
                    + "    S.Update_Date\n"
                    + "FROM\n"
                    + "    SalaryCalculation AS S\n"
                    + "INNER JOIN\n"
                    + "    Attendance AS A\n"
                    + "ON\n"
                    + "    S.Employee_Code = A.Employee_Code\n"
                    + "    AND S.name = A.name\n"
                    + "    AND S.year_month = A.year_month;";

            System.out.println("emCode: " + emCode);
            System.out.println("yearMonth: " + yMonth);
            System.out.println("SQL" + sql);
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
                Double baseSalary = resultSet.getDouble("Base_Salary");
                Double positionAllowance = resultSet.getDouble("Position_Allowance");
                Double qualificationAllowance = resultSet.getDouble("Qualification_Allowance");
                Double housingAllowance = resultSet.getDouble("Housing_Allowance");
                Double familyAllowance = resultSet.getDouble("Family_Allowance");
                Double commuteAllowance = resultSet.getDouble("Commute_Allowance");
                Double expectedMonthlyOvertimeAllowance = resultSet.getDouble("Expected_Monthly_Overtime_Allowance");
                Double lateNightAllowance = resultSet.getDouble("Late_Night_Allowance");
                Double holidayAllowance = resultSet.getDouble("Holiday_Allowance");
                Double totalPaymentAmount = resultSet.getDouble("Total_Payment_Amount");
                Double healthInsurance = resultSet.getDouble("Health_Insurance");
                Double employmentInsurance = resultSet.getDouble("Employment_Insurance");
                Double welfarePension = resultSet.getDouble("Welfare_Pension");
                Double longTermCareInsurance = resultSet.getDouble("Long_Term_Care_Insurance");
                Double totalInsurancePremiums = resultSet.getDouble("Total_Insurance_Premiums");
                Double withholdingIncomeTax = resultSet.getDouble("Withholding_IncomeTax");
                Double residentTax = resultSet.getDouble("Resident_Tax");
                Double totalDeductions = resultSet.getDouble("Total_Deductions");
                Double totalTaxes = resultSet.getDouble("Total_Taxes");
                Double totalDeductible = resultSet.getDouble("Total_deductible");

                String yearMonth = resultSet.getString("year_month");

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
                obj.setBaseSalary(baseSalary);
                obj.setPositionAllowance(positionAllowance);
                obj.setQualificationAllowance(qualificationAllowance);
                obj.setHousingAllowance(housingAllowance);
                obj.setFamilyAllowance(familyAllowance);
                obj.setCommuteAllowance(commuteAllowance);
                obj.setExpectedMonthlyOvertimeAllowance(expectedMonthlyOvertimeAllowance);
                obj.setLateNightAllowance(lateNightAllowance);
                obj.setHolidayAllowance(holidayAllowance);
                obj.setTotalPaymentAmount(totalPaymentAmount);
                obj.setHealthInsurance(healthInsurance);
                obj.setEmploymentInsurance(employmentInsurance);
                obj.setWelfarePension(welfarePension);
                obj.setLongTermCareInsurance(longTermCareInsurance);
                obj.setTotalInsurancePremiums(totalInsurancePremiums);
                obj.setWithholdingIncomeTax(withholdingIncomeTax);
                obj.setResidentTax(residentTax);
                obj.setTotalDeductions(totalDeductions);
                obj.setTotalTaxes(totalTaxes);
                obj.setTotalDeductible(totalDeductible);
                obj.setYearMonth(yearMonth);

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
