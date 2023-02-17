package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Login;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.LoginRepository;
@Service
public class LoginServiceImpl implements LoginService
{

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public Login saveLogin(Login Login) {

		return loginRepository.save(Login);
	}

	@Override
	public List<Login> getAllLogins() {

		return loginRepository.findAll();
	}

	@Override
	public ResponseEntity<Login> getLoginById(Long LoginId) {

		Login Login=loginRepository.findById(LoginId).orElseThrow(()->
		new ResourceNotFoundException("Login does not exist with LoginId:"+LoginId));
		return ResponseEntity.ok(Login);
	}
}
