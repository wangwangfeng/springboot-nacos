package com.example.springbootnacos.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: NacosController
 * @Description: TODO
 * @Date: 2021/11/16 11:55
 * @author: wwf
 */
@RestController
public class NacosController {

    @NacosValue(value = "${version:1}", autoRefreshed = true)
    private String version;

    @GetMapping(value = "/test")
    public String test() {
        System.out.println("测试开始++++");
        return version;
    }

}
