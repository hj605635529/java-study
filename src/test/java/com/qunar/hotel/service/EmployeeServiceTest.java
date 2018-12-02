package com.qunar.hotel.service;

import com.qunar.hotel.BaseTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author jia.huang
 * @date 2018/12/3
 */
public class EmployeeServiceTest extends BaseTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void test(){
        employeeService.getEmps();
    }
}
