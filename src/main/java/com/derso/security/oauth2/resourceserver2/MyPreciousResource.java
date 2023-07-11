package com.derso.security.oauth2.resourceserver2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/precious")
public class MyPreciousResource {
	
	@GetMapping
	public String preciousResource() {
		return "The princess is in another castle";
	}
	
	@GetMapping("/not-so-much")
	public String notSoMuchPreciousResource() {
		return "That green Mario, what is his name?";
	}
	
}
