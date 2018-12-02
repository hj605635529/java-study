package com.qunar.hotel.enums;


public enum EmpStatus {
    LOGIN(100,"用户登录"),LOGOUT(200,"用户登出"),REMOVE(300,"用户不存在");


    private Integer code;
    private String msg;
    private EmpStatus(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public  static EmpStatus getEmpStatusbyCode(Integer code){
        for (EmpStatus emp:EmpStatus.values()) {
            if (emp.code.equals(code)){
                return emp;
            }
        }
        return LOGOUT;
    }
}
