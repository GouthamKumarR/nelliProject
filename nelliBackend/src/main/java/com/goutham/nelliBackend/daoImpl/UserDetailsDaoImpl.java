package com.goutham.nelliBackend.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.goutham.nelliBackend.dao.UserDetailsDao;
import com.goutham.nelliBackend.dto.UserDetails;

@Repository("userDetailsDao")
@Transactional
public class UserDetailsDaoImpl implements UserDetailsDao {

	@Autowired
	SessionFactory sessionFactory;

	public UserDetails getByEmail(String email) {
		return null;
	}

	public UserDetails get(int id) {
		return sessionFactory.getCurrentSession().get(UserDetails.class, Integer.valueOf(id));
	}

	public List<UserDetails> list() {
		String selectUserDetails = "FROM UserDetails";

		Query query = sessionFactory.getCurrentSession().createQuery(selectUserDetails);

		return query.getResultList();
	}

	public boolean add(UserDetails user) {
		try {
			sessionFactory.getCurrentSession().persist(user);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean update(UserDetails user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(UserDetails user) {
		// TODO Auto-generated method stub
		return false;
	}

}
