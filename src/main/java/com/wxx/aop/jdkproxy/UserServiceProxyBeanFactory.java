package com.wxx.aop.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wuxinxin on 2018/12/13.
 */
public class UserServiceProxyBeanFactory {

    public static UserService getInstance(){
        /**
         * 目标类
         */
        final UserService userService=new UserServiceImpl();

        /**
         * 切面类
         */
        final MyAspect myAspect=new MyAspect();

        /**
         * 使用jdk代理生成代理对象
         */
        UserService userServiceProxy=(UserService) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                myAspect.before();
                Object invoke = method.invoke(userService, args);
                myAspect.after();
               return invoke;
            }
        });
        return userServiceProxy;
    }

}
