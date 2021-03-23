package com.callor.apps;

import java.util.Random;

public class App_02 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intMembers = new int[5];

		// intMembers의 0번째 배열에....
		// 난수를 만들어 저장하라
		intMembers[0] = 30; // rnd.nextInt(26) + 25; 
		//랜덤이 아닌 각 반의 인원수를 넣어 계산도 할 수 있다.

		intMembers[1] = rnd.nextInt(26) + 25;
		intMembers[2] = rnd.nextInt(26) + 25;
		intMembers[3] = rnd.nextInt(26) + 25;
		intMembers[4] = rnd.nextInt(26) + 25;
		// 배열의 개수가 5개 이므로 첨자의 최대값은 4까지 이다.
		// 첨자의 최대값 = 배열의 개수 -1

		// 두가지는 같은 식이다. 개수가 2개 이상일때는 for문을 이용한다.
		// 밑에 for문에서 변수가 저장되었으므로 위에 있는 수식은 성립하지 않는다.
		for (int i = 0; i < 5; i++) {
			intMembers[i] = rnd.nextInt(26) + 25;

		}
		for (int i = 0; i < 5; i++) {
			// System.out.println("인원수 : " + intMembers[i]);
			System.out.printf("%반 인원수 : %d\n", i + 1, intMembers[i]);

		}
		
		for(int i = 0 ; i < 5 ; i++) {
			
			int pizzaBox = intMembers[i] / 6;
			if(intMembers[i] % (pizzaBox * 6) > 0) {
				pizzaBox++;
			}
			System.out.printf("%반 인원수 : %d, 피자주문 : %d\n" , (i+1) , intMembers[i], pizzaBox);
		}

	}
}
