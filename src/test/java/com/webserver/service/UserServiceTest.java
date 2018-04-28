package com.webserver.service;

import com.webserver.dao.TbUserMapper;
import com.webserver.model.mo.TbUser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/3/8
 * @Time:17:47
 * @JDK versions: 1.8.0_101
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/spring/spring-dao.xml"})
public class UserServiceTest {
    private ApplicationContext applicationContext;

    @Resource
    private TbUserMapper tbUserMapper;

    @Before
    public void before() {
        String[] strings = new String[]{"spring/spring-service.xml", "spring/spring-dao.xml"};
//        String strings = "spring/spring-dao.xml";
        applicationContext = new ClassPathXmlApplicationContext(strings);
    }

    @Test
    public void testFindUserByUserName(){
        System.out.println(tbUserMapper.findUserByUserName("test"));

    }





}
