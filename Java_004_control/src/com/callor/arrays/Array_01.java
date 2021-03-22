package com.callor.arrays;

import java.util.Random;

public class Array_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		// 정수값 10개를 저장할 변수를 선언하라
		// 정수형 배열 100개를 선언하라
		int[] intKors = new int[10]; // 정수범위내에서는 []안의 숫자는 변경 가능
		
		for(int i = 0 ; i < 100 ; i++) {
			//intKors[0] = rnd.nextInt(100) + 1
			//:
			//intKors[99] = rnd.nextInt(100) + 1
			
			intKors[i] = rnd.nextInt(100)+ 1 ;
			
		}
		int intSum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			
//			  intSum += intKors[0]
//			  :
//			  intSum += intKors[99]
			
			intSum += intKors[1];
		}
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println("학생 %d : %d" , i+1, intKors[i]);
		
		}
		System.out.println("총점: ");
		
		}

}
