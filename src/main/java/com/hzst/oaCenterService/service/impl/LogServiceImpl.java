package com.hzst.oaCenterService.service.impl;

import com.hzst.oaCenterService.entity.Log;
import com.hzst.oaCenterService.mapper.LogMapper;
import com.hzst.oaCenterService.service.ILogService;
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
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {

}
