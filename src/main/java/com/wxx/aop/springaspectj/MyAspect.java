package com.wxx.aop.springaspectj;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * aspectj 定义通知
 *
 */
public class MyAspect{

    public void berore(){
        System.out.println("------berore");
    }

}
