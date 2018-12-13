package com.wxx.aop.jdkproxy;

/**
 * Created by wuxinxin on 2018/12/13.
 */
public class Test {

    public static void main(String[] args) {
        UserService instance = UserServiceProxyBeanFactory.getInstance();
        instance.add();

    }

}
