package com.banulp.zipkinbackend;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZipkinbackendApplication {

	//	https://cloud.spring.io/spring-cloud-sleuth/2.0.x/multi/multi__sampling.html
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

	public static void main(String[] args) {
		SpringApplication.run(ZipkinbackendApplication.class, args);
	}

}
