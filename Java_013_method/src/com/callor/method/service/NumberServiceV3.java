package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV3 {

	Scanner scan;

	public NumberServiceV3() {
		// TODO Auto-generated constructor stub

		Scanner scan = new Scanner(System.in);
	}

	/*
	 * 정수를 키보드에서 입력받아 정수를 return하거나 : int QUIT를 입력하면 null을 return하라 : AND => Integer
	 * void 대신 integer를 넣자
	 */
//	public Integer inputNum() {
//
//		System.out.println("정수 0 ~ 100까지 중 입력");
//		System.out.println("QUIT 입력하면 종료");
//		System.out.println(">> ");
//		String strNum = scan.nextLine();
//		Integer intNum = 0;
//		if (strNum.trim().equals("QUIT")) {
//			return null;
//		}
//		try {
//			intNum = Integer.valueOf(strNum);
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//		if (intNum > 0 || intNum < 100) {
//			System.out.println("정수 0 ~ 100까지 중 입력");
//		}
//		return intNum;

	public Integer inputNum() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("0 ~ 100까지 정수입력");
			System.out.println("QUIT 입력중단");
			System.out.println(">> ");
			String strInput = scan.nextLine();

			if (strInput.trim().equals("QUIT")) {
				return null;
			} else {

				// 1. 입력된값이 QUIT가 아니면 일단
				// 정수로 바꿔보자
				try {
					Integer intNum = Integer.valueOf(strInput);

					// 2. 정수이면 0 ~ 100까지 인지 알아보자
					if (intNum < 0 || intNum > 100) {
						System.out.println("범위를 벗어났음");
						System.out.println("0 ~ 100까지 만 입력");
						// 다시 입력하는 곳으로 가라
						continue; // continue는 단독으로 사용하는것이 불가능하고 반복문과 함께 사용해야 한다.
					}
					return intNum;
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("값은 숫자만 입력하세요");
					// 다시 입력하는 곳으로 가라!!
					continue;
				}
			}
		}
//			return null;
	}

}
