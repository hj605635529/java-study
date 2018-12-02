package com.qunar.hotel.dao;

import com.qunar.hotel.bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author jia.huang
 * @date 2018/12/2
 */

@Repository
public interface EmployeeDao {

    public int addEmp(Employee employee);

    public Employee getEmpById(Integer id);

    public List<Employee> getEmps();
}
