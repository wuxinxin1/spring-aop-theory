package com.wxx.aop.springproxy;

import com.wxx.aop.jdkproxy.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * 手动使用spring工厂自动生成一个代理对象
 * Created by wuxinxin on 2018/12/13.
 */
public class Test {

    public static void main(String[] args) {

        String path="beans.xml";

        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext(path);

        UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);


        userService.add();

    }

}
