/**
 * 
 */
package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author berina
 *
 */
@RestController
public class GreetingConsumer {
	
	@RequestMapping("/")
	public String getMessage() {
		RestTemplate template = new RestTemplate();
		String message = template.getForObject("http://localhost:8080/berina/", String.class);
		return message;
	}
	
	@RequestMapping("/greeting")
	public Greeting getGreeting(@RequestParam(value="name", defaultValue="World")String name) {
		RestTemplate template = new RestTemplate();
		Greeting greet = template.getForObject("http://localhost:8080/berina/greet?name=" + name, Greeting.class);
		return greet;
	}

}
