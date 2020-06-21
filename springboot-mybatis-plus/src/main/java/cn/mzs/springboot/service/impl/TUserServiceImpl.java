package cn.mzs.springboot.service.impl;

import cn.mzs.springboot.entity.TUser;
import cn.mzs.springboot.mapper.TUserMapper;
import cn.mzs.springboot.service.TUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-06-18
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

}
