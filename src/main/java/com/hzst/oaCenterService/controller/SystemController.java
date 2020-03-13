package com.hzst.oaCenterService.controller;


import com.hzst.oaCenterService.service.impl.SystemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wm
 * @since 2020-03-13
 */
@RestController
@RequestMapping("/system")
public class SystemController {

    @Autowired
    SystemServiceImpl systemService;

    @GetMapping("/list")
    public Object list (){
        return systemService.list();
    }

}

