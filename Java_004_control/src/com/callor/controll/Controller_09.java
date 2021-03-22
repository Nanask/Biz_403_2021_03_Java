package com.callor.controll;

import java.util.Random;

public class Controller_09 {

	public static void main(String[] args) {
		/*
		 * 0 ~100까지 난수 (임의숫자)를 생성하고 그 숫자가 짝수인가 판별파라.
		 */
		Random rnd = new Random();
		int num = 0;
		num = rnd.nextInt(33);

		if (num % 2 == 0) {
			System.out.println(num + "짝수");
		} else {
			System.out.println(num + "는 짝수 아님");

		}

	}
}
