package com.hzst.oaCenterService.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.hzst.oaCenterService.entity.Sys;
import com.hzst.oaCenterService.service.impl.SysServiceImpl;
import com.hzst.oaCenterService.util.HttpResult;
import com.hzst.oaCenterService.util.MyTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wm
 * @since 2020-03-14
 */
@RestController
@RequestMapping("/sys")
public class SysController {

    @Autowired
    SysServiceImpl sysService;

    @GetMapping("/list")
    public HttpResult list(){
        return HttpResult.success().setData(sysService.listMaps());
    }
    @PostMapping("/add")
    public HttpResult add(@RequestBody Sys sys){
        if(MyTool.paramVerify(sys,"name,enName")==1){
            sys.setCreateTime(MyTool.getCurrentTime());
            sys.setSystemId(UUID.randomUUID().toString());
            sys.setSerializeNum(UUID.randomUUID().toString());
            if(sysService.save(sys)){
                return HttpResult.success();
            }else {
                return HttpResult.fail().setMsg("添加失败");
            }
        }else {
            return HttpResult.fail().setMsg("参数不正确");
        }
    }
    @PostMapping("/find")
    public HttpResult findOne(String system_id,String system_name){
        if(system_id != null){
            QueryWrapper<Sys> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("system_id",system_id);
            return HttpResult.success().setData(sysService.getOne(queryWrapper));
        }
        if(system_name != null){
            QueryWrapper<Sys> queryWrapper = new QueryWrapper<>();
            queryWrapper.like("name",system_name);
            return HttpResult.success().setData(sysService.list(queryWrapper));
        }
        return HttpResult.fail();
    }
    @PostMapping("/updata")
    public HttpResult updata(@RequestBody Sys sys){
        UpdateWrapper<Sys> sysUpdateWrapper = new UpdateWrapper<>();
        sysUpdateWrapper.eq("system_id",sys.getSystemId());
        return HttpResult.success().setData(sysService.update(sys,sysUpdateWrapper));
    }
    @PostMapping("/changeDelete")
    public HttpResult changeDelete(@RequestParam List<String> idList){
        idList.forEach(id->{
            UpdateWrapper<Sys> sysUpdateWrapper = new UpdateWrapper<>();
            sysUpdateWrapper.eq("system_id",id);
            Sys sys = new Sys();
            sys.setIsDelete(1);
            sysService.update(sys,sysUpdateWrapper);
        });
        return HttpResult.success().setMsg("删除成功");
    }

}

