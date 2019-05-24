package com.sgic.librarysystem;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sgic.librarysystem.model.MainClassification;
import com.sgic.librarysystem.service.MainClassificationService;
import com.sgic.librarysystem.service.MainClassificationServiceImpl;
public class LibraryApplication {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		MainClassificationService mainClassificationService = context.getBean("mainClassificationService", MainClassificationServiceImpl.class);
		
		MainClassification mainClass = new MainClassification();
		mainClass.setMainClassName("ABC");
		mainClassificationService.saveMainClassification(mainClass);
		System.out.println("Saved");
		
	}

}
