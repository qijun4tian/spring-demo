package com.qijun.spring.demo.service.impl;

import com.qijun.spring.demo.entity.UserInfo;
import com.qijun.spring.demo.mapper.UserPasswordMapper;
import com.qijun.spring.demo.service.UserPasswordService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.nio.cs.FastCharsetProvider;

import javax.sql.DataSource;

/**
 * Created by qijun123 on 2017/9/16.
 */
@Service
@Slf4j
public class UserPasswordServiceImpl implements UserPasswordService {


    @Override
    public void  getUserPassword(String userName) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/loginfo?characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull";
        String username = "root";
        String password = "123456";
        //创建使用缓存池的数据源
        /*
         * <dataSource type="POOLED">
                <property name="driver" value="${jdbc.driverClassName}"/>
                <property name="url" value="${jdbc.url}"/>
                <property name="username" value="${jdbc.username}"/>
                <property name="password" value="${jdbc.password}"/>
            </dataSource>
         */
        DataSource dataSource = new PooledDataSource(driver, url, username, password);

        //创建事务
        /*
         * <transactionManager type="JDBC" />
         */
        TransactionFactory transactionFactory = new JdbcTransactionFactory();

        Environment environment = new Environment("development", transactionFactory, dataSource);

        Configuration configuration = new Configuration(environment);
        //加入资源
        /*
         * <mapper resource="ssm/BlogMapper.xml"/>
         */
        configuration.addMapper(UserPasswordMapper.class);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        System.out.println(sqlSessionFactory);
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
         try {
             UserPasswordMapper userPasswordMapper = sqlSession.getMapper(UserPasswordMapper.class);

             userPasswordMapper.insert(21,"11");
             userPasswordMapper.insert(22,"12");
             sqlSession.commit();


             sqlSession.commit();
         }catch (Exception e)

         {
             log.info("hello world");

             sqlSession.rollback();
         }
        try {
            UserPasswordMapper userPasswordMapper = sqlSession.getMapper(UserPasswordMapper.class);

            userPasswordMapper.insert(20,"11");
            userPasswordMapper.insert("16","12");
            sqlSession.commit();


            sqlSession.commit();
        }catch (Exception e)

        {
            log.info("hello world");

            sqlSession.rollback();
        }



    }

}
