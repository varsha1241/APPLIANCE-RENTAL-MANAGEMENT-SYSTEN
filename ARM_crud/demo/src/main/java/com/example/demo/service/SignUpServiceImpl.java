package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.SignUp;
import com.example.demo.repository.SignUpRepository;

@Service
public class SignUpServiceImpl implements SignUpService
{

	@Autowired
	private SignUpRepository signupRepository;

	@Override
	public SignUp saveLogin(SignUp signup) 
	{
		return signupRepository.save(signup);
	}

	@Override
	public List<SignUp> getAllLogins() 
	{
		return signupRepository.findAll();
	}
}