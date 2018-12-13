package com.wxx.aop.jdkproxy;

/**
 * 目标类
 * Created by wuxinxin on 2018/12/13.
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("jdk proxy add");
    }

    @Override
    public void delete() {
        System.out.println("jdk proxy delete");
    }

    @Override
    public void select() {
        System.out.println("jdk proxy select");
    }
}
