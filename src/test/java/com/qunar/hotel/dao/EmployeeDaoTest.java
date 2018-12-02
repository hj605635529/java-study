package com.qunar.hotel.dao;

import com.qunar.hotel.BaseTest;
import com.qunar.hotel.bean.Employee;
import com.qunar.hotel.enums.EmpStatus;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jia.huang
 * @date 2018/12/3
 */
@Slf4j
public class EmployeeDaoTest extends BaseTest {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testAdd(){
        Employee employee = new Employee();
        employee.setEmail("jia.huang@example.com");
        employee.setGender("1");
        employee.setEmpStatus(EmpStatus.REMOVE);
        employee.setLastName("jia");

        employeeDao.addEmp(employee);

        System.out.println(employee);



//        employeeDao.addEmp(employee);
//        log.info("employee的id是{}",employee.getId());
//        employeeDao.getEmpById(1);
    }

    @Test
    public void testSelect(){
        Employee emp = employeeDao.getEmpById(5);
        System.out.println(emp.getEmpStatus());
    }
}
