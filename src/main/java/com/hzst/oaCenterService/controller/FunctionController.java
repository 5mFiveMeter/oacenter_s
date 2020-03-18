package com.hzst.oaCenterService.controller;


import com.hzst.oaCenterService.entity.Function;
import com.hzst.oaCenterService.service.impl.FunctionServiceImpl;
import com.hzst.oaCenterService.util.HttpResult;
import com.hzst.oaCenterService.util.MyTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wm
 * @since 2020-03-13
 */
@Controller
@RequestMapping("/function")
public class FunctionController {

    @Autowired
    FunctionServiceImpl functionService;

    //功能注册
    @PostMapping("/addFunction")
    public HttpResult addFunction(@RequestBody Function function,@RequestBody String systemId){
        if(MyTool.paramVerify(function,"name") == 1 && systemId != null){
            if(functionService.addFunction(function,systemId) == 2){
                return HttpResult.success().setMsg("新增成功");
            }else {
                return HttpResult.fail().setMsg("新增失败");
            }
        }else{
            return HttpResult.fail().setMsg("参数错误");
        }
    }
}

