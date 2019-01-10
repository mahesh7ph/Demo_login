package com.motiva.demo_login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private final UserRepository userRepository;
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public UserDtos getUserDetails(String username,String password) {
		
		User dts= userRepository.getUserName(username,password);
		UserDtos dtos=new UserDtos();
		if(dts == null) {
			dtos.setMessage("USER NOT FOUND");
		}
		else {
			dtos.setMessage("USER AUTHENTICATED");
		}
		return dtos;

	}

}
