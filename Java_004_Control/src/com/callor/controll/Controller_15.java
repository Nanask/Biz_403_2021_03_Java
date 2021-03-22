package com.callor.controll;

import java.util.Random;

/*
 * 학생 10명의 국어 점수를 저장할 변수 선언
 * 1 ~ 100까지 범위의 임의 점수를 생성하여 변수에 저장
 * 총점과 평균을 계산하여 출력
 */

public class Controller_15 {

	public static void main(String[] args) {
	
	Random rnd = new Random();
	
	int intKor1 = 0;
	int intKor2 = 0;
	int intKor3 = 0;
	int intKor4 = 0;
	int intKor5 = 0;
	int intKor6 = 0;
	int intKor7 = 0;
	int intKor8 = 0;
	int intKor9 = 0;
	int intKor10 = 0;
	
		/*
	 	* num 변수와 intKor 이름과 합하여 intKor1 ~ 처럼 만들 수 있을거 같은데 불가하다.
	 	* intKornum 으로 작성하면 java는 intKornum라는 변수를 찾으려고 시도한다.
	 	*/
		//intKornum = rnd.nextInt(100) + 1;
		//"intKor" + num = rnd.nextInt(100) + 1;
		// 이렇게 만들면 또다른 변수를 찾으려 하기 때문에 표시할 수 없다.
	
	int sum = 0;
	Float floatAvg = (float)sum / 10;
	
	int intSum = 0;
	intSum += intKor1;
	intSum += intKor2;
	intSum += intKor3;
	intSum += intKor4;
	intSum += intKor5;
	intSum += intKor6;
	intSum += intKor7;
	intSum += intKor8;
	intSum += intKor9;
	intSum += intKor10;
		
	intKor1 = rnd.nextInt(100)+1;
	intKor2 = rnd.nextInt(100)+1;
	intKor3 = rnd.nextInt(100)+1;
	intKor4 = rnd.nextInt(100)+1;
	intKor5 = rnd.nextInt(100)+1;
	intKor6 = rnd.nextInt(100)+1;
	intKor7 = rnd.nextInt(100)+1;
	intKor8 = rnd.nextInt(100)+1;
	intKor9 = rnd.nextInt(100)+1;
	intKor10 = rnd.nextInt(100)+1;
	
	
	System.out.println("====================================");
	System.out.printf("학생1 : d%\n" , intKor1);
	System.out.printf("학생1 : d%\n" , intKor2);
	System.out.printf("학생1 : d%\n" , intKor3);
	System.out.printf("학생1 : d%\n" , intKor4);
	System.out.printf("학생1 : d%\n" , intKor5);
	System.out.printf("학생1 : d%\n" , intKor6);
	System.out.printf("학생1 : d%\n" , intKor7);
	System.out.printf("학생1 : d%\n" , intKor8);
	System.out.printf("학생1 : d%\n" , intKor9);
	System.out.printf("학생1 : d%\n" , intKor10);
	
	System.out.println("====================================");
	System.out.printf("총점 : %d, 학생 : %d\3.2" , sum , floatAvg);
	
	
		
	}

}
