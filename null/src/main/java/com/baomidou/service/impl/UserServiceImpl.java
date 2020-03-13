package com.baomidou.service.impl;

import com.baomidou.entity.User;
import com.baomidou.mapper.UserMapper;
import com.baomidou.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wm
 * @since 2020-03-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
