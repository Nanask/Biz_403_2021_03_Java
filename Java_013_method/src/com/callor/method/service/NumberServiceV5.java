package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {

	Scanner scan;

	public NumberServiceV5() {
		// TODO Auto-generated constructor stub

		Scanner scan = new Scanner(System.in);

	}

	public Integer inputNum(String title) {

		String strInput = null;
		Integer intNum = 0;

		System.out.println(title + "의 값을 입력하세요");
		System.out.println("QUIT : 입력취소");
		System.out.println(">> ");
		strInput = scan.nextLine();

		while (true) {
			if (strInput.trim().equals("QUIT")) {
				return null;

			} else {
				try {
					intNum = Integer.valueOf(strInput);
				} catch (NumberFormatException e) {
					System.out.println("정수 또는 QUIT만 입력하세요");

				}

			}
			if (intNum < 0) { //결과값을 출력해야 되는것이 금액이여서 0보다 작은 값을 입력하면 안되므로 
				System.out.println("입력값 범위 초과");

			}

			return intNum;

		}

	}
}
