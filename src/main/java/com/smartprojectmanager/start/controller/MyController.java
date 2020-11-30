package com.smartprojectmanager.start.controller;

import com.smartprojectmanager.start.dao.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 @Controller
public class MyController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("titles","Smart Contact Manager");
		return "home";

	}
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("titles","Smart Contact Manager");
		return "about";

	}

}
