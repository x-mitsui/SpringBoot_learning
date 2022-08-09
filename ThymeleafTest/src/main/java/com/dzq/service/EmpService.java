package com.dzq.service;

import com.dzq.pojo.Emp;
import java.util.List;

public interface EmpService {
    Emp findEmp(Integer empno);

    List<Emp> findAllEmps();

    boolean deleteEmp(Integer empno, String ename);
}
