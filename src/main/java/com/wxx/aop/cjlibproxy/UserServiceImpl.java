package com.wxx.aop.cjlibproxy;

/**
 * 目标类
 * Created by wuxinxin on 2018/12/13.
 */
public class UserServiceImpl {

    public void add() {
        System.out.println("jdk proxy add");
    }

    public void delete() {
        System.out.println("jdk proxy delete");
    }

    public void select() {
        System.out.println("jdk proxy select");
    }
}
