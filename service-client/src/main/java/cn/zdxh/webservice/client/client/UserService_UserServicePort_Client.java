
package cn.zdxh.webservice.client.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 3.4.0
 * 2020-09-05T15:35:45.341+08:00
 * Generated source version: 3.4.0
 *
 */
public final class UserService_UserServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.hrabbit.xin/", "UserServiceImplService");

    private UserService_UserServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = UserServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        UserServiceImplService ss = new UserServiceImplService(wsdlURL, SERVICE_NAME);
        UserService port = ss.getUserServicePort();

        {
        System.out.println("Invoking addUser...");
        User _addUser_arg0 = null;
        java.lang.String _addUser__return = port.addUser(_addUser_arg0);
        System.out.println("addUser.result=" + _addUser__return);


        }
        {
        System.out.println("Invoking getUser...");
        java.lang.String _getUser_username = "";
        User _getUser__return = port.getUser(_getUser_username);
        System.out.println("getUser.result=" + _getUser__return);


        }
        {
        System.out.println("Invoking sayHello...");
        java.lang.String _sayHello_userName = "";
        java.lang.String _sayHello__return = port.sayHello(_sayHello_userName);
        System.out.println("sayHello.result=" + _sayHello__return);


        }

        System.exit(0);
    }

}
