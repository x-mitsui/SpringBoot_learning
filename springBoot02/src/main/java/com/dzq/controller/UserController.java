package com.dzq.controller;

import com.dzq.pojo.User;
import com.dzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/getUsers")
    public List<User> getUsers(){
        List<User> allUser = userService.findAllUser();
        return allUser;

    }
}
