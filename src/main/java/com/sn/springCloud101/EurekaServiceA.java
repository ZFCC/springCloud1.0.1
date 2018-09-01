package com.sn.springCloud101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceA {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		String profiles = scan.nextLine();
		new SpringApplicationBuilder(EurekaServiceA.class).profiles("peerA").run(args);
	}
}