package com.callor.controller;

public class Cont_01 {
	
	public static void main(String[] args) {
		
		int intNum = 0;
		
		intNum++; // 단독으로 사용할때는 위치 상관없음
		//f는 , ln은 +
		
		System.out.println("========================================");
		
		// ++가 다른 명령문과 함께 사용될때는 변수의 앞, 뒤에 따라 결과가 달라진다.
		System.out.println(intNum++ + ".우리나라 대한민국\n");
		System.out.println(intNum++ + ".우리나라 대한민국\n");
		System.out.println(intNum++ + ".우리나라 대한민국\n");
		System.out.println(intNum++ + ".우리나라 대한민국\n");
		System.out.println(intNum++ + ".우리나라 대한민국\n");
		System.out.println(intNum++ + ".우리나라 대한민국\n");
		System.out.println(intNum++ + ".우리나라 대한민국\n");
		System.out.println(intNum++ + ".우리나라 대한민국\n");
		System.out.println(intNum++ + ".우리나라 대한민국\n");
		System.out.println(intNum++ + ".우리나라 대한민국\n");
		
		//같은 코드를 복사붙이기 하지 않고 명령문을 이용하여 반복하도록 수행
		
		//main() 메서드의 코드는 topdown으로 진행이 된다.
		//코드가 정상 진행되는 과정에서 for() 명령문을 만나면 조건을 검사하고 조건에 따라 반복하는 코드가 실행된다.
		//이처럼 Topdown으로 진행되는 코드의 흐름을 바꾸는 명령을 "제어명령", "comtrol 명령"이라고 한다.
		
		intNum=0;
		for(; intNum < 10;) { //for문의 세미콜론은 명령을 구분하기 위함
			System.out.println(++intNum + ".우리나라 대한민국");
			
				
				
			
			}
		intNum = 0;
		for(; intNum < 10; intNum++) { //for문에서 명령을 별도로 지정
			System.out.println(intNum ++);
		
		
		
		}
		/*
		 * 1.for() 명령문을 만나면 intNum=0을 실행한다.
		 * 이 명령은 반복횟수와 관계없이 최초에 단 한번만 실행된다.
		 * 
		 * 2.intNum<10 을 실행하여 조건을 검사한다.
		 * 결과값이 true 이면 {}의 명령을 싱행한다.
		 * 
		 * 3.명령 실행이 끝나면 다시 for()명령문 시작으로 되돌아 온다.
		 * 
		 * 4.증가 : intNum++ 명령을 실행
		 * 
		 * 5.조건검사 : intNum < 10
		 * 
		 * 증가, 조건검사를 반복하면서 조건검사 결과가 false가 될때까지 반복하여 {}명령을 실행한다.
		 * = 조건검사 결과가 true 인 동안
		 * 
		 */
		
		for(intNum = 0; intNum<10 ; intNum++) {
			System.out.println(intNum);
		}
		
		}
		
		
		
	}


