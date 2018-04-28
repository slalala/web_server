package com.webserver.dao;

import com.webserver.model.mo.TbUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface TbUserMapper {
    /**
     * 创建新用户
     * @param userInfo
     */
    void insertUserInfo(@Param("userInfo") TbUser userInfo);

    /**
     * 通过用户名查找用户
     * @param userName 用户名
     * @return 用户列表
     */
    ArrayList<TbUser> findUserByUserName(@Param("userName")String userName);
}
