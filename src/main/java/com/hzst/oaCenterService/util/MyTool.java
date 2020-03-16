package com.hzst.oaCenterService.util;

import org.apache.catalina.mbeans.MBeanUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class MyTool {

    //校验entity必填项
    public static int paramVerify(Object target, String params){
        String[] paramList = params.split(",");
        Class targetClass = target.getClass();
        int log = 1;
        for(String param : paramList){
            try{
                Method method =  targetClass.getMethod("get"+param.substring(0,1).toUpperCase()+param.substring(1));
                Object result = method.invoke(target);
                if(result == null || result.equals("")){
                    log = 2;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return log;
    }

    //获取当前时间
    public static String getCurrentTime(){
        SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }
}
