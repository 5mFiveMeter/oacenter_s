package com.hzst.oaCenterService.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.hzst.oaCenterService.entity.Sys;
import com.hzst.oaCenterService.service.impl.SysServiceImpl;
import com.hzst.oaCenterService.util.HttpResult;
import com.hzst.oaCenterService.util.MyTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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
    public HttpResult list(@RequestParam Long index,@RequestParam Long size){
        return HttpResult.success().setData(sysService.SystemListPage(index,size));
    }
    @PostMapping("/add")
    public HttpResult add(@RequestBody Sys sys){
        //系统必填参数的空值校验
        if(MyTool.paramVerify(sys,"name,enName")==1){
            return sysService.addNewSystem(sys);
        }else {
            return HttpResult.fail().setMsg("参数不正确");
        }
    }
    @PostMapping("/find")
    public HttpResult findOne(@RequestBody HashMap<String,Object> param){
        if(param.get("keywords") != null){
            return HttpResult.success().setData(sysService.findSystemByName(param));
        }
        return HttpResult.fail().setMsg("参数不正确");
    }
    @PostMapping("/updata")
    public HttpResult updata(@RequestBody Sys sys){
        if(MyTool.paramVerify(sys,"name,enName,systemId")==1){
            if(sysService.updataSystem(sys) > 0){
                return HttpResult.success().setMsg("修改成功");
            }else{
                return HttpResult.fail().setMsg("修改失败");
            }
        }else {
            return HttpResult.fail().setMsg("参数不正确");
        }
    }
    @PostMapping("/changeDelete")
    public HttpResult changeDelete(@RequestBody HashMap<String,Object> param){
        List<String> idList = (List) param.get("idList");
        int count = 0;
        for(String id : idList){
            Sys sys = new Sys();
            sys.setIsDelete(1);
            sys.setSystemId(id);
            count = count + sysService.updataSystem(sys);
        }
        if(count>0){
            return HttpResult.success().setMsg("删除成功").setData(count);
        }else{
            return HttpResult.fail().setMsg("删除失败");
        }

    }

}

