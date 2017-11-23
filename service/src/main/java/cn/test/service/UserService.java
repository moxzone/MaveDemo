package cn.test.service;

import cn.test.domain.User;

public interface UserService {
    /**
     * 判断用户登录
     * @param username
     * @param password
     * @return 找到返回User对象，没有找到返回null
     */
    User login(String username,String password);
}
