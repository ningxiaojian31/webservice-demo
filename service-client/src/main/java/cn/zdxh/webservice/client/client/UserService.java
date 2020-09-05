package cn.zdxh.webservice.client.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.0
 * 2020-09-05T15:35:45.461+08:00
 * Generated source version: 3.4.0
 *
 */
@WebService(targetNamespace = "http://service.server.webservice.zdxh.cn/", name = "UserService")
@XmlSeeAlso({ObjectFactory.class})
public interface UserService {

    @WebMethod
    @RequestWrapper(localName = "addUser", targetNamespace = "http://service.server.webservice.zdxh.cn/", className = "cn.zdxh.webservice.client.client.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://service.server.webservice.zdxh.cn/", className = "cn.zdxh.webservice.client.client.AddUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String addUser(

        @WebParam(name = "arg0", targetNamespace = "")
                User arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getUser", targetNamespace = "http://service.server.webservice.zdxh.cn/", className = "cn.zdxh.webservice.client.client.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://service.server.webservice.zdxh.cn/", className = "cn.zdxh.webservice.client.client.GetUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public User getUser(

        @WebParam(name = "username", targetNamespace = "")
        java.lang.String username
    );

    @WebMethod
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://service.server.webservice.zdxh.cn/", className = "cn.zdxh.webservice.client.client.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://service.server.webservice.zdxh.cn/", className = "cn.zdxh.webservice.client.client.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello(

        @WebParam(name = "userName", targetNamespace = "")
        java.lang.String userName
    );
}