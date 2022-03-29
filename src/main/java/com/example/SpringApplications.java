package com.example;

	


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ImportResource("classpath:bean.xml")
@PropertySource("classpath:log4j.properties")
public class SpringApplications {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplications.class, args);
	

}
}

