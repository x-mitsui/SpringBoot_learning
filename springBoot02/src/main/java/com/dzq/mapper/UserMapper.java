package com.dzq.mapper;

import com.dzq.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> findAllUser();
}
