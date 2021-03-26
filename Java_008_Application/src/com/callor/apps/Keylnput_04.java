package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class Keylnput_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] nums = new int[5];
		int intSum = 0 ;
		String dLines = LinesService.dLines(20);
		
		for(int i = 0 ; i <nums.length ; i++) {
			
			int num = i + 1;
			System.out.println(dLines);
			System.out.println("정수 5개를 입력합니다");
			System.out.printf("%d번 정수 : ", num);
			nums[i] = scan.nextInt();
		}
		System.out.println(dLines);
		for(int i = 0 ; i <nums.length ; i++) {
			
			intSum += nums[i];
		
		
		
		System.out.printf("%d\t 리스트 : , nums[i]" );
		System.out.printf("%d 정수들의 합 : , intSum");
		}
	}
}