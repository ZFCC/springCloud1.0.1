package com.sn.springCloud101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceB {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServiceB.class).profiles("peerB").run(args);
	}
}
