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
	
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	int num4 = 0;
	int num5 = 0;
	int num6 = 0;
	int num7 = 0;
	int num8 = 0;
	int num9 = 0;
	int num10 = 0;
	int sum = 0;
	Float floatAvg = (float)sum / 10;
	
	sum = num1;
	sum += num2;
	sum += num3;
	sum += num4;
	sum += num5;
	sum += num6;
	sum += num7;
	sum += num8;
	sum += num9;
	sum += num10;
	
	num1 = rnd.nextInt(100)+1;
	num2 = rnd.nextInt(100)+1;
	num3 = rnd.nextInt(100)+1;
	num4 = rnd.nextInt(100)+1;
	num5 = rnd.nextInt(100)+1;
	num6 = rnd.nextInt(100)+1;
	num7 = rnd.nextInt(100)+1;
	num8 = rnd.nextInt(100)+1;
	num9 = rnd.nextInt(100)+1;
	num10 = rnd.nextInt(100)+1;
	
	System.out.println("====================================");
	System.out.printf("학생1 : d%\n" , num1);
	System.out.printf("학생2 : d%\n" , num2);
	System.out.printf("학생3 : d%\n" , num3);
	System.out.printf("학생4 : d%\n" , num4);
	System.out.printf("학생5 : d%\n" , num5);
	System.out.printf("학생6 : d%\n" , num6);
	System.out.printf("학생7 : d%\n" , num7);
	System.out.printf("학생8 : d%\n" , num8);
	System.out.printf("학생9 : d%\n" , num9);
	System.out.printf("학생10 : d%\n" , num10);
	System.out.println("====================================");
	System.out.printf("총점 : %d, 학생 : %d\3.2" , sum , floatAvg);
	
	
	/*
	 * num 변수하고 intKor 이름하고 합하여 intKor1 ~ intKor5 처럼 만들수 있을거 같은데 불가능
	 * intKornum 이라고 작성하면 java는 intKornum라는 변수를 찾으려고 시도한다.
	 * intKornum =
	 */
	
		
	}

}
