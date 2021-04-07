package com.callor.method.service;

public class ScoreServiceV1 {
	
	InputServiceV1 inV1;

	public ScoreServiceV1() {

		inV1 = new InputServiceV1();
	}

	public Integer inputScore() {
		inV1.inputValue("국어", 0, 100);
		
		Integer retNum = inV1.inputValue(null); 
		
		if(retNum == null) {
			System.out.println("종료");
			return null;
		}else {
			System.out.println("점수 : ");
		}
		return null;
	}
}
