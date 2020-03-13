package com.hzst.oaCenterService.service.impl;

import com.hzst.oaCenterService.entity.User;
import com.hzst.oaCenterService.mapper.UserMapper;
import com.hzst.oaCenterService.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wm
 * @since 2020-03-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
