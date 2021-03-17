package com.callor.values;

public class Values_05 {
	
	public static void main(String[] args) {
		
		/*
		 * 코드에서 동등연산자(==)
		 * 어떤 값이 같은지 묻는 것
		 * 값이 같으면 결과는 true
		 * 값이 다르면 결과는 false
		 */
		
		System.out.println(3 == 3);
		System.out.println(4 == 3);
		System.out.println(5 == 1);
		
		System.out.println(3 > 3);
		System.out.println(3 < 3);
		
		System.out.println(4 > 3);
		System.out.println(4 < 3);
		
		System.out.println(3 >= 3);
		System.out.println(3 <= 3);
		
		System.out.println(4 >= 3);
		System.out.println(4 <= 3);
		
		// ! : 값이 서로 같지 아니한지 묻는 것
		// 	   값이 서로 다르냐?
		
		System.out.println(3 != 3);
		// System.out.println(3 <> 3); 자바 이외의 문법에서는 같은 말로 사용
		
	}

}
