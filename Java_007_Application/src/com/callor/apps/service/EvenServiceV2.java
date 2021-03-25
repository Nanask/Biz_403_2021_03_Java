package com.callor.apps.service;

import java.util.Random;

// EvenServiceV1 코드를 복사해온것처럼 사용하겠다. 필요한 일부만 내 방식대로 변환해서 사용하고 싶다. 

/*
 * 자바프로그래밍에서 상속
 * V2 클래스에서는 V1클래슬 상속했다.
 * v1에 작성한(선언한) 변수, method 코드를 그대로 이어받아서 사용하겠다.
 * 
 * V1에 작성된 method들의 코드를 그대로 사용하면서 일부 method의 코드를 변경, 확장, 기능개선을 하여
 * 내 프로젝트에 적용하겠다.  => 상속의 가장 큰 이유
 */
public class EvenServiceV2 extends EvenServiceV1 { 


	public EvenServiceV2() {
		
		intNum = new int[100];
		intSum = 0;
	}
	
	// 객체지향 상속의 특징을 잘 표현한 부분
	public void printEven() {
		
		int nCount = 0;
		System.out.println("===================================");
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				System.out.printf("%4d",intNum[i] + "는 짝수");
				nCount++;
				if(nCount % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}