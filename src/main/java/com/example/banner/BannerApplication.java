package com.example.banner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BannerApplication {
	@RequestMapping("/banner")
	public String sayHello(){
		return "Hello Universe!";
	}
	public static void main(String[] args) {
		SpringApplication.run(BannerApplication.class, args);
	}
}
