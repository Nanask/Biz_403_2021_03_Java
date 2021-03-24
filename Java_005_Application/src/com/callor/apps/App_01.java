package com.callor.apps;

import java.util.Random;

/*
 * 25 ~ 50명 인원 있는 각 반에 pizza 간식을 지급하려고 한다.각 반의 학생들에게 
 * 1 조각씩 pizza를 지급하려고 한다
 * 학생수보다 부족하거나 6조각 이상 남지 않도록 pizza를 주문해야 한다
 * 몇 box의 pizza를 주문해야 하는지 코드로 구현하시오
 */

public class App_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		int pizzapcs = 6;
		int intMembers = 0;
		float pizzaBox = 0;
		
		intMembers = rnd.nextInt(26) + 25;
		
		pizzaBox =(float) intMembers / pizzapcs;
		
		boolean bYes = (intMembers % (pizzaBox * pizzapcs) == 0);
		if(bYes == false) {
			++pizzaBox;
			
			
		}
		System.out.println("======================");
		System.out.println("인원수:" + intMembers);
		System.out.println("피자판수:" + pizzaBox);
		System.out.println("전체조각:" 
					+ pizzaBox * pizzapcs);
		System.out.println("======================");
		
		
		
		
		
		

	}
}