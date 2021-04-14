package com.callor.score.model;

public class WordVO {
	
	private String english;
	private String Korea;
	private String conut;
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getKorea() {
		return Korea;
	}
	public void setKorea(String korea) {
		Korea = korea;
	}
	public String getConut() {
		return conut;
	}
	public void setConut(String conut) {
		this.conut = conut;
	}
	@Override
	public String toString() {
		return "WordVO [english=" + english + ", Korea=" + Korea + ", conut=" + conut + "]";
	}
	
	
	
	
	
	

}
