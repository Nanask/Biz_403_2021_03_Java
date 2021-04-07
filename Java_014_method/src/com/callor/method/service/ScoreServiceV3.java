package com.callor.method.service;

import java.util.Scanner;

public class ScoreServiceV3 {
	
	protected Scanner scan;
	protected InputServiceV2 inService;
	
	public ScoreServiceV3() {
		
		scan = new Scanner(System.in);
		inService = new InputServiceV2();
		
	}
	public Integer inputScore() {
		
		int intTotal = 0;
		float floatAvg = 0;
		
		Integer intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) { 
			//inService에서 QUIT를 입력하면 null값을 받게 해놨으므로 종료처리를 하고 싶다면
			//null값을 받게하여 종료시킨다.
			System.out.println("종료");
			return null;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if(intEng == null) {
			System.out.println("종료");
			return null;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if(intMath == null) {
			System.out.println("종료");
			return null;
		}
		
		intTotal = intKor;
		intTotal += intEng;
		intTotal += intMath;
		floatAvg = (float)intTotal / 3;
		System.out.printf("총점 : %d\n" , intTotal);
		System.out.printf("평균 : %3.2f" , floatAvg);
				
		
		
		
		
		return  null;
		
	}

}
