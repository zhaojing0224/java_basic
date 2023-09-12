/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsys.service;

import hrsys.dao.EmployeeInfoDao;
import hrsys.obj.EmployeeObj;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class EmployeeInfoService {

    public void addEmployeeInfo(EmployeeObj employeeObj) {

        EmployeeInfoDao employeeInfoDao = new EmployeeInfoDao();

        employeeInfoDao.addEmployeeInfo(employeeObj);

    }

    public void setEmployeeInfo(EmployeeObj employeeObj) throws SQLException {

        EmployeeInfoDao employeeInfoDao = new EmployeeInfoDao();

        employeeInfoDao.setEmployeeList();

    }

    public List<EmployeeObj> getEmployeeInfoList() {

        EmployeeInfoDao employeeInfoDao = new EmployeeInfoDao();

        List<EmployeeObj> employeeObjList = employeeInfoDao.getEmployeeInfo();
        
        return employeeObjList;
    }

}
