package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		int[] intNums = new int[20];

		Random rnd = new Random();

		for (int i = 0; i < 20; i++) {
			intNums[i] = rnd.nextInt(51) + 50;

		}
		for (int i = 2 ; i < 20; i++) {
			for (int j = 2 ; j < 20; j++) {
				boolean bYes = (intNums[i] % j == 0);
				if(bYes == true) {
					++intNums[i];
				
				}
			}
		}
		System.out.println(intNums);
	}
}
