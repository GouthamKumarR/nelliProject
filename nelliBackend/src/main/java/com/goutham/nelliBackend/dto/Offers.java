package com.goutham.nelliBackend.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Offers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9026312434924834560L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int catId;
	private int cityId;
	private int clientId;
	private String offImageUrl;
	private String startDate;
	private String endDate;
	private String offerLink;
	private String content;
	private boolean status = true;
	private boolean specialOffer;
	   
	@Transient
	private MultipartFile file;
			
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public boolean isSpecialOffer() {
		return specialOffer;
	}
	public void setSpecialOffer(boolean specialOffer) {
		this.specialOffer = specialOffer;
	}
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
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getOffImageUrl() {
		return offImageUrl;
	}
	public void setOffImageUrl(String offImageUrl) {
		this.offImageUrl = offImageUrl;
	}
	
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Offers [id=" + id + ", catId=" + catId + ", cityId=" + cityId + ", clientId=" + clientId
				+ ", offImageUrl=" + offImageUrl + ", startDate=" + startDate + ", endDate=" + endDate + ", offerLink="
				+ offerLink + ", content=" + content + ", status=" + status + ", specialOffer=" + specialOffer
				+ ", file=" + file + "]";
	}
	
	
	

}
