package org.example;

import static org.junit.Assert.assertTrue;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.MenuMapper;
import org.example.entity.Menu;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private SqlSession sqlSession;
    private MenuMapper mapper;
    private SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

    @Test
    public void testUpdate(){
        Menu menu = new Menu(1,"2qweqw");
        Integer update = mapper.update(menu);
        System.out.println(update);
    }

    @Test
    public void testInsert() throws ParseException {
        Menu menu = new Menu("测试",sf.parse("2021-01-01"));
        Integer update = mapper.insert(menu);
        System.out.println(update);
        sqlSession.commit();
    }

    @Before
    public void openSqlSession() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        this.sqlSession = build.openSession();
        this.mapper = sqlSession.getMapper(MenuMapper.class);
    }


    @After
    public void closeSqlSession(){
        this.sqlSession.close();
    }
}
