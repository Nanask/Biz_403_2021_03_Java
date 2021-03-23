package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {
		
	int intSum = 0;
	
	Random rnd = new Random();
	
	for(int i = 0 ; i<25 ; i++) {
		
		int intMembers = rnd.nextInt(25)+1;
		
		if(intMembers % 6 == 0);
		
		intSum += intMembers;
		
	}
	System.out.println("주문할 피자 판 수" + "intSum");

}
}