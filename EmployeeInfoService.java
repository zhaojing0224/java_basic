/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsys.service;

import hrsys.dao.EmployeeInfoDao;
import hrsys.obj.EmployeeObj;

/**
 *
 * @author user
 */
public class EmployeeInfoService {
    
    
    public void addEmployeeInfo(EmployeeObj employeeObj){
        
        EmployeeInfoDao employeeInfoDao = new EmployeeInfoDao();
        
        employeeInfoDao.addEmployeeInfo(employeeObj);
        
    }
    
}
