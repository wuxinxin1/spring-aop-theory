package com.wxx.aop.spring_jdbc_tx.service.impl;

import com.wxx.aop.spring_jdbc_tx.dao.AccountDao;
import com.wxx.aop.spring_jdbc_tx.service.AccountService;

/**
 * Created by wuxinxin on 2018/12/18.
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outter,String inner, int money) {
        accountDao.out(outter,money);
        //断电
        int a=10/0;
        accountDao.into(inner,money);
    }
}
