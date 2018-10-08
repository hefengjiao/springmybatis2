package com.springmybatis2.springmybatis2.dao;

import com.springmybatis2.springmybatis2.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM user where id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "age", column = "age")
    })
    User findById(@Param("id") int id);
}