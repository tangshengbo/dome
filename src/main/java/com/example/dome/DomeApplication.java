package com.example.dome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.dome.dao")
@SpringBootApplication
public class DomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomeApplication.class, args);
	}

}
