package com.qunar.hotel.bean;

import com.qunar.hotel.enums.EmpStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jia.huang
 * @date 2018/12/2
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    /**
     * id
     */
    private  int id;
    /**
     * 名字
     */
    private String lastName;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 性别
     */
    private String gender;
    /**
     * 员工状态
     */
    private EmpStatus empStatus= EmpStatus.LOGOUT;
}
