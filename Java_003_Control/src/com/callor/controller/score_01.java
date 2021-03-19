package com.callor.controller;

public class score_01 {
	
	public static void main(String[] args) {

		// intSum 변수에 3과목 총점, intAng 변수에 평균을 계산하여 저장하고 다음과 같이 출력하라
		
		int intKor = 88;
		int intEng = 77;
		int intMath = 65;
		
		int intSum = 0;
		int intAvg = 0;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		String strKor = "국어";
		String strEng = "영어";
		String strMath = "수학";
		
		
		
		System.out.println("================================================");
		System.out.println("StrKor : " + intKor);
		System.out.println("StrEng : " + intEng);
		System.out.println("StrEng : " + intMath);
		System.out.println("================================================");
		System.out.printf("%d + %d + % d = %d", intKor , intEng , intMath , );
		
		
		/*
		 * printf() 사용하여 출력할때
		 * %d : 정수(십진수)
		 * 		%3d :  자릿수를 3개로 맞추고 값을 오른쪽으로 정렬
		 * %f : 실수(float)
		 * 		%3.2f : 소수점이하 둘째자리까지 표시
		 * %s : 문자열
		 * \n : Enter를 누른것처럼 줄바꿈을 실행
		 * \t : Tab 키를 누른것처럼 사이띄기를 일정하게 맞춰라 
		 *
		 */
		
		
		
		
		
	}

}
