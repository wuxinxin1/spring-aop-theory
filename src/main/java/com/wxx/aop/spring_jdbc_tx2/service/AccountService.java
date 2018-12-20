package com.wxx.aop.spring_jdbc_tx2.service;

/**
 * Created by wuxinxin on 2018/12/18.
 */
public interface AccountService {

    void transfer(String outter, String inner, int money);

}
