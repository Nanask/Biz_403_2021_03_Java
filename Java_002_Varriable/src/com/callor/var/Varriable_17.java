package com.callor.var;

public class Varriable_17 {
	
	public static void main(String[] args) {
		
		/*
		 * 변수를 어떤값으로 시작할까
		 * 변수 값(저장된 값)이 어떻게 변화할까
		 */
		
		int intNum1 = 0;
		
		intNum1 = 100;
		System.out.println(intNum1); // 100
		intNum1 = 200;
		intNum1 = 300;
		
		intNum1 = 100 * 200;
		System.out.println(intNum1); // 20000
		
		intNum1++; //1증가
		++intNum1; //1증가
		
		System.out.println(intNum1); // 20002
		
		intNum1 = 50; // 20002 + 50 더한 값이 intNum1저장
		System.out.println(intNum1); // 20052
		
		int num2 = 3;
		
		// num2 += 10 : num2 == 13 저장
		// 2. intNum1에 13을 저장하라
		intNum1 = (intNum1 += 10);
		
		System.out.println(intNum1); // 13
	}

}
