package cn.mzs.springboot.controller;


import cn.mzs.springboot.common.Result;
import cn.mzs.springboot.entity.TUser;
import cn.mzs.springboot.service.TUserService;
import cn.mzs.springboot.service.impl.TUserServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-06-18
 */
@RestController
@RequestMapping("/user")
public class TUserController {
    @Autowired
    private TUserService tUserService;

    @RequestMapping("/queryUser")
    public Result queryUser(Page<TUser> page) {
        tUserService.page(page);
        return Result.success(page);
    }

}
