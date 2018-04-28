package com.webserver.web.action;

import com.alibaba.fastjson.JSONObject;
import com.sun.xml.internal.bind.v2.TODO;
import com.webserver.model.mo.TbUser;
import com.webserver.service.UserService;
import com.webserver.service.impl.UserServiceImpl;
import com.webserver.util.Encryption;
import com.webserver.util.Result;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/3/10
 * @Time:11:06
 * @JDK versions: 1.8.0_101
 */
@Controller
@RequestMapping("user")
public class UserAction {
    @Resource
    UserService userService;

    private static Logger LOGGER =  Logger.getLogger(UserAction.class);

    @RequestMapping("test.php")
    public String test(){
        return "test";
    }

//    @RequestMapping("selectUserById")
//    public @ResponseBody JSONObject selectUserById(Long userId){
//        TbUser tbUser = userService.selectUserById(userId);
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("user",tbUser);
//        return jsonObject;
//    }

    /**
     * 校验手机号
     * @param iphone
     * @return
     */
    private boolean checkIphone(Long iphone){
        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(iphone+"");
        return m.matches();
    }


    @RequestMapping(value = "regist",method = RequestMethod.GET)
    public Result insert(@RequestParam(value = "iphone",required = false)String iphone,
                         @RequestParam(value = "userName",required = false)String userName,
                         @RequestParam(value = "pass",required = false)String pass){
        //TODO 手机验证码

        Long iphoneNumber = null;
        try {
            System.out.println(iphone+userName+pass);
            iphoneNumber = Long.parseLong(iphone);
        } catch (NumberFormatException e) {
            LOGGER.info(e.getMessage());
            return new Result("手机格式错误",0);
        }

        if(!checkIphone(iphoneNumber)){
            LOGGER.info(iphone+" 手机格式错误");
            return new Result("手机格式错误",0);
        }


        Encryption encryption = new Encryption();
        String passWord = encryption.getEncrypt(userName,encryption.getSalt(),pass);

        TbUser user = new TbUser(userName,iphoneNumber,encryption.getSalt(),passWord);

        if(userService.insertUserInfo(user) == 1){
            LOGGER.info(user+" 注册成功");
        }
        return new Result("",1);
    }
}
