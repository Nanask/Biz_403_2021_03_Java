package com.callor.apps;

import java.util.Random;

/*
 * 5학급의 학생들에게 피자 간식을 지급한다.
 * 학급의 인원은 50~ 59명
 * 학급 인원은 Random 클래스를 이용하여 생성
 * 피자는 1box에 6조각
 */
public class App_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intMembers = new int[5];

		int pizzaBox = 0;
		int pizzaPcs = 6;
		int intTotal = 0;

		for (int i = 0; i < 5; i++) {
			intMembers[i] = rnd.nextInt(10) + 50;

		}

		for (int i = 0; i < 5; i++) {
			pizzaBox = intMembers[i] / 6;
			if (intMembers[i] % (pizzaBox * pizzaPcs) > 0) { pizzaBox++;

			}
		}
		System.out.println("인원수\t" + "피자 주문\t" + "전체조각수\t");
		System.out.println();
		
		

	}
}
