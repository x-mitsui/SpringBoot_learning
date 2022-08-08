package com.dzq.service;

import com.dzq.pojo.Emp;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmpService {
    List<Emp> findAll();

    PageInfo<Emp> findByPage(Integer pageNum, Integer pageSize);
}
