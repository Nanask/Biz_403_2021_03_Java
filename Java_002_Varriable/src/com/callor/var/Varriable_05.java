package com.callor.var;

public class Varriable_05 {

	public static void main(String[] args) {
		
		int intNum = 1;
		int intSum = 0;
		
		intSum += intNum; //1
		
		intNum ++; // 2
		intSum += intNum; //intSum = 1 + 2

		intNum ++; // 1
		intSum += intNum; //

		intNum ++; // 1
		intSum += intNum; //
		
		intNum ++; // 1
		intSum += intNum;
	}
}
