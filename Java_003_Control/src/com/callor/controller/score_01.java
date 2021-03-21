package com.callor.controller;

public class score_01 {
	
	public static void main(String[] args) {

		// intSum 변수에 3과목 총점, intAng 변수에 평균을 계산하여 저장하고 다음과 같이 출력하라
		
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		String strKor = "국어";
		String strEng = "영어";
		String strMath = "수학";

		int intSum = 0;
		int intAng = 0;
		
		intKor = 80;
		intEng = 77;
		intMath = 65;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		intAng = (intKor + intEng + intMath)/3;
		
		System.out.println("==========================================");
		System.out.println(strKor + " : " + intKor);
		System.out.println(strEng + " : " + intEng);
		System.out.println(strMath + " : " + intMath);
		System.out.println("------------------------------------------");
		System.out.printf("총점 : %d\t 평균 : %d\n" , intSum , intAng);
		System.out.println("==========================================");
		
		
		
		
		
		
		
		
		
		
		
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
