package cn.mzs.springboot.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Data
public class User {
    private String id;
    private String username;
    private String password;
    private String age;
    private String phone;
    private String address;
}
