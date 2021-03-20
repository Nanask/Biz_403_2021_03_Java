package com.Nanask.re;

public class Review_03 {
	
	public static void main(String[] args) {
		//홀수
		int intNum = 0; 
		for(int i = 0; i < 10 ; i += 2) {
		intNum = i + 1;
			System.out.println(intNum);
		}
		
		//짝수???
		for(int i = 0; i < 10 ; i += 2 ); {
			System.out.println( );
		}
	System.out.println("--------------------------------------");	
		//짝수의 합
		intNum = 0;
		int intSum = 0;
		for(int i = 0; i < 10 ; i += 2) { // 반복문
			intSum += i;
		}
		System.out.println(intSum); 
		
		//홀수의 합
		intNum = 0;
		intSum = 0;
		for(int i=0; i < 10; i +=2) {
			intNum = i + 1;
			intSum += intNum;
		}
		System.out.println(intSum);

			
		
		
		
		
	}

}
