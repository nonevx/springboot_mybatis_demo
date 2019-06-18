package com.vxzones.pojo;

public class InfoA {
	private int infoId; 
	private String title;
	private String authors;
	private String affiliation;
	private String abstracts;
	private String keyWords;
	private String oralPoster;
	private String email;
	
	public int getInfoId() {
		return infoId;
	}
	public void setInfoId(int uuid) {
		this.infoId = uuid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getAffiliation() {
		return affiliation;
	}
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}
	public String getAbstracts() {
		return abstracts;
	}
	public void setAbstracts(String abstracts) {
		this.abstracts = abstracts;
	}
	public String getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	public String getOralPoster() {
		return oralPoster;
	}
	public void setOralPoster(String oralPoster) {
		this.oralPoster = oralPoster;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
