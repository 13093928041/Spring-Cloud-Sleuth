package com.example.demo.sleuth_demo2;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class SleuthDemo2Application {

	private final Logger logger = Logger.getLogger(getClass());

	@RequestMapping(value = "/trace-2",method = RequestMethod.GET)
	public String trace(){
		logger.info("---<call trace-2>---");
		return "Trace";
	}

	public static void main(String[] args) {
		SpringApplication.run(SleuthDemo2Application.class, args);
	}
}
