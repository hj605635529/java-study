package com.qunar.hotel.typehandler;

import com.qunar.hotel.enums.EmpStatus;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author jia.huang
 * @date 2018/12/2
 */
@Slf4j
public class EmpStatusTypeHandler implements TypeHandler<EmpStatus> {
    /**
     *定义当前数据如何保存到数据库中
     * @param preparedStatement
     * @param i
     * @param parameter
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, EmpStatus parameter, JdbcType jdbcType) throws SQLException {
        log.info("要保存的状态码："+parameter.getCode());
        preparedStatement.setInt(i, parameter.getCode());
    }


    @Override
    public EmpStatus getResult(ResultSet rs, String columnName) throws SQLException {
        //需要根据从数据库中拿到的枚举的状态码返回一个枚举对象
        int code = rs.getInt(columnName);
        log.info("从数据库中获取的状态码："+code);
        EmpStatus status = EmpStatus.getEmpStatusbyCode(code);
        return status;
    }

    @Override
    public EmpStatus getResult(ResultSet rs, int columnIndex) throws SQLException {
        //需要根据从数据库中拿到的枚举的状态码返回一个枚举对象
        int code = rs.getInt(columnIndex);
        log.info("从数据库中获取的状态码："+code);
        EmpStatus status = EmpStatus.getEmpStatusbyCode(code);
        return status;
    }

    /**
     * 存储过程
     * @param cs
     * @param columnIndex
     * @return
     * @throws SQLException
     */
    @Override
    public EmpStatus getResult(CallableStatement cs, int columnIndex) throws SQLException {
        //需要根据从数据库中拿到的枚举的状态码返回一个枚举对象
        int code = cs.getInt(columnIndex);
        log.info("从数据库中获取的状态码："+code);
        EmpStatus status = EmpStatus.getEmpStatusbyCode(code);
        return status;
    }


}
