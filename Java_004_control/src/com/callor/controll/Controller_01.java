package com.callor.controll;

public class Controller_01 {

	public static void main(String[] args) {

		// 1~ 100까지의 숫자 중에서 3의 배수인 수들의 합, 4인 배수인 수들의 합, 3과 5의 배수의 합을 계산하고 결과를 출력

		// 3의배수, 4의 배수의 합을 구하기 위해 변수 선언을 한다.
		int intSum = 0;
		int intSum1 = 0;
		int intSum2 = 0;
		int intSum3 = 0;

		for (int i = 0; i < 100; i++) {

			int num = i + 1;
			if (num % 3 == 0) {
				System.out.println(num);
				/*
				 * 여기에서 else if를 사용하면 3의 배수이면서 4의 배수인 경우 3의 배수에는 함산(누적)이 되지만 4의 배수에는 누락이 된다.
				 */

			}
		}
		if (num % 4 == 0) {
		}
	}
}