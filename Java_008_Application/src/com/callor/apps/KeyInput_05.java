package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String dLines = LinesService.dLines(30);
		
		System.out.println(dLines);
		System.out.println("정수를 입력하세요");
		System.out.print("정수 : ");
		int num = scan.nextInt();
		System.out.println(dLines);
		
		// 소수 판별을 하는 2~ (자신-1) 수로 나누었을때 나머지가 0인경우가
		// 한번도 없어야 한다.
		for(int i = 2 ; i < num ; i++) {
			
			if(num % i == 0) {
				
				System.out.println(num + "은 소수가 아닙니다");
				break;
				} else {
					System.out.println(num + "는 소수입니다");
			}
		}
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수입니다");
		}else {
			System.out.println(num + "는 짝수가 아닙니다");
		}
		
	}

}
