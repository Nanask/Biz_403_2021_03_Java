package com.callor.apps.service;

import java.util.Random;

//변수를 선언하는 곳! 선언만 할 뿐 값을 지정하거나 초기화를 하지 않는다.
public class PrimeServiceV2 {
	
	int[] intNum;
	//배열을 설정하여(값을 지정하여) 사용할 준비를 하는 곳
	public PrimeServiceV2() {
		intNum = new int[20];
	} 
	
	public void makeNums() {
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(51) + 50;
		}
		
		
	}
	public void printPrime() {
		
		for(int num : intNum) {
		//	int num에 intNum[0]부터 차례대로 num에 넣겠다는 말 
			//배열값인 []값을 표시하지 않아도 배열이 순서대로 들어간다는 의미
			
			int index = 0;
			for(index = 2 ; index < num ; index++) {
				if(num % index == 0) {
					break;
				}
			}
			// 중간에 break를 만났다.
			// index == num
			//이렇게 표시하는 것 보다 밑에부분처럼 처리하는게 오류 발생을 막을 수 있다.
			if( index >= num ) {
				System.out.println(num + "는 소수");
			}
		}
		
	}

}
