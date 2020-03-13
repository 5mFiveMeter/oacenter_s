package com.hzst.oaCenterService.service.impl;

import com.hzst.oaCenterService.entity.Post;
import com.hzst.oaCenterService.mapper.PostMapper;
import com.hzst.oaCenterService.service.IPostService;
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
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements IPostService {

}
