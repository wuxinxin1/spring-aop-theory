package com.wxx.aop.springaspectj;

import com.wxx.aop.springaspectj.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * 使用springaop自动生成一批代理对象
 * Created by wuxinxin on 2018/12/13.
 */
public class Test {

    public static void main(String[] args) {

        String path="beans2.xml";

        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext(path);

        UserServiceImpl userService = classPathXmlApplicationContext.getBean("userService", UserServiceImpl.class);


        userService.delete();
        userService.add();
        userService.select();

    }

}
