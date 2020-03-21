package com.admin.springcloudadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudAdminApplication {

	public static void main(String[] args) {
		SpringApplication
				.run(SpringCloudAdminApplication.class, args);
		new SpringApplicationBuilder(SpringCloudAdminApplication.class)
				.web(WebApplicationType.REACTIVE)
				.run(args);
	}





}
