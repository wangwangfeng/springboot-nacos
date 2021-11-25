package com.example.springbootnacos;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "examples", groupId = "test", autoRefreshed = true)
/**
 * @Description: dataId和groupId在配置文件配置无效
 * 启动类上和获取数据上都需要加自动刷新动态配置autoRefreshed
 **/
public class SpringbootNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootNacosApplication.class, args);
    }

}
