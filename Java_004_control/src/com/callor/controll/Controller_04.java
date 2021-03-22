package com.callor.controll;

public class Controller_04 {
	
	public static void main(String[] args) {
		
		/* 1~ 100까지 숫자중에서
		 * 3의 배수의 합
		 * 4의 배수의 합
		 * 3의 배수이면서 5의 배수의 합
		 */
		
		int intSum3 = 0;
		int intSum4 = 0;
		int intSum5 = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 1;
			if(num % 3 == 0 ) {
				intSum3 += num ;
			}
			if(num % 4 == 0) {
				intSum4 += num;
			}
			if(num % 3 == 0 && num % 5 == 0) { // boolean 값의 AND 값이므로 3과 5의 공통된 배수를 찾는 수식이다.
				intSum5 += num;
			}
		}
		
	}

}
