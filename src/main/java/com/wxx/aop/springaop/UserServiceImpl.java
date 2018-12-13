package com.wxx.aop.springaop;

import com.wxx.aop.jdkproxy.UserService;

/**
 * 目标类
 * Created by wuxinxin on 2018/12/13.
 */
public class UserServiceImpl{

    public void add() {
        System.out.println("jdk proxy add1");
    }

    public void delete() {
        System.out.println("jdk proxy delete1");
    }

    public void select() {
        System.out.println("jdk proxy select1");
    }
}
