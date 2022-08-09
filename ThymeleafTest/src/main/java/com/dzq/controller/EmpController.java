package com.dzq.controller;

import com.dzq.pojo.Emp;
import com.dzq.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/getEmp")
    public String getEmp(Map<String, Emp> map) {
        map.put("empInfo", empService.findEmp(7369));
        return "showEmp";
    }

    @RequestMapping("showAllEmp")
    public String showAllEmp(Map<String, Object> map) {
        map.put("empList", empService.findAllEmps());
        return "showEmp";
    }

    @RequestMapping("deleteItem")
    public String deleteItem(Integer empno, String ename) {
        boolean isSuccess = empService.deleteEmp(empno, ename);
        if (isSuccess) {
            System.out.println("删除成功");
        }
            return "redirect:/showAllEmp";
        //} else {
        //    return "";
        //}
    }
}
