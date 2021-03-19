package com.wideshot.alimtalk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.wideshot.alimtalk.service.AlimtalkService;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Application implements CommandLineRunner{

	@Autowired
	AlimtalkService alimtalkService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("count= " + alimtalkService.test());
	}
}
