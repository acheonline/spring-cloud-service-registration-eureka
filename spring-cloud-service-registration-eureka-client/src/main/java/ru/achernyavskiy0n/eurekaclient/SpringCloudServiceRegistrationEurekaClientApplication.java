package ru.achernyavskiy0n.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudServiceRegistrationEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceRegistrationEurekaClientApplication.class, args);
	}

}
