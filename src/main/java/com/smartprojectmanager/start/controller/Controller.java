package com.smartprojectmanager.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	//private UserRepository userRepository;

	@GetMapping("/home")
	public String home() {
		return "home";

	}

}
