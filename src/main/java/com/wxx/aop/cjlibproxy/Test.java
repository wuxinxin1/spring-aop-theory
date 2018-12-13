package com.wxx.aop.cjlibproxy;

/**
 * Created by wuxinxin on 2018/12/13.
 */
public class Test {

    public static void main(String[] args) {
        UserServiceImpl instance = UserServiceProxyBeanFactory.getInstance();
        instance.add();

    }

}
