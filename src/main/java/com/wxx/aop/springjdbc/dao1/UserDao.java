package com.wxx.aop.springjdbc.dao1;

import com.wxx.aop.springjdbc.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * 继承JdbcDaoSupport，JdbcDaoSuppor会直接创建jdbctemplate,只需要直接注入数据源即可
 * Created by wuxinxin on 2018/12/18.
 */
public class UserDao extends JdbcDaoSupport{

    public void update(User user){
        this.getJdbcTemplate().update("update user set username=? ,password=? where id=?",
                user.getUserName(),user.getPassword(),user.getId());
    }

    public List<User> findAll(){
        return this.getJdbcTemplate().query("select * from user",new BeanPropertyRowMapper(User.class));
    }
}
