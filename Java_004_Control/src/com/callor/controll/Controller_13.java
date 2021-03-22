package com.callor.controll;

import java.util.Random;

public class Controller_13 {

	public static void main(String[] args) {

		/*
		 * intSum변수를 어디에 선언할까? 짝수들을 어디에서 합산(누적)할까 어디에서 출력할까
		 */

		Random rnd = new Random();
		int Sum = 0;
		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt(100) + 1;
			if (num % 2 == 0) {
				Sum += num;
			}
		}
		System.out.println("================================");
		System.out.printf("합계 : %d\n", Sum);
		System.out.println("================================");
	}

}

