package ims.controller;

import ims.PO.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by xiangang on 16/11/17.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/user")
    public String loginController(@ModelAttribute("user") User user, HttpServletRequest request) {
        /*
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("main");
        return mv;
        */
        System.out.println(request.getContextPath().toString());
        return "redirect:/user/main";
    }

    @RequestMapping(value = "/user/main")
    public ModelAndView toMainPage(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("user");
        return new ModelAndView("main")
                .addObject("username", username);
    }

    @RequestMapping(value = "/register")
    public String registerController(){
        return "redirect:/index.jsp";
    }
}
