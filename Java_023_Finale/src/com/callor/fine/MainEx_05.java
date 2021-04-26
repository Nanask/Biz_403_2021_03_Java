package com.callor.fine;

import java.util.Random;

public class MainEx_05 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int[] nums = new int[100];
		
		//100개의 배열에 임의 정수 100개를 저장
		
		for(int i = 0; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		
		for(int i = 0 ; i < nums.length ; i++) {
			
			int index = 0;
			
			for(index = 2 ; index < nums.length ; index++) {
				if(nums[i] % index == 0) {
					break;
				}
				//소수는 1과 자기자신의 숫자 이외에 나눠지지 않는다.
				//nums[i] = 10 index = 1,2,
				
			}
			if(nums[i] <= index) {
				System.out.println(nums[i] + "는 소수이다.");
				
			}else {
				System.out.println(nums[i] + "는 소수가 아니다.");
			}
		}

		
	}
	
	
}
