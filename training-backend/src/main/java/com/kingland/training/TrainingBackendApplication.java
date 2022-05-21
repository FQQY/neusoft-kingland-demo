package com.kingland.training;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.kingland.training.mapper")
public class TrainingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingBackendApplication.class, args);
	}

}
