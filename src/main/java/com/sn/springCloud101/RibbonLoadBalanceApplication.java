package com.sn.springCloud101;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright (C), 2002-2019,
 * FileName: RibbonLoadBalanceApplication
 * Author:  18075555
 * Date: 2019/1/26 17:51.
 * Description: //增加负载均衡
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

@SpringBootApplication
@EnableEurekaServer
public class RibbonLoadBalanceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(RibbonLoadBalanceApplication.class).properties("server.port="+8888).run(args);
    }

    //添加负载均衡
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
