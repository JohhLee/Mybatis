package com.lee.dao;

import com.lee.pojo.User;
import com.lee.utils.MybatisUtils;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao  = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao  = sqlSession.getMapper(UserDao.class);

        userDao.delete(1);

        List<User> userList = userDao.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao  = sqlSession.getMapper(UserDao.class);

        userDao.insert(new User(1,"老刘","123"));

        List<User> userList = userDao.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.commit();
        sqlSession.close();
    }


}
