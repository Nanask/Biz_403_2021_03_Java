package com.callor.controll;

import java.util.Random;

public class Controller_14 {
	
	/*
	 * 1~100까지 범위의 랜덤수로 국어, 영어, 수학 과목의 점수를 생성
	 * 각 과목의 점수를 변수에 저장하고 총점과 평균을 계산하여 출력
	 * 단 평균은 소수점자리 두번째까지 표기
	 */
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		int intSum = 0;
		
		intKor = rnd.nextInt(100) + 1;
		intEng = rnd.nextInt(100) + 1;
		intMath = rnd.nextInt(100) + 1;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		float floatAvg = (float)intSum / 3;
		
		System.out.println("==================================");
		System.out.printf("국어 : %d\n", intKor);
		System.out.printf("영어 : %d\n", intEng);
		System.out.printf("수학 : %d\n", intMath);
		System.out.printf("총점 : %d\t  평균 : %3.2f\n", intSum, floatAvg);
		System.out.println("===================================");
		
		
		
	}

}
