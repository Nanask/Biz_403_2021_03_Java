package com.callor.controll;

public class Controller_01 {
	// 1~ 100까지의 숫자 중에서 3의 배수인 수들의 합, 4인 배수인 수들의 합, 3과 5의 배수의 합을 계산하고 결과를 출력

	public static void main(String[] args) {

		//3의 배수의 합, 4의 배수의 합을 구하기 위해 변수를 선언한다.
		int sum1 = 0;
		int sum2 = 0;
		//3과 5의 배수의 합을 구하기 위해 변수를 선언한다.
		int sum3 = 0;
		
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			
			//3의 배수일때
			if (num % 3 == 0) {
				System.out.println(num);
			}
			//4의 배수일때
			if (num % 4 == 0) {
				System.out.println(num);
			}
			
			/*
			 *num값이 3의 배수이면 num값을 sum1변수에 누적하라
			 *누적하다 : sum1 변수에 담긴 값과 num값 (새로운값)을 덧셈하여 다시 sum1 변수에 저장하라. 
			 */
			if (num % 3 == 0) {
				sum1 += num;
			}
			/*
			 * 여기에서 else if를 사용하면 3의 배수이면서 4의 배수인 경우 3의 배수에는 합산(누적)이 되지만
			 * 4의 배수에는 누락이 된다.
			 */
			if (num % 4 == 0) {
				sum2 += num;
			}
			
			//3의 배수이면서 5의 배수를 구하는 값
			if (num % 3 == 0) {
				if (num % 5 == 0) {
					sum3 += num;
			// 3의 배수이자 5의 배수인 공통된 값의 합만 구해야 하기 때문에 if 안에 if식을 사용		
				}
			}
		}
		
		System.out.println("=======================================");
		System.out.printf("3의 배수 : %d\n", sum1);
		System.out.printf("4의 배수 : %d\n", sum2);
		System.out.printf("3 AND 5의 배수 : %d\n", sum3);
		System.out.println("=======================================");
		
	}
}