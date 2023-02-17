package com.example.demo.service;
import java.util.List;
import org.springframework.http.ResponseEntity;
import com.example.demo.entity.Login;
public interface LoginService {
	Login saveLogin(Login login);
	List<Login> getAllLogins();
	ResponseEntity<Login> getLoginById(Long id);
}