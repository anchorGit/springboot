package cn.mzs.springboot.service.impl;

import cn.mzs.springboot.entity.User;
import cn.mzs.springboot.mapper.UserMapper;
import cn.mzs.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public List<User> findUser(@RequestBody User user) {
        return userMapper.findUser(user);
    }

    @Override
    public void saveUser(@RequestBody User user) {
        user.setId(UUID.randomUUID().toString());
        userMapper.saveUser(user);
    }

    @Override
    public void deleteUser(String id) {
        userMapper.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
