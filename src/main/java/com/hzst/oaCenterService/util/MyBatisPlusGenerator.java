package com.hzst.oaCenterService.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


public class MyBatisPlusGenerator {


    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = "C:/Users/hzst73/IdeaProjects/oacenter_s";
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("wm");
        gc.setOpen(false);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://47.102.143.2:3306/oacenter?characterEncoding=utf8&useUnicode=true&useSSL=false&serverTimezone=UTC");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("java");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        //生成策略
        StrategyConfig strategy = new StrategyConfig();
        strategy.setTablePrefix("t_");
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);

        //包配置
        mpg.setPackageInfo(new PackageConfig()
                .setParent("com.hzst.oaCenterService")
                .setXml("xml")
                .setMapper("mapper")
        );

        mpg.setStrategy(strategy);
        mpg.execute();
    }

}
