package com.qunar.hotel.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qunar.hotel.bean.Employee;
import com.qunar.hotel.dao.EmployeeDao;
import com.qunar.hotel.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jia.huang
 * @date 2018/12/3
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    /**
     * 利用分页插件分页查询数据
     * @return
     */
    @Override
    public void getEmps() {
        int pageNo = 10;
        int pageSize = 0;
       PageHelper.startPage(pageNo, pageSize);

        List<Employee> employeeList = employeeDao.getEmps();

       PageInfo page = new PageInfo(employeeList);

        System.out.println(page);

    }
}
