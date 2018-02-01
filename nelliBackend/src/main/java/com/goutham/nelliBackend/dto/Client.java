package com.goutham.nelliBackend.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1767408674457174486L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int catId;
	private int citiesId;
	private String name;
	private String mobile;
	private String webSite;
	private String details;
	private String imgUrl;
	private String address;
	private boolean status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public int getCitiesId() {
		return citiesId;
	}
	public void setCitiesId(int citiesId) {
		this.citiesId = citiesId;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", catId=" + catId + ", cityId=" + citiesId + ", name=" + name + ", mobile=" + mobile
				+ ", webSite=" + webSite + ", details=" + details + ", imgUrl=" + imgUrl + ", address=" + address
				+ ", status=" + status + "]";
	}
	

}
