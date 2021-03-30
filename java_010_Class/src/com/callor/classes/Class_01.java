package com.callor.classes;

import java.util.Arrays;
import java.util.Random;

public class Class_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intNum;
		intNum = rnd.nextInt(51) + 50;
		
		//i값이 0에서 시작하여 1씩 증가하면서 100미만인 경우 {} 명령들을 실행하라
		//i값은 0 ~ 99 ( 100 - 1 )
		for(int i = 0 ; i < 100 ; i++) {
		}
		System.out.println("난수 : " + intNum);
		//i값은 2 ~ (intNum - 1 ) 연속으로 생성
		//intNum의 약수가 몇개인가를 구하기
		int nCount = 0 ;
		for(int i = 2 ; i < intNum ; i++) {
			
			if(intNum % i == 0) {
				nCount++;
			}
		}
		System.out.println("약수의 개수 : " + nCount);
		
		
		int[] divisor = new int[nCount]; // new int[intNum]으로 할경우 남는 배열이 생기기 때문에 낭비다.
		
		int index = 0;
		for(int i = 2 ; i < intNum ; i++) {
			if(intNum % i == 0) {
				divisor[index++] = i;
			}
		}
		System.out.println(Arrays.toString(divisor));
	}

}
