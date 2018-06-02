package com.qing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qing.dubbo.repository")
public class EduDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduDemoApplication.class, args);
	}
}
