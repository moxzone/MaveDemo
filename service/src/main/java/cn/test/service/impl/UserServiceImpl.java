package cn.test.service.impl;

import cn.test.domain.User;
import cn.test.mapper.UserMapper;
import cn.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true)
    public User login(String username, String password) {
        return userMapper.findUser(username,password);
    }
}
