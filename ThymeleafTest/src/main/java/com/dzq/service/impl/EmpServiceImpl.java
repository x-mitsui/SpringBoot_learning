package com.dzq.service.impl;

import com.dzq.mapper.EmpMapper;
import com.dzq.pojo.Emp;
import com.dzq.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp findEmp(Integer empno){
        return empMapper.findEmp(empno);
    }

    @Override
    public List<Emp> findAllEmps() {
        return empMapper.findAllEmps();
    }

    @Override
    public boolean deleteEmp(Integer empno, String ename) {
        return empMapper.deleteEmp(empno,ename)>0;
    }
}
