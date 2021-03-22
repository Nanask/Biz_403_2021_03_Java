package com.callor.controll;

public class Controller_03 {
	
	public static void main(String[] args) {
		
		int intNum1 = 30;
		int intNum2 = 40;
		
		//intNum1이 20보다 크고, 50보다 작냐?
		// 50 > intNum1 > 20 => 파이썬을 제외하고 사용불가
		// true And true
		boolean bYes = intNum1 > 20 && intNum1 <50; // true + true = true
		// true OR false		
		bYes = intNum1 > 20 || intNum1 > 50; // true * false = false
		
		// true AND false
		bYes = 50 > 20 && 20 > 50 ; // true + false = true
		
		
	}

}
