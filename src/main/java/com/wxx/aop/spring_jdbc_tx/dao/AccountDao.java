package com.wxx.aop.spring_jdbc_tx.dao;

/**
 * Created by wuxinxin on 2018/12/18.
 */
public interface AccountDao {
    void into(String inner,int money);
    void out(String outter,int money);
}
