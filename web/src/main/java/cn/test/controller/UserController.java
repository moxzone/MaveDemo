package cn.test.controller;

import cn.test.domain.User;
import cn.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Controller
public class UserController{
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
//        model.addAttribute("command",new User("","",""));
        model.addAttribute("command",new User(null,null,null));

        return "index";
    }

    @RequestMapping("/i")
    public String home(Model model){
        model.addAttribute("user",new User("aaaa","123","aaa@qq.cn"));
        return "home";
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(String username, String password, ModelAndView mv, HttpSession session){
        User user = userService.login(username,password);
        if (user!=null){
            session.setAttribute("user",user);
            mv.setView(new RedirectView("/main"));
        }else{
            mv.addObject("msg","登录名或密码错误，请重新输入！");
            mv.setViewName("loginForm");
        }
        return mv;
    }

}
