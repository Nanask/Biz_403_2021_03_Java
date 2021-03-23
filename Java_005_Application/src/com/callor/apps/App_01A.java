package com.callor.apps;

import java.util.Random;

public class App_01A {
	
	/* 
	 * 25 ~50명 인원 있는 각 반에 pizza 간식을 지급하려고 한다. 
	 * 각 반의 학생들에게 1조각씩 pizza를 지급하려고 한다.
	 * 학생수보다 부족하거나 6조각(1박스) 이상 남지 않도록 pizza를 주문해야 한다.
	 * 몇 box의 pizza를 주문해야 하는지 코드로 구현하시오 
	 */
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		// 25부터 50까지의 수 중에서 1개를 만들어라
		int intMembers = rnd.nextInt(26) + 25; // 25~50까지의 수
		int pizzaPcs = 6; //조각수
		
		int pizzaBox = 0;
		// 정수 / 정수 => 몫이 몇개인가.
		// 필요한 BOX수와 같거나 1 작은 값이 만들어진다.
		pizzaBox = intMembers / pizzaPcs;
		
		boolean bYes = intMembers % (pizzaBox * pizzaPcs) == 0;
		
		//if( bYes == false) {
		if( !bYes ) { pizzaBox;
		}
		
		System.out.println("인원수 : " + intMembers);
		System.out.println("피자판수 : " + pizzaBox);
		
	}

}