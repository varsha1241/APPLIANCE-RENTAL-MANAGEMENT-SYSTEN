package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SignUp;
import com.example.demo.service.SignUpService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1/signup")
public class SignUpController {

	@Autowired
	private SignUpService signupService;
	
	@PostMapping
	public SignUp saveProduct(@RequestBody SignUp signup) {
		return signupService.saveLogin(signup);
	}
	
	@GetMapping
	public List<SignUp> getAllProducts(){
		return signupService.getAllLogins();
	}
}
	