package com.callor.apps;

import java.util.Random;

/*
 * 정수형 배열 20개를 선언
 * 랜덤 클래스를 사용하여 1~100까지 난수를 생성하여 배열에 저장
 * 배열에 저장된 정수중 짝수들의 리스트를 출력하고 짝수들의 합을 계산하여 출력
 */

public class App_01A {
	/* 
	 * {} 내에 있는 코드는 최소화 하자
	 * 작은 일들로 분해하기
	 * 나누어서 정복하라 : Divide and Conquer
	 */

	public static void main(String[] args) {

		//공통된 값을 코드에 적용하고 싶을때 
		//배열의 크기를 변수에 설정해두고 코드내에서 공통으로 사용하기
		int numsLength = 20;
		
		Random rnd = new Random();

		int[] intNum = new int[20];
		int Sum = 0;

		for (int i = 0; i < numsLength; i++) {
			//선언되어있는 배열 값 저장하기
			intNum[i] = rnd.nextInt(100) + 1;

		}
		for (int i = 0; i < numsLength; i++) {
			//배열에 저장된 값을 읽은 값이 짝수인지 확인
			if (intNum[i] % 2 == 0) {
				//짝수라면 출력
				System.out.println(intNum[i] + "는 짝수");
			}

		}
		// intSum에 이전 코드에서 어떤 값이 저장되어 있을지도 모르기 때문에 clear하고 시작
		Sum = 0;
		for (int i = 0; i < numsLength; i++) {
			if (intNum[i] % 2 == 0) {
				//짝수이면 intSum에 합산(누적)하라
				Sum += intNum[i];
			}
		}
		System.out.printf("짝수들의 합 : %d\n" ,Sum);
	}
}