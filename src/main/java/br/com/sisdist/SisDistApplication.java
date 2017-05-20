package br.com.sisdist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SisDistApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SisDistApplication.class, args);
	}
}
