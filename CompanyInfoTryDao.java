/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trymyself.newpackage;

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
public class CompanyInfoTryDao {

    public void addCompanyInfoTry(CompanyObjTry companyObjTry) {

        String jdbcUrl = "jdbc:postgresql://localhost:5432/zhao";
        String username = "postgres";
        String password = "postgres";

        try {
            // 1. 注册 PostgreSQL 驱动程序
            Class.forName("org.postgresql.Driver");
            // 2. 建立数据库连接
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. 创建 SQL 语句
//            String sql = "INSERT INTO CompanyiInfoTry (companyname, position, name, email) VALUES"
//                    + "(textCompany', 'textKatakaki', 'textName', 'textEmail');";
            StringBuffer sb = new StringBuffer();
            sb.append("INSERT INTO CompanyiInfoTry (companyname, position, name, email) VALUES(");
            sb.append("'" + companyObjTry.getCompanyName() + "',");
            sb.append("'" + companyObjTry.getPosition() + "',");
            sb.append("'" + companyObjTry.getName() + "',");
            sb.append("'" + companyObjTry.getEmail() + "');");
            System.out.println(sb.toString());

            // 4. 创建 Statement 对象
            Statement statement = connection.createStatement();

            // 5. 执行查询并获取结果集
            statement.executeUpdate(sb.toString());

            // 7. 关闭资源
            statement.close();
            connection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CompanyInfoTryDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CompanyInfoTryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<CompanyObjTry> getCompanyInfoTry() {

        List<CompanyObjTry> list = new ArrayList<CompanyObjTry>();

        String jdbcUrl = "jdbc:postgresql://localhost:5432/zhao";
        String username = "postgres";
        String password = "postgres";

        try {
            // 1. 注册 PostgreSQL 驱动程序
            Class.forName("org.postgresql.Driver");
            // 2. 建立数据库连接
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. 创建 SQL 语句
            String sql = "select * from CompanyiInfoTry;";

            // 4. 创建 Statement 对象
            Statement statement = connection.createStatement();

            // 5. 执行查询并获取结果集
            ResultSet resultSet = statement.executeQuery(sql);

            // 6. 处理结果集
            while (resultSet.next()) {
                String companyname = resultSet.getString("companyname");
                String position = resultSet.getString("position");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");

                CompanyObjTry obj = new CompanyObjTry();
                obj.setCompanyName(companyname);
                obj.setPosition(position);
                obj.setName(name);
                obj.setEmail(email);
                list.add(obj);

            }

            // 7. 关闭资源
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CompanyInfoTryDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CompanyInfoTryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

}
