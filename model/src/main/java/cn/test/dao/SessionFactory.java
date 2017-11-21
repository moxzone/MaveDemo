package cn.test.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SessionFactory {
    private static SqlSessionFactory sessionFactory = null;

    static {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(is);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return sessionFactory.openSession();
    }

    public static SqlSessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
