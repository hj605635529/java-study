package com.qunar.hotel.typehandler;

import com.qunar.hotel.enums.EmpStatus;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 继承BaseTypeHandler的方式来实现自定义枚举实现类
 * @author jia.huang
 * @date 2018/12/3
 */

@Slf4j
public class EmpStatusTypeHandler2 extends BaseTypeHandler<EmpStatus> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, EmpStatus parameter, JdbcType jdbcType) throws SQLException {
        log.info("要保存的状态码："+parameter.getCode());
        ps.setInt(i, parameter.getCode());
    }

    @Override
    public EmpStatus getNullableResult(ResultSet rs, String columnName) throws SQLException {
        //需要根据从数据库中拿到的枚举的状态码返回一个枚举对象
        int code = rs.getInt(columnName);
        log.info("从数据库中获取的状态码："+code);
        EmpStatus status = EmpStatus.getEmpStatusbyCode(code);
        return status;
    }

    @Override
    public EmpStatus getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        //需要根据从数据库中拿到的枚举的状态码返回一个枚举对象
        int code = rs.getInt(columnIndex);
        log.info("从数据库中获取的状态码："+code);
        EmpStatus status = EmpStatus.getEmpStatusbyCode(code);
        return status;
    }

    @Override
    public EmpStatus getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        //需要根据从数据库中拿到的枚举的状态码返回一个枚举对象
        int code = cs.getInt(columnIndex);
        log.info("从数据库中获取的状态码："+code);
        EmpStatus status = EmpStatus.getEmpStatusbyCode(code);
        return status;
    }
}
