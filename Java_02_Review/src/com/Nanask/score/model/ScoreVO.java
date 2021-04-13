package com.Nanask.score.model;

public class ScoreVO {
	
	private String num; //학번
	private String name; //이름
	private Integer kor = 0;
	private Integer eng = 0;
	private Integer math = 0;
//	Integer total;
//	Float avg;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getTotal() {
		Integer total = this.kor + this.eng + this.math; // this를 이용하여 합을 저장시킨다.
		return total;
	}
	public Float getAvg() {
		Float avg = (float) this.getTotal() / 3; 
		return avg;
	}
	@Override
	public String toString() {
		return "ScoreVO [num=" + num 
				+ ", name=" + name 
				+ ", kor=" + kor 
				+ ", eng=" + eng 
				+ ", math=" + math 
				+ ", total =" + this.getTotal()
				+ ", avg =" + this.getAvg() + "]";
	}
	
	
	
	
	

}
