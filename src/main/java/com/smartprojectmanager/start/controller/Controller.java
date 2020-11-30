package com.smartprojectmanager.start.controller;

import com.smartprojectmanager.start.dao.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/home")
	public String home() {
		return "home.html";

	}

}
