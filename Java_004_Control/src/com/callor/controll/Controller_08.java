package com.callor.controll;

import java.util.Random;

public class Controller_08 {

	public static void main(String[] args) {

		Random rnd = new Random();

		// 어떤 멸영을 5번 반복하여 수행하겠다.
		for (int i = 0; i < 5; i++) {

			// 정수형 난수(임의정수)를 만들어서 num변수에 저장하고
			int num = rnd.nextInt();
			// 그 값을 출력하라.
			System.out.println(num);

		}
		System.out.println("======================================");

		for (int i = 0; i < 5; i++) {
			// 0~ 99까지의 정수를 만들어라
			// 0~ (100-1)
			int num = rnd.nextInt(100);
		}
		int num = rnd.nextInt(100);
		System.out.println(num);

		System.out.println("======================================");
		for (int i = 1; i < 5; i++) {
			// 0~ (10-1) 주에서 임의의 수를 지정

		}

	}
}