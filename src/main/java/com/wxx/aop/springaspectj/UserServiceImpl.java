package com.wxx.aop.springaspectj;

/**
 * 目标类
 * Created by wuxinxin on 2018/12/13.
 */
public class UserServiceImpl {

    public void add() {
        System.out.println("jdk proxy add2");
    }

    public String delete() {
        System.out.println("jdk proxy delete2");
        return "hello";
    }

    public void select() {
        System.out.println("jdk proxy select2");
    }
}
