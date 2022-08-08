package com.dzq.controller;

import com.dzq.pojo.Emp;
import com.dzq.service.EmpService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Emp> findAll(){
        return empService.findAll();
    }

    @ResponseBody
    @RequestMapping("/findByPage/{PageNum}/{PageSize}")
    public PageInfo<Emp> findByPage(@PathVariable("PageNum") Integer PageNum, @PathVariable("PageSize") Integer PageSize){
        return empService.findByPage(PageNum,PageSize);
    }
}
