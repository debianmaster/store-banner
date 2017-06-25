package com.example.banner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BannerApplication {
	@RequestMapping("/hello")
	public String Hellow(){
		return "Hello Wordl";
	}
	public static void main(String[] args) {
		SpringApplication.run(BannerApplication.class, args);
	}
}
