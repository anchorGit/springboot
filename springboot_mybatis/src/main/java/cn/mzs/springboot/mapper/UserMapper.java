package cn.mzs.springboot.mapper;

import cn.mzs.springboot.entity.User;

import javax.annotation.Resource;
import java.util.List;

public interface UserMapper {
    public List<User> findAllUser();
    public List<User> findUser(User user);
    public void saveUser(User user);
    public void deleteUser(String id);
    public void updateUser(User user);
}
