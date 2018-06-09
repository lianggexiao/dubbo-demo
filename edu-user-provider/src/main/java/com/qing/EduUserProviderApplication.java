package com.qing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.qing.dubbo.repository")
@ImportResource({"classpath:dubbo-provider.xml"})
public class EduUserProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduUserProviderApplication.class, args);
	}


}