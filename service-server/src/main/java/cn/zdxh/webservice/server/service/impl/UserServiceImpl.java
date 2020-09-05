package cn.zdxh.webservice.server.service.impl;

import cn.zdxh.webservice.server.service.UserService;
import cn.zdxh.webservice.server.service.vo.User;

import javax.jws.WebService;

@WebService(name = "userService",targetNamespace = "http://www.hrabbit.xin/",endpointInterface = "cn.zdxh.webservice.server.service.UserService")
public class UserServiceImpl implements UserService {
    /**
     * 用户say:hello word Webservice
     * @param userName
     * @return
     */
    @Override
    public String sayHello(String userName) {
        return userName+":say hello word WebService!";
    }

    @Override
    public String addUser(User user) {
        System.out.println(user);
        return "添加用户成功";
    }

    @Override
    public User getUser(String userName) {
        User user = new User();
        user.setUsername(userName);
        user.setPassword("123456");
        return user;
    }
}