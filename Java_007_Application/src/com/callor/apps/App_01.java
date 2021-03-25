package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		int[] intNums = new int[20];

		Random rnd = new Random();

		for (int i = 0; i < 20; i++) {
			
			intNums[i] = rnd.nextInt(100) + 1; // 51 ~ 101

		}
		
		// intNums[0] = ...  intNums[1] =....  intNums[19] = ....
		
		
		for (int i = 0; i < intNums.length; i++) {
			// 57
			for(int j = 2; j< intNums[i]; j++) {
				
				//1 과 자기 자신 이외에 나눠지면 안된다. 2 3 5 7 11 13 17 19
				//1과 자기자신 -1 이외에 나눠지면 안된다.
				boolean bYes = (intNums[i] % j == 0);
				
				if (bYes == false) {
				
				}
				
			}

			System.out.println(intNums[i]);
		}
		
		for(int i = 2 ; i < intNums.length ; i++) {
		int	icount = 0;
		if(intNums)
		}

	}
}
