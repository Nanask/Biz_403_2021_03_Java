package com.callor.method.service;

public class ScoreServiceV1 {
	
	InputServiceV1 inV1;

	public ScoreServiceV1() {

		inV1 = new InputServiceV1();
	}

	public Integer inputScore() {
		inV1.inputValue("국어", 0, 100);
		Integer retNum = null;
		
		if(retNum == null) {
			return null;
		}else {
			
		}
		return null;
	}
}
