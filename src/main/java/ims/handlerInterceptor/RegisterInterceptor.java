package ims.handlerInterceptor;

import ims.PO.User;
import ims.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xiangang on 16/11/18.
 */
public class RegisterInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    UserService userService;
    @Autowired
    User user;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        boolean flag = true;
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        user.setUserName(userName);
        user.setPassword(password);

        flag = userService.saveUser(user);

        if (!flag){
            response.sendRedirect("/registation.jsp");
        }

        return flag;
    }
}
