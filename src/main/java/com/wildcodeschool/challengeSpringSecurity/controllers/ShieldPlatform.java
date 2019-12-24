package com.wildcodeschool.challengeSpringSecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShieldPlatform {
	
	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "Welcome to the SHIELD";
	}
	
	@GetMapping("/avengers/assemble")
	@ResponseBody
	public String champion() {
		return "Avengers..... Assemble";
	}
	
	@GetMapping("/secret-bases")
	public String director() {
		return "bases";
	}
}
