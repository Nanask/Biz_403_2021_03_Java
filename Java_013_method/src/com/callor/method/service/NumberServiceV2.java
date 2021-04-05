package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV2 {

	Scanner scan;

	public NumberServiceV2() {
		// TODO Auto-generated constructor stub

		Scanner scan = new Scanner(System.in);
	}

	/*
	 * 정수를 키보드에서 입력받아 정수를 return하거나 : int QUIT를 입력하면 null을 return하라 : AND => Integer
	 * void 대신 integer를 넣자
	 */
	public Integer inputNum() {

		System.out.println("정수 0 ~ 100까지 중 입력");
		System.out.println("QUIT 입력하면 종료");
		System.out.println(">> ");
		String strNum = scan.nextLine();
		if (strNum.equals("QUIT")) {
			return null;
		} else {
			Integer intNum = Integer.valueOf(strNum);
			return intNum;
		}

//		Integer num1 = 0;
//		
//		
//		
//		if(num1.equals("QUIT")) {
//			num1 = scan.nextInt();
//			return num1;
//			
//		}else {
//			Integer num2 = Integer.valueOf(num1);
//			num2 = scan.nextInt();
//			
//			return num2;
	}
}
