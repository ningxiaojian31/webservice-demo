package cn.zdxh.webservice.server.service;

import cn.zdxh.webservice.server.service.vo.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface UserService {

    /**
     * 用户say:hello
     * @param userName
     * @return
     */
    @WebMethod
    public String sayHello(@WebParam(name = "userName") String userName);

    @WebMethod
    public String addUser(User user);

    @WebMethod
    public User getUser(@WebParam(name = "username") String userName);
}