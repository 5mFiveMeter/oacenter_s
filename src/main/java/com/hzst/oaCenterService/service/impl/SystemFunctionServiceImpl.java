package com.hzst.oaCenterService.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hzst.oaCenterService.entity.SystemFunction;
import com.hzst.oaCenterService.mapper.SystemFunctionMapper;
import com.hzst.oaCenterService.service.ISystemFunctionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wm
 * @since 2020-03-13
 */
@Service
@Transactional
public class SystemFunctionServiceImpl extends ServiceImpl<SystemFunctionMapper, SystemFunction> implements ISystemFunctionService {

    @Autowired
    SystemFunctionMapper systemFunctionMapper;

    //绑定功能到系统
    public int functionBindSystem(String functionId,String systemId){
        SystemFunction systemFunction = new SystemFunction();
        systemFunction.setFunctionId(functionId);
        systemFunction.setSystemId(systemId);
        return systemFunctionMapper.insert(systemFunction);
    }

    //查询对应系统下的功能
    public List<SystemFunction> getFunctionOfSystem(String systemId){
        QueryWrapper<SystemFunction> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("system_id",systemId);
        return systemFunctionMapper.selectList(queryWrapper);
    }

}
