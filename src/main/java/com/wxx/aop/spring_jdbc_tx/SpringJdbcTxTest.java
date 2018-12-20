package com.wxx.aop.spring_jdbc_tx;

import com.wxx.aop.spring_jdbc_tx.service.AccountService;
import com.wxx.aop.springjdbc.dao.UserDao;
import com.wxx.aop.springjdbc.domain.User;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

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
        String path="beans4.xml";

        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext(path);

        AccountService accountService = classPathXmlApplicationContext.getBean("accountService", AccountService.class);


        accountService.transfer("刘静","吴鑫鑫",100);
    }

}
