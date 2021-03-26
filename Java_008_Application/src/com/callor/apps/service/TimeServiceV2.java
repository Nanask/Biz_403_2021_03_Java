package com.callor.apps.service;

public class TimeServiceV2 {

	int[] nums;

	public TimeServiceV2() {
		nums = new int[8];
	}

	public void makeTimes() {

		System.out.println("==============================================");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 2;
			System.out.printf("%d단", nums[i]);
		}
		System.out.println("==============================================");
	}
	
	public void printTimes() {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				
				String dLines = LinesService.dLines(50);
				String sLines = LinesService.sLines(50);
				System.out.println( dLines );
				System.out.printf("d% * %d = d%\n" , nums[i] , j , nums[i]*j+1  );
				System.out.println(sLines);
			}
			

		}
	}
}
