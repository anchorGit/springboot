package cn.mzs.springboot.service;

import cn.mzs.springboot.entity.User;
import cn.mzs.springboot.mapper.UserMapper;

import java.util.List;

public interface UserService {
    public List<User> findAllUser();
    public List<User> findUser(User user);
    public void saveUser(User user);
    public void deleteUser (String id);
    public void updateUser(User user);
}
