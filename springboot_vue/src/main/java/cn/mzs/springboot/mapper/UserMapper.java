package cn.mzs.springboot.mapper;

import cn.mzs.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int insertUser(User user);

    int deleteUserById(String id);

    int updateUser(User user);

    User selectUserById(String id);

    List<User> selectUserList(User user);

}
