package com.goutham.nelliBackend.dao;

import java.util.List;

import com.goutham.nelliBackend.dto.Client;

public interface ClientDao {
	
	Client get(int id);
	List<Client> list();
	boolean add(Client client);
	boolean update(Client client);
	boolean delete(Client client);
	List<Client> getCategorylistById(int catId);

}
