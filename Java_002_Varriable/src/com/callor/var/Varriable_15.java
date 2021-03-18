package com.callor.var;

public class Varriable_15 {
	
	public static void main(String[] args) {

		int intNum=0;
		int intSum=0;
		
		intNum += 2; // intNum = 2 intSum = 2
		intSum += intNum;
		intNum += 2; // intNum = 4 intSum = 6
		intSum += intNum;
		intNum += 2; // intNum = 6 intSum = 12
		intSum += intNum;
		intNum += 2; // intNum = 8 intSum = 20
		intSum += intNum;
		intNum += 2; // intNum = 10 intSum = 30
		intSum += intNum;
		
		System.out.printf(" 짝수의 합 : " + intSum );
		
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		
		
	
	}	

}