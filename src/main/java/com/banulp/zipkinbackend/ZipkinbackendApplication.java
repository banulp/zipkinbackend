package com.banulp.zipkinbackend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
//@EnableAutoConfiguration
public class ZipkinbackendApplication {

//	private static final Logger log = LoggerFactory.getLogger(ZipkinbackendApplication.class);
	//	@Value("${spring.sleuth.enabled}")
//	@Value("${spring.zipkin.baseUrl}")
//	String se;
//
//	@RequestMapping("/")
//	String home() {
//		log.info("Hello world!" + se);
//		return "Hello World!";
//	}

	public static void main(String[] args) {
		SpringApplication.run(ZipkinbackendApplication.class, args);
	}

}
