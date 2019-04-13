package com.itheima.UserTest;



import com.itheima.dao.UserMapper;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @author zwhui
 */
public class UserTest  {
    private static InputStream is;
    static {
        try {
            is = Resources.getResourceAsStream("SqlConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void usertest() throws IOException {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.findAll();
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
        is.close();
    }
    @Test
    public void findNameTest() throws IOException {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String name = mapper.findName();
        System.out.println(name);
    }
}
