package com.callor.apps.service;

import java.util.Random;

// 클래스 선언문(시작하는곳)
public class EvenServiceV1 {

	int[] intNum;
	int intSum;
	
	//생성자 method
	//클래스를 선언하면 자동으로 만들어지는 method
	//별도의 코드가 필요없다면 만들지 않아도 상관없다.
	//new EvenServiceV1() 를 치면 코드에서 호출되는 method
	//생성자 method에는 클래스 영역의 변수들을 초기화 생성하기 위한 코드들이 작성된다.
	public EvenServiceV1() {
		intNum = new int[100];
		intSum = 0;
	}
	
	/*
	 * 
	 */

	public void makeNums() {
		//랜덤을 쓸수 있도록 초기화하는 것
		// 랜덤도 선언문에서 시작할 수 있으나 여기서 시작하는게 약속이다.
		Random rnd = new Random();
		// intNums 배열 개수만큼 코드를 반복실행하라
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(101) + 1;
					}
	}
	/*
	 * 짝수(Even) / 홀수(Odd)
	 */

	public void printEven() {
		int nCount = 0;
		System.out.println("===================================");
		System.out.println("짝수들의 리스트");
		System.out.println("-----------------------------------");
		//intNums 배열 전체를 확인하여 짝수가 있으면 찾아서 출력하라.
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				System.out.println(intNum[i] + "는 짝수");

			}
		}
		System.out.println("짝수들의 개수 : " + nCount);
		System.out.println("====================================");
		
		
	}
	public void sumEven() {
		
		
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				intSum += intNum[i];
			}
		}
		System.out.printf("%d는 짝수의 합", intSum);
	}

}
