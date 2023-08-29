/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jp.tihtih.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CompanyInfoDao {

    public void addCompanyInfo(CompanyObj companyObj) {

        String jdbcUrl = "jdbc:postgresql://localhost:5432/zhao";
        String username = "postgres";
        String password = "postgres";

        try {
            // 1. 注册 PostgreSQL 驱动程序
            Class.forName("org.postgresql.Driver");
            // 2. 建立数据库连接
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. 创建 SQL 语句
//            String sql = "INSERT INTO CompanyiInfoDao (companyname, cr, name, email) VALUES"
//                    + "(textCompany', 'textKatakaki', 'textName', 'textEmail');";
            StringBuffer sb = new StringBuffer();
            sb.append("INSERT INTO CompanyiInfoDao (companyname, cr, name, email) VALUES(");
            sb.append("'" + companyObj.getCompanyName() + "',");
            sb.append("'" + companyObj.getCr() + "',");
            sb.append("'" + companyObj.getName() + "',");
            sb.append("'" + companyObj.getEmail() + "');");
            System.out.println(sb.toString());

            // 4. 创建 Statement 对象
            Statement statement = connection.createStatement();

            // 5. 执行查询并获取结果集
            statement.executeUpdate(sb.toString());

            // 7. 关闭资源
            statement.close();
            connection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<CompanyObj> getCompanyInfo() {

        List<CompanyObj> list = new ArrayList<CompanyObj>();

        String jdbcUrl = "jdbc:postgresql://localhost:5432/zhao";
        String username = "postgres";
        String password = "postgres";

        try {
            // 1. 注册 PostgreSQL 驱动程序
            Class.forName("org.postgresql.Driver");
            // 2. 建立数据库连接
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. 创建 SQL 语句
            String sql = "select * from CompanyiInfoDao;";

            // 4. 创建 Statement 对象
            Statement statement = connection.createStatement();

            // 5. 执行查询并获取结果集
            ResultSet resultSet = statement.executeQuery(sql);

            // 6. 处理结果集
            while (resultSet.next()) {
                String companyname = resultSet.getString("companyname");
                String cr = resultSet.getString("cr");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                
                CompanyObj obj = new CompanyObj();
                obj.setCompanyName(companyname);
                obj.setCr(cr);
                obj.setName(name);
                obj.setEmail(email);
                list.add(obj);

            }

            // 7. 关闭资源
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

}
