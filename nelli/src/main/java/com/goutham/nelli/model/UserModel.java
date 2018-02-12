package com.goutham.nelli.model;

import java.io.Serializable;


public class UserModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String fullName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	private String role;
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", fullName=" + fullName + ", role=" + role + "]";
	}
	
	
		
}
