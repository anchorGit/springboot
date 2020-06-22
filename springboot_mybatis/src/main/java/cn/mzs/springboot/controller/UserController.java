package cn.mzs.springboot.controller;

import cn.mzs.springboot.entity.User;
import cn.mzs.springboot.service.UserService;
import cn.mzs.springboot.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")

public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAllUser")
    public Result findAllUser(){
        try {
            List<User> list = userService.findAllUser();
            return Result.success(list);
        }catch (Exception e){
            return Result.fail("请求失败");
        }
    }

    @RequestMapping("/findUser")
    public Result findUser(@RequestBody User user){
        try {
            List<User> list = userService.findUser(user);
            return Result.success(list);
        }catch (Exception e){
            return Result.fail("请求失败");
        }
    }

    @RequestMapping("/saveUser")
    public Result saveUser(@RequestBody User user){
        try {
            userService.saveUser(user);
            return Result.success();
        }catch (Exception e){
            return Result.fail("请求失败");
        }
    }

    @RequestMapping("/deleteUser")
    public Result deleteUser(String id){
        try {
            userService.deleteUser(id);
            return Result.success();
        }catch (Exception e){
            return Result.fail("请求失败");
        }
    }

    @RequestMapping("updateUser")
    public Result updateUser(User user){
        try {
            userService.updateUser(user);
            return Result.success();
        }catch (Exception e){
            return Result.fail("请求失败");
        }
    }
}
