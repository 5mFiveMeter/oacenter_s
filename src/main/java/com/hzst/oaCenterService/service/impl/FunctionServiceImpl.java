package com.hzst.oaCenterService.service.impl;

import com.hzst.oaCenterService.entity.Function;
import com.hzst.oaCenterService.mapper.FunctionMapper;
import com.hzst.oaCenterService.service.IFunctionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

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
public class FunctionServiceImpl extends ServiceImpl<FunctionMapper, Function> implements IFunctionService {

    @Autowired
    FunctionMapper functionMapper;
    @Autowired
    SystemFunctionServiceImpl systemFunctionService;

    //新增功能
    public int addFunction(Function function,String systemId){
        int flag = 0;
        function.setFunctionId(UUID.randomUUID().toString());
        //新增
        flag += functionMapper.insert(function);
        //将功能与系统绑定
        flag += systemFunctionService.functionBindSystem(function.getFunctionId(),systemId);
        return flag;
    }
}
