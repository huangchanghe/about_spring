package com.hch.dao.impl;

import com.hch.dao.BankDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class BankDaoImpl  implements BankDao {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void inMoney(int money, int userId) {
        String sql="update bank2 set count=count+? where userId=?";
        Object[] params=new Object[]{money,userId};
        jdbcTemplate.update(sql,params);
    }

    @Override
    public void outMoney(int money, int userId) {
        String sql="update bank set count=count-? where userId=?";
        Object[] params=new Object[]{money,userId};
        jdbcTemplate.update(sql,params);
    }
}
