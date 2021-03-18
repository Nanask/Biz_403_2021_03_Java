package com.callor.var;

public class Varriable_16 {
	
	public static void main(String[] args) {
	
		/*
		 * intDan, intNum 변수를 선언하고 3단 구구단을 출력하라
		 */
		//단을 표시하기 위한 변수
		int intDan = 3;
		//2~9까지의 숫자를 만들고 구구단을 계산하고 출력하기 위한 변수
		int intNum = 1;
		

		System.out.printf("%d x %d = %2d\n", intDan, intNum , intDan * intNum );
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum , intDan * intNum );
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum , intDan * intNum );
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum , intDan * intNum );
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum , intDan * intNum );
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum , intDan * intNum );
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum , intDan * intNum );
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum , intDan * intNum );
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum , intDan * intNum );

		//위 방법과 밑에 방법은 결과 값이 같음
		
		for(;intNum < 9;) {
			
			System.out.printf("%d x %d = %d\n", intDan, ++intNum, intDan * intNum);
		}
		
		
			
			
	
	}

}
