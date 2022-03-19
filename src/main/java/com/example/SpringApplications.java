package com.example;

	


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:bean.xml")
public class SpringApplications {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplications.class, args);
	

}
}

