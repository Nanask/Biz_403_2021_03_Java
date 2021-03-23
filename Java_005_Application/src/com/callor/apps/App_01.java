package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {
	
	Random rnd = new Random();
		
		int intMembers = 0;
		float floatpizza = 0;
		
		intMembers = rnd.nextInt(25)+26;
		
		floatpizza = (float)intMembers / 6 ;
		
		
		System.out.println("주문할 피자 판 수" + floatpizza );
		}
}
