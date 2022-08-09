package com.dzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MyController {
    @RequestMapping("showIndex")
    public String showIndex(Map<String,String> map){
        map.put("msg","rubbish");
        return "index";
    }
}
