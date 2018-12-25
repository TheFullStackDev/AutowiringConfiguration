package com.dibas.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Fruit {

	
	private String description = "not set";
	
	public String getDescription() {
		return description;
	}

	@Autowired
	public void setDescription(@Value("Hi, I'm Fruit.") String description) {
		this.description = description;
	}

	public Fruit() {
		// no arg constructor
	}

	public String talkAboutYou() {

		return description;

	}
		
}
