package com.hzst.oaCenterService.service;

import com.hzst.oaCenterService.entity.Sys;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hzst.oaCenterService.util.HttpResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wm
 * @since 2020-03-16
 */
public interface ISysService extends IService<Sys> {

    //查询所有系统
    public List<Sys> listAllSystem();
    //系统分页查询
    public HashMap<String,Object> SystemListPage(Long index,Long size);
    //新增
    public HttpResult addNewSystem(Sys sys);
    //根据系统名称查找
    public HashMap<String,Object> findSystemByName(HashMap map);
    //更新系统信息
    public int updataSystem(Sys sys);
}
