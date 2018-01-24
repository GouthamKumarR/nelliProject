package com.goutham.nelliBackend.dao;

import java.util.List;

import com.goutham.nelliBackend.dto.Offers;

public interface OffersDao {
	
	Offers get(int id);
	List<Offers> list();
	List<Offers> getListOffersById(int id);
	boolean add(Offers offers);
	boolean update(Offers offers);
	boolean delete(Offers offers);

}
