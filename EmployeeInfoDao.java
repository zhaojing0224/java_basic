/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsys.dao;

import hrsys.obj.EmployeeObj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class EmployeeInfoDao {

    public void addEmployeeInfo(EmployeeObj employeeObj) {

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
            sb.append("INSERT INTO employeeInfo (employee_code, name, katakana, gender, birth, phone_number, email, date_of_joining, date_of_resignation, postal_code, address, nationality, contract_type, salary_type, job_title, health_insurance_number, labor_insurance_number, residence_card_number, period_of_stay, residence_status, deletion_flag, creation_date, update_date) VALUES(");

            sb.append("'" + employeeObj.getEmployeeCode() + "',");
            sb.append("'" + employeeObj.getName() + "',");
            sb.append("'" + employeeObj.getKatakana() + "',");
            sb.append("'" + employeeObj.getGender() + "',");
            sb.append("'" + employeeObj.getBirth() + "',");
            sb.append("'" + employeeObj.getPhoneNumber() + "',");
            sb.append("'" + employeeObj.getEmail() + "',");
            sb.append("'" + employeeObj.getDateOfJoining() + "',");
            sb.append("'" + employeeObj.getDateOfResignation() + "',");
            sb.append("'" + employeeObj.getPostalCode() + "',");
            sb.append("'" + employeeObj.getAddress() + "',");
            sb.append("'" + employeeObj.getNationality() + "',");
            sb.append("'" + employeeObj.getContractType() + "',");
            sb.append("'" + employeeObj.getSalaryType() + "',");
            sb.append("'" + employeeObj.getJobTitle() + "',");
            sb.append("'" + employeeObj.getHealthInsuranceNumber() + "',");
            sb.append("'" + employeeObj.getLaborInsuranceNumber() + "',");
            sb.append("'" + employeeObj.getResidenceCardNumber() + "',");
            sb.append("'" + employeeObj.getPeriodOfStay() + "',");
            sb.append("'" + employeeObj.getResidenceStatus() + "',");
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

    public List<EmployeeObj> getEmployeeInfo() {

        System.out.println("ccccccc");
        List<EmployeeObj> list = new ArrayList<EmployeeObj>();

        String jdbcUrl = "jdbc:postgresql://localhost:5432/zhao";
        String username = "postgres";
        String password = "postgres";

        try {
            // 1. 注册 PostgreSQL 驱动程序
            Class.forName("org.postgresql.Driver");
            // 2. 建立数据库连接
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. 创建 SQL 语句
            String sql = "select * from EmployeeInfo;";

            // 4. 创建 Statement 对象
            Statement statement = connection.createStatement();

            System.out.println(sql);
            // 5. 执行查询并获取结果集
            ResultSet resultSet = statement.executeQuery(sql);

            // 6. 处理结果集
            while (resultSet.next()) {
                String employeeCode = resultSet.getString("employee_code");
                String name = resultSet.getString("name");
                String katakana = resultSet.getString("katakana");
                String birth = resultSet.getString("birth");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String dateOfJoining = resultSet.getString("date_of_joining");
                String dateOfResignation = resultSet.getString("date_of_resignation");
                String postalCode = resultSet.getString("postal_code");
                String address = resultSet.getString("address");
                String nationality = resultSet.getString("nationality");
                String contractType = resultSet.getString("contract_type");
                String salaryType = resultSet.getString("salary_type");
                String jobTitle = resultSet.getString("job_title");
                String healthInsuranceNumber = resultSet.getString("health_insurance_number");
                String laborInsuranceNumber = resultSet.getString("labor_insurance_number");
                String residenceCardNumber = resultSet.getString("residence_card_number");
                String periodOfStay = resultSet.getString("period_of_stay");
                String residenceStatus = resultSet.getString("residence_status");

                EmployeeObj obj = new EmployeeObj();
                obj.setEmployeeCode(employeeCode);
                obj.setName(name);
                obj.setKatakana(katakana);
                obj.setBirth(birth);
                obj.setPhoneNumber(phoneNumber);
                obj.setEmail(email);
                obj.setDateOfJoining(dateOfJoining);
                obj.setDateOfResignation(dateOfResignation);
                obj.setPostalCode(postalCode);
                obj.setAddress(address);
                obj.setNationality(nationality);
                obj.setContractType(contractType);
                obj.setSalaryType(salaryType);
                obj.setJobTitle(jobTitle);
                obj.setHealthInsuranceNumber(healthInsuranceNumber);
                obj.setLaborInsuranceNumber(laborInsuranceNumber);
                obj.setResidenceCardNumber(residenceCardNumber);
                obj.setPeriodOfStay(periodOfStay);
                obj.setResidenceStatus(residenceStatus);

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

    public List<EmployeeObj> setEmployeeList() throws SQLException {

        List<EmployeeObj> list = new ArrayList<EmployeeObj>();

        String jdbcUrl = "jdbc:postgresql://localhost:5432/zhao";
        String username = "postgres";
        String password = "postgres";

        try {
            // 1. 注册 PostgreSQL 驱动程序
            Class.forName("org.postgresql.Driver");
            // 2. 建立数据库连接
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. 创建 SQL 语句
            String sql = "SELECT * FROM EmployeeInfo WHERE employeeCode = ?";

            // 4. 创建 Statement 对象
            Statement statement = connection.createStatement();

            // 5. 执行查询并获取结果集
            ResultSet resultSet = statement.executeQuery(sql);

            // 6. 处理结果集
            while (resultSet.next()) {
                String employeeCode = resultSet.getString("employeeCode");
                String name = resultSet.getString("name");

                EmployeeObj obj = new EmployeeObj();
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

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        return list;
    }

}
