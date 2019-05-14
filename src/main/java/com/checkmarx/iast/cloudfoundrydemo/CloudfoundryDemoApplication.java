package com.checkmarx.iast.cloudfoundrydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/v1")
@SpringBootApplication
public class CloudfoundryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudfoundryDemoApplication.class, args);
	}

	// trigger
	// trigger 

	@GetMapping("/helloworld")
	public String helloWorld(@RequestParam("msg") String msg) {
	  return "Hello, world!" + msg;
	}


}
