package com.hzst.oaCenterService.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzst.oaCenterService.entity.Sys;
import com.hzst.oaCenterService.mapper.SysMapper;
import com.hzst.oaCenterService.service.ISysService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzst.oaCenterService.util.HttpResult;
import com.hzst.oaCenterService.util.MyTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wm
 * @since 2020-03-16
 */
@Service
@Transactional
public class SysServiceImpl extends ServiceImpl<SysMapper, Sys> implements ISysService {

    @Autowired
    SysMapper sysMapper;


    //分页查询系统列表
    @Override
    public HashMap<String,Object> SystemListPage(Long index,Long size){
        QueryWrapper<Sys> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("order_num","create_time");
        Page<Sys> page = new Page<>(index,size);
        IPage<Sys> iPage = sysMapper.selectPage(page,queryWrapper);
        //返回结果
        HashMap<String,Object> rst = new HashMap<>();
        rst.put("total",iPage.getTotal());
        rst.put("pages",iPage.getPages());
        rst.put("list",iPage.getRecords());
        return rst;
    }
    //新增系统
    @Override
    public HttpResult addNewSystem(Sys sys){
        //默认信息填充
        sys.setCreateTime(MyTool.getCurrentTime());
        sys.setSystemId(UUID.randomUUID().toString());
        sys.setSerializeNum(UUID.randomUUID().toString());
        if(sysMapper.insert(sys)>0){
            return HttpResult.success().setMsg("添加成功");
        }else {
            return HttpResult.fail().setMsg("添加失败");
        }
    }
    //根据名称查询
    @Override
    public HashMap<String,Object> findSystemByName(HashMap map){

        QueryWrapper<Sys> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("order_num","create_time");
        queryWrapper.like("name",map.get("keywords"));
        Integer nowPage = (Integer) map.get("index");
        Integer size = (Integer) map.get("size");
        Page<Sys> page = new Page<>( Long.valueOf(nowPage),Long.valueOf(size));
        IPage<Sys> iPage = sysMapper.selectPage(page,queryWrapper);
        //返回结果
        HashMap<String,Object> rst = new HashMap<>();
        rst.put("total",iPage.getTotal());
        rst.put("pages",iPage.getPages());
        rst.put("list",iPage.getRecords());
        return rst;
    }
    //更新系统信息
    @Override
    public int updataSystem(Sys sys){
        UpdateWrapper<Sys> sysUpdateWrapper = new UpdateWrapper<>();
        sysUpdateWrapper.eq("system_id",sys.getSystemId());
        return sysMapper.update(sys,sysUpdateWrapper);
    }
}
