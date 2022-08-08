package com.dzq.mapper;

import com.dzq.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
     List<Emp> findAll();
}
