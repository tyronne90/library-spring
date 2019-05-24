package com.sgic.librarysystem.service;

import com.sgic.librarysystem.dao.MainClassificationDAO;
import com.sgic.librarysystem.model.MainClassification;

public class MainClassificationServiceImpl implements MainClassificationService {
	
	private MainClassificationDAO mainClassificationDAO;
	
	

	public MainClassificationDAO getMainClassificationDAO() {
		return mainClassificationDAO;
	}



	public void setMainClassificationDAO(MainClassificationDAO mainClassificationDAO) {
		this.mainClassificationDAO = mainClassificationDAO;
	}



	public MainClassification saveMainClassification(MainClassification mainClass) {
		mainClassificationDAO.saveMainClassification(mainClass);
		System.out.print("saved");
		return null;
	}

}
