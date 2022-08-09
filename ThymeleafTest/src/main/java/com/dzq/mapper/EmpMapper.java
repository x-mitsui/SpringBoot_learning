package com.dzq.mapper;

import com.dzq.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    Emp findEmp(Integer empno);

    List<Emp> findAllEmps();

    int deleteEmp(Integer empno, String ename);
}
