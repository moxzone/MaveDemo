package cn.test.controller;

import cn.test.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class UserController{

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


}
