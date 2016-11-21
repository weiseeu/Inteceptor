package ims.handlerInterceptor;

import ims.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by xiangang on 16/11/17.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = true;
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            flag = userService.selectByUserName(userName, password);
            if (flag){
                session.setAttribute("user",userName);
            }
        }

        if (!flag){
            response.sendRedirect("index.jsp");
        }
        return flag;

    }
}
