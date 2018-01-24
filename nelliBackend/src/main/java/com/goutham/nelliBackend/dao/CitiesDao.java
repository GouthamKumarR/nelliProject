package com.goutham.nelliBackend.dao;

import java.util.List;

import com.goutham.nelliBackend.dto.Cities;

public interface CitiesDao {
	
	Cities get(int id);
	List<Cities> list();
	boolean add(Cities city);
	boolean update(Cities city);
	boolean delete(Cities city);

}
