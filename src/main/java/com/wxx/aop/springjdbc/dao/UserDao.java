package com.wxx.aop.springjdbc.dao;

import com.wxx.aop.springjdbc.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 直接注入jdbcTemplate
 * Created by wuxinxin on 2018/12/18.
 */
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void update(User user){
        jdbcTemplate.update("update user set username=? ,password=? where id=?",
                user.getUserName(),user.getPassword(),user.getId());
    }
}
