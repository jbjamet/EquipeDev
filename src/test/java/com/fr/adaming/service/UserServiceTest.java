package com.fr.adaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	private UserService service;
	
	public void createValidUser_shouldReturnUserNotNull() {
		
	}
}
