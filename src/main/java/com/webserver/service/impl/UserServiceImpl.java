package com.webserver.service.impl;

import com.webserver.dao.TbUserMapper;
import com.webserver.model.mo.TbUser;
import com.webserver.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;



@Service
public class UserServiceImpl implements UserService {

    private static Logger LOGGER = Logger.getLogger(UserServiceImpl.class);

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public ArrayList<TbUser> findUserByUserName(String userName) {
        return tbUserMapper.findUserByUserName(userName);
    }

    @Override
    public Integer insertUserInfo(TbUser user) {
        //用户名重复
        if (tbUserMapper.findUserByUserName(user.getUserName()).size() >= 1) {
            LOGGER.info(user.getUserName() + " userName repeat");
            return 0;
        }
        System.out.println(user.getUserName());
        System.out.println(user.getIphone());
        System.out.println(user.getPass());
        System.out.println(user.getSalt());


        tbUserMapper.insertUserInfo(user);
        return 1;
    }
}
