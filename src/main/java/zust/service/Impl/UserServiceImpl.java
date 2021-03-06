package zust.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zust.dao.UserMapper;
import zust.model.User;
import zust.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User insertUser(User user) {
        userMapper.insertSelective(user);
        return user;
    }
}
