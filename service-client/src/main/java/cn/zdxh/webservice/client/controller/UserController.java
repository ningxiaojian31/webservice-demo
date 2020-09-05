package cn.zdxh.webservice.client.controller;

import cn.zdxh.webservice.client.client.User;
import cn.zdxh.webservice.client.client.UserService;
import cn.zdxh.webservice.client.client.UserServiceImplService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserServiceImplService ss = new UserServiceImplService();
    private UserService userService = ss.getUserServicePort();

    @GetMapping("/test")
    public String test(){
        String res = userService.sayHello("宁晓健");
        return res;
    }

    @GetMapping("/addUser")
    public String addUser(){
        User user = new User();
        user.setUsername("ningxiaojian");
        user.setPassword("25802580");
        userService.addUser(user);
        return "添加用户成功";
    }

    @GetMapping("/getUser")
    public User getUser(){
        User user = userService.getUser("nxj");
        return user;
    }
}
