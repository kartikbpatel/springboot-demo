package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})*/
@SpringBootApplication
@RestController
public class Application {

	 @RequestMapping(value="/")
	 public String home(){
		 return "home";
	 }
	 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
