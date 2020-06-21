package cn.mzs.springboot.service;

import cn.mzs.springboot.bean.User;
import cn.mzs.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public int deleteUserById(String id) {
        return userMapper.deleteUserById(id);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User selectUserById(String id) {
        return userMapper.selectUserById(id);
    }

    public List<User> selectUserList(User user) {
        return userMapper.selectUserList(user);
    }
}
