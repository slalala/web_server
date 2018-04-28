package com.webserver.dao;

import com.webserver.model.mo.TbUser;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/3/8
 * @Time:17:36
 * @JDK versions: 1.8.0_101
 */
public class UserTest {
    private ApplicationContext ac;
    @Before
    public void before() {
        String strings = "spring/spring-dao.xml";
        ac = new ClassPathXmlApplicationContext(strings);
    }

//    @Test
//    public void test1(){
//        TbUserMapper tbUserMapper = ac.getBean("tbUserMapper", TbUserMapper.class);
//        TbUser tbUser = tbUserMapper.findUserById(new Long(1));
//        System.out.println(tbUser);
//    }
}
