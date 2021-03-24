package com.callor.apps;

import java.util.Random;

/*
 * 정수형 배열 20개를 선언
 * 랜덤 클래스를 사용하여 1~ 100까지 난 수를 생성하여 배열에 저장
 * 배열에 저장된 정수 중 짝수가 저장된 최초의 위치(첨자)는 몇 번인가 출력합니다.
 */

public class App_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		// int intNums[] = new int[20]; 사용해도 문제 없음
		int[] intNums = new int[20];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;

		}
		for (int i = 0; i < intNums.length; i++) {

			if (intNums[i] % 2 == 0) {
				System.out.printf("%d번은 짝수", i);
				break;
			}
		}

	}
}
