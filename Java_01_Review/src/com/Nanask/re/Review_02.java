package com.Nanask.re;

public class Review_02 {

	public static void main(String[] args) {
		
		int intNum= 0;
		
//		for(;intNum < 5 ; ++intNum) { 
//			System.out.println(++intNum + ".우리나라"); 
//		//홀수
//			
//		}
//		
//		System.out.println("============================================");
//		intNum=0;
		for(;intNum < 5; intNum++) {
			System.out.println(intNum++ + ".우리나라");
		//짝수
		
		}
		
		System.out.println("---------------------------------------------");
		for(intNum = 0 ; intNum < 5 ; ++intNum) {
			System.out.println(intNum + ".우리나라");
		
		}
		System.out.println("---------------------------------------------");
		for(intNum = 0 ; intNum < 5 ;) {
			System.out.println(++intNum + ".우리나라");
		}
		
		System.out.println("---------------------------------------------");
		for(intNum = 0 ; intNum < 5 ; intNum++) {
			System.out.println(intNum + ".우리나라");
		}
		
		System.out.println("---------------------------------------------");
		for(intNum = 0 ; intNum < 5 ;) {
			System.out.println(intNum++ + ".우리나라");
		
	}
}
}