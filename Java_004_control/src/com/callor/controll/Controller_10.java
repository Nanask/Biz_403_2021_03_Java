package com.callor.controll;
/*
 *  0~100까지 중의 임의의 정수 5개를 만들어서 그 수가 짝수인지 아니지를 출력하라.
 */

import java.util.Random;

public class Controller_10 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		int num3 = rnd.nextInt(100);
		int num4 = rnd.nextInt(100);
		int num5 = rnd.nextInt(100);
		
		/*
		 * 반복문을 사용하여 임의 정수 100을 만들고 그 수가 짝수인지 아닌지 판별하는 코드
		 */
		
		System.out.println("===================================================");
		for(int i = 0 ; i < 100 ; i++)	{
			int num = rnd.nextInt(100);
			if(num % 2 == 0 ) {
				System.out.println(num + "는 짝수");
			}else {
					System.out.println(num + "는 짝수 아님");
				}
			}
		}
	}


