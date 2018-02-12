package com.goutham.nelliBackend.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.goutham.nelliBackend.dao.ContactDAO;
import com.goutham.nelliBackend.dto.ContactUs;


@Repository("contactDAO")
@Transactional
public class ContactDAOImpl implements ContactDAO{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addContact(ContactUs contactDAO) {
		
		sessionFactory.getCurrentSession().persist(contactDAO);
		
		return false;
	}

}
