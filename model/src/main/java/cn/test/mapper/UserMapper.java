package cn.test.mapper;

import cn.test.domain.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {
    @Insert("INSERT INTO user(username,password,email)VALUES(#{username},#{password},#{email})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int saveUser(User user);

    @Update("UPDATE user SET username=#{username},password=#{password},email=#{email} WHERE id=#{id}")
    void updateUser(User user);

    @Select("SELECT * FROM user WHERE id=#{id}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "password",property = "password"),
            @Result(column = "email",property = "email")
    })
    User selectUserById(Integer id);


    @Select("SELECT * FROM user WHERE username=#{username} and password=#{password}")
    User findUser(@Param("username") String username,@Param("password") String password);
}
