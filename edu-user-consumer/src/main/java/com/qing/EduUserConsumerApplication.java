package com.qing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo-consumer.xml"})
public class EduUserConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduUserConsumerApplication.class, args);
	}
}
