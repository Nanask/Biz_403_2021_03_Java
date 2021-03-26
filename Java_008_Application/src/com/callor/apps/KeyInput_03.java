package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String dLines = LinesService.dLines(35);
		String sLines = LinesService.sLines(35);
		System.out.println(dLines);
		System.out.println("두 수의 사칙연산");
		System.out.println(dLines);
		System.out.println("정수값을 입력하세요");
		System.out.print("정수 1 :");
		int num1 = scan.nextInt();
		System.out.print("정수 2 :");
		int num2 = scan.nextInt();
		System.out.println(sLines);
		System.out.println("+ , - , * , / 연산 순서대로 출력합니다");
		System.out.println(sLines);
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		
	}

}