package com.dzq.controller;

import com.dzq.pojo.Emp;
import com.dzq.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    public String showAllEmp(Map<String, Object> map, HttpServletRequest req, HttpSession session) {
        map.put("empList", empService.findAllEmps());
        // 向request域放数据
        req.setAttribute("msg", "requestMessage");
        // 向session域放数据
        session.setAttribute("msg", "sessionMessage");
        // 向application域放数据
        req.getServletContext().setAttribute("msg", "applicationMessage");
        return "showEmp";
    }

    @RequestMapping("/deleteItem")
    public String deleteItem(Integer empno, String ename) {
        System.out.println("jirnu");
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
