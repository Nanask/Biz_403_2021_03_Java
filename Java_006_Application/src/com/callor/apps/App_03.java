package com.callor.apps;

import java.util.Random;

/*
 * 정수형 배열 20개를 선언합니다.
 * 랜덤 클래스를 사용하여 1~100까지 난 수를 생성하여 배열에 저장
 * 배열에 저장된 정수 중 짝수들이 몇 번 위치에 저장되어 있는지 리스트를 출력
 */

public class App_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intNums = new int [20];
		
		for(int i = 0 ; i < intNums.length ; i++) {
			
			intNums[i] = rnd.nextInt(100) + 1;
		}
		// 요소 : 배열의 몇번째 값
		// 위치 : 배열의 몇번째
		// 첨자 : 배열의 몇번째 인가를 알려주는 값
		for(int i = 0 ; i < intNums.length ; i++) {
			if(intNums[i]% 2 == 0) {
				//몇번째 위치(요소, 첨자)에 저장되어 있나?
				System.out.println(i);
			}
		
		
		}
	}

}
