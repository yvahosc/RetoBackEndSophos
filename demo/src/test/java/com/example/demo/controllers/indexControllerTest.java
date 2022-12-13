package com.example.demo.controllers;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class indexControllerTest {
	
	@Autowired
	indexController indexController = new indexController();
	
	@Test
	public void testIndex() {
		String response = indexController.index();
		Assertions.assertEquals("Hola", response);
	}
}
