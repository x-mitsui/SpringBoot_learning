package com.dzq.service.impl;

import com.dzq.mapper.EmpMapper;
import com.dzq.pojo.Emp;
import com.dzq.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> findAll() {
        List<Emp> allEmp = empMapper.findAll();
        return allEmp;
    }

    @Override
    public PageInfo<Emp> findByPage(Integer PageNum,Integer PageSize) {
        PageHelper.startPage(PageNum, PageSize);

        List<Emp> list = empMapper.findAll();

        // 封装详细信息
        PageInfo<Emp> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
