package com.callor.apps;

import java.util.Random;

public class App_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[50];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		for (int i = 0; i < intNums.length; i++) {

			System.out.print(intNums[i] + "\t");
			// 리스트를 한 줄에 출력
			if ((i + 1) % 5 == 0) {
				// 5번째 위치 값을 출력하고 Enter를 눌러서 다음 요스는 줄바꿈하도록 하라.
				System.out.println();
			}
		}
	}
}