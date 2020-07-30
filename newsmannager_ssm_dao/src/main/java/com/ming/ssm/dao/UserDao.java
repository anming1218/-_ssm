package com.ming.ssm.dao;
import com.ming.ssm.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 *@program: newsmannager_ssm
 *@description: 用户的持久层接口
 *@author: ming
 *@create: 2020-07-30 12:58
 */
@Repository
public interface UserDao {

    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from users")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "age", column = "age"),
            @Result(property = "email", column = "email"),
            @Result(property = "password", column = "password")
    })
    List<User> findAll() throws Exception;

}
