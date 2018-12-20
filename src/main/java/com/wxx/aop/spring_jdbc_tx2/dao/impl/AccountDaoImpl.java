package com.wxx.aop.spring_jdbc_tx2.dao.impl;

import com.wxx.aop.spring_jdbc_tx2.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by wuxinxin on 2018/12/18.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void into(String inner, int money) {
        this.getJdbcTemplate().update("update account set money=money+? where username=?",money,inner);
    }

    @Override
    public void out(String outter, int money) {
        this.getJdbcTemplate().update("update account set money=money-? where username=?",money,outter);
    }
}
