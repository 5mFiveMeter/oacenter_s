package com.hzst.oaCenterService.service;

import com.hzst.oaCenterService.entity.Function;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wm
 * @since 2020-03-13
 */
public interface IFunctionService extends IService<Function> {

    public int addFunction(Function function,String systemId);

}
