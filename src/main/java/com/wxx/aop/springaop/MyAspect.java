package com.wxx.aop.springaop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * spring-aop联盟类型的通知，需要实现各种类型通知的接口，方法名称确定
 * 通知（环绕通知，需要自己手动调用）---不算切面，切面是由通知和切点组成的
 * Created by wuxinxin on 2018/12/13.
 *
 * aspects类型通知如下：
 * before ,afterReturning,around,afterThrowing,after
 *
 *
 * spring-aop规范：aopalliance
 * spring-aop实现：springframword.aop
 *
 * aspectj规范：aspectjweaver
 * aspectj实现：aspects
 */
public class MyAspect implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("====before1");
        Object proceed = invocation.proceed();
        System.out.println("====after1");
        return proceed;
    }
}
