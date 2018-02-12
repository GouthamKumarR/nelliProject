package com.goutham.nelli.model;

import java.io.Serializable;

public class OffersBean implements Serializable{
	
	private int id;
	private String catName;
	private String cityName;
	private String clientName;
	private String phone;
	private String imageUrl;
	private String offerLink;
	private String content;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getOfferLink() {
		return offerLink;
	}
	public void setOfferLink(String offerLink) {
		this.offerLink = offerLink;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "OffersBean [id=" + id + ", catName=" + catName + ", cityName=" + cityName + ", clientName=" + clientName
				+ ", phone=" + phone + ", imageUrl=" + imageUrl + ", offerLink=" + offerLink + ", content=" + content
				+ "]";
	}
	
	
	
	

}
