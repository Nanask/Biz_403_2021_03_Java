package com.callor.classes;

//배열 나중에 정하기 , Class

//50~ 100까지의 랜덤값 중 난수 하나를 구하여 약수리스트를 나타내고 그 약수들을 배열로 묶어라

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
		//정수 배열을 문자열로 나타내준것 
		//숫자를 문자로 바꿔주는 것이 아닌 배열을 문자형식으로 나열 시켜주는것
		System.out.println(Arrays.toString(divisor));
		System.out.println(Arrays.toString(divisor)+"TEST");
	}

}
