package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.SignUp;
public interface SignUpService 
{
	SignUp saveLogin(SignUp signup);
	List<SignUp> getAllLogins();
}
