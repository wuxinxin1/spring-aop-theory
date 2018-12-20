package com.wxx.aop.springjdbc;

import com.wxx.aop.springaspectj.UserServiceImpl;
import com.wxx.aop.springjdbc.dao.UserDao;
import com.wxx.aop.springjdbc.domain.User;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.List;

/**
 * spring jdbc 编程
 * Created by wuxinxin on 2018/12/18.
 */
public class SpringJdbcTest {

    public static void main(String[] args) {
        jdbcApiTest3();
    }

    /**
     * JdbcDaoSuppor
     * 使用容器的依赖注入
     */
    private static void jdbcApiTest3(){
        String path="beans31.xml";

        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext(path);

        com.wxx.aop.springjdbc.dao1.UserDao userDao = classPathXmlApplicationContext.getBean("userDao", com.wxx.aop.springjdbc.dao1.UserDao.class);

        List<User> all = userDao.findAll();

        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }

    }

    /**
     * jdbctemplate
     * 使用容器的依赖注入
     */
    private static void jdbcApiTest2(){
        User user=new User();

        user.setId(1);
        user.setUserName("刘静");
        user.setPassword("123");

        String path="beans3.xml";

        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext(path);

        UserDao userDao = classPathXmlApplicationContext.getBean("userDao", UserDao.class);

        userDao.update(user);
    }

    /**
     * jdbctemplate
     * 使用原始api
     */
    private static  void  jdbcApiTest1(){

        User user=new User();
        user.setUserName("吴鑫鑫");
        user.setPassword("123");

        //配置数据源
        BasicDataSource basicDataSource=new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/spring");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("root");

        //创建模板
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(basicDataSource);

        //开始操作
        jdbcTemplate.update("insert into user(name,password) values(?,?)",
                user.getUserName(),user.getPassword());


    }

}
