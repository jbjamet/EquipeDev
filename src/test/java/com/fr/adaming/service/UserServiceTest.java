package com.fr.adaming.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fr.adaming.dto.RegisterDto;
import com.fr.adaming.entity.User;

@SpringBootTest
public class UserServiceTest {
	
//	@Autowired
//	private UserService service;
//	
//	@Test
//	public void createValidUser_shouldReturnUserWithIdNotNull() {
//		//préparer les inputs
//		User u = new User();
//		
//		u.setNom("nomA");
//		u.setEmail("email@email.fr");
//		u.setPwd("azerty");
//		
//		//invoquer la méthode
//		User returnedUser = service.save(u);
//		
//		//vérifier le résultat
//		assertNotNull(returnedUser);
//		assertNotNull(returnedUser.getId());
//	}
	
	@Rule
	ExpectedException exception;
	
	@Test
	public void testWithJunit() {
		// Préparer les inputs
		int x = 5; int y = 11;
		
		//Invoquer la méthode
		int z = somme(x,y);
		
		//Vérifier le résultat
		assertTrue(z == 16);
	}
	
	@Test
	public void convert5ToString_shouldReturnString5() {
		assertTrue(convert(5).equals("5"));
	}
	
	@Test
	public void convertNotIntegerToString_shouldThrowNumberFormatException() {
		convert(new Integer("qmlskdf"));
		exception.expect(NumberFormatException.class);
		exception.expectMessage("For input string:\"qmlskdf\"");
	}
	
	@Test
	public void testUserConstructeur() {
		RegisterDto dto = new RegisterDto();
		
		dto.setNom("x");
		dto.setEmail("y");
		
		User user = new User(dto);
		
		assertTrue(user.getNom().equals(dto.getNom()));
		assertTrue(user.getEmail().equals(dto.getEmail()));
		
	}
	
	public int somme(int x, int y) {
		return x+y;
	}
	
	public String convert(int x) {
		return new Integer(x).toString();
	}
}
