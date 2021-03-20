package com.callor.controller;
/*
 * 명령어
 * 코딩을 할때 반드시 정확한 스펠링으로 사용해야 하는 중요한 keyword 들
 * 명령문
 * 명령어와 명령어가 조합되고, 다른 어떤 단어들이 조합되어 문장을 이루는 형태
 * = statement or 명령구문
 * 
 * 보통 명령문끝에 세미콜론(;) 있다. 한줄에 끝나는 명령문에 쓰인다.
 * 명령문이 그룹으로 설정되는 경우는 {} 가 있다. 다른 명령문들을 포함하는 명령문에 쓰인다.
 */

public class Cont_02 {

	public static void main(String[] args) {

		int num = 0;
		for(num = 0 ; num < 10 ; num ++) {
			System.out.println(num + 1);
		}
		for( int index = 0; index < 10 ; index ++) {
			System.out.println(index + 1);
	}
		/*
		 * 반복비교하기 위해 사용하는 변수를 i로 선언 및 초기화하고 조건문을 설정하는 일반적인 반복(구)문
		 * 
		 * for() 명령문에서는 {}안의 코드가 실제로 몇번 반복 실행 되는가?
		 */
		
		for(int i = 0 ; i < 10 ; i++) { 
			System.out.println(i + 1); // 1부터 시작하고 싶다면 i + 1 을 사용하면 가능
			
		//for안에서 선언된 값은 i를 또 사용해도 사용없다. 	
		}
		
		for(int i = 0 ; i < 10 ; i++) { 
			System.out.println(i + 1);
}
		

		for(int i = 0 ; i < 100 ; i++) { 
			System.out.println(i + 1);
		}
	}
		
}
