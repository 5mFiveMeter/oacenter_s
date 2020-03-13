package com.hzst.oaCenterService.controller;


import com.hzst.oaCenterService.entity.System;
import com.hzst.oaCenterService.service.impl.SystemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

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
@Transactional
public class SystemController {

    @Autowired
    SystemServiceImpl systemService;

    @GetMapping("/list")
    public Object list (){
        return systemService.list();
    }

    @PostMapping("add")
    public Object add(@RequestParam System system){
        return systemService.save(system);
    }

}

