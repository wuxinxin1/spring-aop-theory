package com.wxx.aop.springaspectj;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;

/**
 * aspectj 定义通知
 *
 */
public class MyAspect{

    /**
     * 前置通知
     */
    public void berore(){
        System.out.println("------berore");
    }

    /**
     * 后置通知---带返回值
     * 注意：如果带有返回值，返回值必须是第二个参数,并且第二个参数必须是object类型
     */
    public void  afterReturning(JoinPoint joinPoint,Object object){
        System.out.println("------afterReturning:"+joinPoint.getSignature().getName()+"返回值:"+object);
    }

    /**
     * 后置通知---不带返回值
     * 注意：如果带有返回值，返回值必须是第二个参数,并且第二个参数必须是object类型
     */
    /*public void  afterReturning(){
        System.out.println("------afterReturning:");
    }*/

}
