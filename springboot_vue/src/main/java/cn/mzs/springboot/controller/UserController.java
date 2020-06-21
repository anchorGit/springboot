package cn.mzs.springboot.controller;

import cn.mzs.springboot.bean.User;
import cn.mzs.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private User user;

    @RequestMapping("/addUser")
    public String addUser() {
        userService.insertUser(user);
        return "新增用户成功！";
    }

    @RequestMapping("/deleteUserId")
    public String deleteUserId(String id) {
        userService.deleteUserById(id);
        return id + ":删除此用户成功！";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user) {
        userService.updateUser(user);
        return "更新用户成功！";
    }

    @RequestMapping("/queryUserById")
    public User queryUserById(String id) {
        return userService.selectUserById(id);
    }

    @RequestMapping("/queryUser")
    public List<User> queryUser(User user) {
        return userService.selectUserList(user);
    }

}
