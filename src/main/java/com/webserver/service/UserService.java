package com.webserver.service;

import com.webserver.model.mo.TbUser;

import java.util.ArrayList;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/3/8
 * @Time:17:11
 * @JDK versions: 1.8.0_101
 */
public interface UserService {

    public Integer insertUserInfo(TbUser user);

    public ArrayList<TbUser> findUserByUserName(String userName);
}
