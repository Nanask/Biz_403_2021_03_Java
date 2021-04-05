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

		if (strInput.trim().equals("QUIT")) {
			return null;

		} else {
			try {
				intNum = Integer.valueOf(strInput);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수 또는 QUIT만 입력하세요");
				continue;
			}
		}
		if (intNum < 0 || intNum > 100) {
			System.out.println("입력값 범위 초과");
			continue;

		}
		return null;

	}

}
