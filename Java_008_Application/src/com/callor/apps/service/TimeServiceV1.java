package com.callor.apps.service;

public class TimeServiceV1 {

	int[] nums;

	public TimeServiceV1() {
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
			for (int j = 2; j < i; j++) {
				//j 값은 굳이 0이 아닌 시작값을 for문안에서 설정해도 가능
				
				// method에 return ?? 명령문이 있으면 
				// 변수 = method() 형식으로 코드를 작성하고 method가 return 해준 결과값을
				// 변수에 저장할 수 있다.
				String dLines = LinesService.dLines(50);
				String sLines = LinesService.sLines(50);
				System.out.println( LinesService.dLines(50) );
				System.out.printf("d% * %d = d%\n" , nums[i] , j , nums[i] * j  );
				System.out.println(LinesService.sLines(50));
			}
			

		}
	}
}
