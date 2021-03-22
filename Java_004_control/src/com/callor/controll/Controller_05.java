package com.callor.controll;

public class Controller_05 {
	
	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 4;
		
		boolean bYes = num1 % 3 == 0
				&& num2++ % 4 == 0;
		
		bYes = num1 % 3 == 0 
				&& (++num2) % 4 == 0; 
		
	}

}
