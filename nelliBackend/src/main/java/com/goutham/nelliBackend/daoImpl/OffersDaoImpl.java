package com.goutham.nelliBackend.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.goutham.nelliBackend.dao.OffersDao;
import com.goutham.nelliBackend.dto.Offers;

@Repository("offersDao")
@Transactional
public class OffersDaoImpl implements OffersDao {

	@Autowired
	SessionFactory sessionFactory;

	public Offers get(int id) {
		return sessionFactory.getCurrentSession().get(Offers.class, Integer.valueOf(id));
	}

	public List<Offers> list() {
		String selectActiveOffers = "FROM Offers";

		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveOffers);

		//query.setParameter("status", true);

		return query.getResultList();
	}

	public List<Offers> getListOffersById(int id) {

		String selectActiveoffers = "FROM Offers WHERE status = :status AND clientId = :clientId";

		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveoffers);

		query.setParameter("status", true);
		query.setParameter("clientId", id);

		return query.getResultList();
	}

	public boolean add(Offers offers) {
		try {
			sessionFactory.getCurrentSession().persist(offers);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean update(Offers offers) {
		try {
			sessionFactory.getCurrentSession().update(offers);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Offers offers) {
		offers.setStatus(false);

		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(offers);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Offers> listSpecialOffers() {
		String selectActiveOffers = "FROM Offers WHERE status = :status AND specialOffer = :specialOffer";

		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveOffers);

		query.setParameter("status", true);
		query.setParameter("specialOffer", true);

		return query.getResultList();
	}

}
