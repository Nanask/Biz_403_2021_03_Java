package com.callor.values;

public class print_01 {
	
	public static void main(String[] args) {
		
		//Console에 출력하는 명령문
		/*
		 * 빈라인(enter)만 출력하라
		 * NEW LINE 기호, 새로 줄바꿈 하기
		 * 
		 */
		
		System.out.println("A");
		System.out.println();
		System.out.println("B");
		
		System.out.println();
		
		/*
		 * print() 은 괄호안에 비어있는 채로 실행할 수 없다.
		 * 줄바꿈이 없이 값을 출력할때
		 * 예) 34가 
		 */
		
		System.out.print(3);
		System.out.print(4);
		
		/*
		 * 한줄에 연속된 결과를 출력한 후 다음줄에 다른 결과를 출력하고 싶으면
		 * println()을 한번 실행해 준다.
		 */
		
		System.out.println();
		System.out.println("======================================================");
		
		/*
		 * printf()
		 * form(형식)에 맞추어 출력하는 명령문
		 * 
		 * printf("형식문자열", 값들...)
		 * %와 함께 시작되는 기호들을 사용하여 출력되는 문자열 형식을 만들고 
		 * 실제 값들을 채워넣어서 문자열을 완성하여 출력하는 명령문이다. 
		 */
		
		
		System.out.printf("%d + %d + = %d" , 3,4,3+4);
		System.out.println();
		System.out.printf("%d * %d = %d" , 3, 3, 3*3 );
		
		
		System.out.println("3 * 3 = 3 * 3");
		System.out.println("25 * 33 = 253 * 33");
		
		System.out.printf("%d + %d + = %d" , 3, 3, 3*3);
		System.out.printf("%d + %d + = %d" , 25, 33, 253 * 33);
		
		/*
		 * printf() 는 형식에 맞추어서 출력하고자 할때
		 * %d : 정수를 표시하는 형식 기호
		 * %s : 문자열을 표시하는 형식 기호
		 * %f : 실수를 표시하는 형식 기호
		 * 
		 */
		
		
		
		
	}

}
