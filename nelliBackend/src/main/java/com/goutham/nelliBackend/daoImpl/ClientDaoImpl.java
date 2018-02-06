package com.goutham.nelliBackend.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.goutham.nelliBackend.dao.ClientDao;
import com.goutham.nelliBackend.dto.Client;

@Repository("clientDao")
@Transactional
public class ClientDaoImpl implements ClientDao {

	@Autowired
	SessionFactory sessionFactory;

	public Client get(int id) {
		return sessionFactory.getCurrentSession().get(Client.class, Integer.valueOf(id));
	}

	public List<Client> list() {
		String selectActiveClient = "FROM Client WHERE status = :status";

		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveClient);

		query.setParameter("status", true);

		return query.getResultList();
	}

	public boolean add(Client client) {
		try {
			sessionFactory.getCurrentSession().persist(client);
			
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}

	public boolean update(Client client) {

		try {
			sessionFactory.getCurrentSession().update(client);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Client client) {
		client.setStatus(false);

		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(client);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public List<Client> getCategorylistById(int catId) {
		String selectActiveCategory = "FROM Client WHERE status = :status AND catId = :catId";

		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);

		query.setParameter("status", true);
		query.setParameter("catId", catId+"");

		return query.getResultList();
	}

}
