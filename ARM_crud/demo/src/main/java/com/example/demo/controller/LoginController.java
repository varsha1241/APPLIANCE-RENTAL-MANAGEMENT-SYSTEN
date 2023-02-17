package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping
	public Login saveProduct(@RequestBody Login login) {
		return loginService.saveLogin(login);
	}
	
	@GetMapping
	public List<Login> getAllProducts(){
		return loginService.getAllLogins();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Login> getProductById(@PathVariable("id") Long id) {
		return loginService.getLoginById(id);
	}
}
