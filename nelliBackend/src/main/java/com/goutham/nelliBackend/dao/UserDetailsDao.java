package com.goutham.nelliBackend.dao;

import java.util.List;

import com.goutham.nelliBackend.dto.Offers;
import com.goutham.nelliBackend.dto.UserDetails;

public interface UserDetailsDao {
	
	// user related operation
	UserDetails getByEmail(String email);
	UserDetails get(int id);

	List<UserDetails> list();
	boolean add(UserDetails user);
	boolean update(UserDetails user);
	boolean delete(UserDetails user);
		

}
