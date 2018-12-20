package com.wxx.aop.spring_jdbc_tx2;

import com.wxx.aop.spring_jdbc_tx2.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring jdbc 编程
 * Created by wuxinxin on 2018/12/18.
 */
public class SpringJdbcTxTest {

    public static void main(String[] args) {
        jdbcTxTest1();
    }

    /**
     * JdbcDaoSuppor
     * 使用容器的依赖注入
     */
    private static void jdbcTxTest1(){
        String path="beans5.xml";

        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext(path);

        AccountService accountService = classPathXmlApplicationContext.getBean("proxyAccountService", AccountService.class);


        accountService.transfer("刘静","吴鑫鑫",100);
    }

}
