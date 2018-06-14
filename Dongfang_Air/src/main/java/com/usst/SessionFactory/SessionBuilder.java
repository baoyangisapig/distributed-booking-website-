package com.usst.SessionFactory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 包杨 on 2017/12/5.
 */
public class SessionBuilder {
    public SqlSession SessionProducer ()throws Exception {
        // 读取mybatis-config.xml文件

        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 初始化mybatis，创建SqlSessionFactory类的实例
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建Session实例
        SqlSession session = sqlSessionFactory.openSession();
        return session;
    }
}
