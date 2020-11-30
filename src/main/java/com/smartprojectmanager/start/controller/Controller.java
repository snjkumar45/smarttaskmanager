package com.smartprojectmanager.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartprojectmanager.start.dao.UserRepository;
import com.smartprojectmanager.start.model.User;

@RestController
public class Controller {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/HOT")
	@ResponseBody
	public String home() {
		User user = new User();
		user.setName("sanjay");
		user.setEmail("snjkumar45");
		userRepository.save(user);
		return "working";
	}

}
