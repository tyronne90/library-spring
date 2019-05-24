package com.sgic.librarysystem.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import com.sgic.librarysystem.model.MainClassification;

class MainClassificationDAOImpl implements MainClassificationDAO{
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}



	public MainClassification saveMainClassification(MainClassification mainClass) {
		hibernateTemplate.save(mainClass);
		System.out.println("Save");
		return null;
	}

}
