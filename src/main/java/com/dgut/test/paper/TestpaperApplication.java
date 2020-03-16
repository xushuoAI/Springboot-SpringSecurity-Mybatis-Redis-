package com.dgut.test.paper;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@SpringBootApplication
@EnableCaching
public class TestpaperApplication  {

	public static void main(String[] args) {
		SpringApplication.run(TestpaperApplication.class, args);
	}

}
