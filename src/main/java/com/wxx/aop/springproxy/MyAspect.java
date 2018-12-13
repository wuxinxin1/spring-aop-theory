package com.wxx.aop.springproxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 通知---不算切面，切面是由通知和切点组成的
 * Created by wuxinxin on 2018/12/13.
 */
public class MyAspect implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("====before");
        Object proceed = invocation.proceed();
        System.out.println("====after");
        return proceed;
    }
}
