package com.wxx.aop.cjlibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wuxinxin on 2018/12/13.
 */
public class UserServiceProxyBeanFactory {

    public static UserServiceImpl getInstance(){
        /**
         * 目标类
         */
        final UserServiceImpl userService=new UserServiceImpl();

        /**
         * 切面类
         */
        final MyAspect myAspect=new MyAspect();

        /**
         * 使用cjlib,生成需要增强类的子类
         */

        Enhancer enhancer=new Enhancer();

        enhancer.setSuperclass(userService.getClass());

        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAspect.before();
                Object invoke = method.invoke(userService, objects);
                myAspect.after();
                return invoke;
            }
        });

        UserServiceImpl userServiceProxy=(UserServiceImpl)enhancer.create();

        return userServiceProxy;
    }

}
