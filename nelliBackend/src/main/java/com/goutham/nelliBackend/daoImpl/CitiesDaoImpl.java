package com.goutham.nelliBackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.goutham.nelliBackend.dao.CitiesDao;
import com.goutham.nelliBackend.dto.Category;
import com.goutham.nelliBackend.dto.Cities;

@Repository("cityDAO")
@Transactional
public class CitiesDaoImpl implements CitiesDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public Cities get(int id) {
		return sessionFactory.getCurrentSession().get(Cities.class, Integer.valueOf(id));
	}

	public List<Cities> list() {
			String selectActiveCategory = "FROM Cities";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
				
						
		return query.getResultList();
	}

	public boolean add(Cities city) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Cities city) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Cities city) {
		// TODO Auto-generated method stub
		return false;
	}

}
