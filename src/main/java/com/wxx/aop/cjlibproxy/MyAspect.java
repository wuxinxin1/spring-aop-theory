package com.wxx.aop.cjlibproxy;

/**
 * 切面类
 * Created by wuxinxin on 2018/12/13.
 */
public class MyAspect {

    public void before(){
        System.out.println("===before===");
    }

    public void after(){
        System.out.println("===after===");
    }

}
