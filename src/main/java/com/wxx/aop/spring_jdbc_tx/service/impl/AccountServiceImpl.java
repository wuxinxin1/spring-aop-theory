package com.wxx.aop.spring_jdbc_tx.service.impl;

import com.wxx.aop.spring_jdbc_tx.dao.AccountDao;
import com.wxx.aop.spring_jdbc_tx.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by wuxinxin on 2018/12/18.
 */
public class AccountServiceImpl implements AccountService {


    /**
     * 使用transactionTemplate操作事务
     */
    private TransactionTemplate transactionTemplate;

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    @Override
    public void transfer(final String outter, final String inner, final int money) {
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                accountDao.out(outter,money);
                //断电
                int a=10/0;
                accountDao.into(inner,money);
                return null;
            }
        });

    }
}
