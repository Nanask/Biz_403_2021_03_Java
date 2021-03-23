package com.callor.apps;

import java.util.Random;
/*
 * 5명 학생의 성적을 계산합니다.
 * 과목은 국어(intKor) , 영어(intEng), 수학(intMaht)이며
 * 과목의 점수는 Random클래스를 사용하여 50 ~ 100까지 생성하여 사용합니다.
 */

public class App_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		// 과목 3가지를 학생 수 만큼 배열을 선언한다.
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];

		int Kor = 0;
		int Eng = 0;
		int Math = 0;

		// 가상의 점수를 생성하기
		for (int i = 0; i < 5; i++) {
			Kor = rnd.nextInt(51) + 50;
			Eng = rnd.nextInt(51) + 50;
			Math = rnd.nextInt(51) + 50;
			intKor[i] = Kor;
			intEng[i] = Eng;
			intMath[i] = Math;

		}
		// 학생별로 총점과 평균을 계산하여 저장해주기
		
		int[] Sum = new int[5];
		float[] floatAvg = new float[5];
		
		for (int i = 0; i < 5; i++) {
			Sum[i] = intKor[i];
			Sum[i] += intEng[i];
			Sum[i] += intMath[i];
			floatAvg[i] = (float) Sum[i] / 3;

		}
		int intKorTotal = 0;
		int intEngTotal = 0;
		int intMathTotal = 0;
		int intAllTotal = 0;
		
		
		
		//리스트 출력하기
		System.out.println("================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "\t");
			System.out.print(intKor[i] + "\t") ;
			System.out.print(intEng[i] + "\t") ;
			System.out.print(intMath[i] + "\t") ;

			System.out.print(Sum[i] + "\t");
			System.out.printf("%3.2f",floatAvg[i]);
			System.out.println();
			
			intKorTotal += intKor[i];
			intEngTotal += intEng[i];
			intMathTotal += intMath[i];
			
		}
		System.out.println("==============================================");
		
		System.out.printf("총점\t%d\t%d\t%d\n", 
							intKorTotal, intEngTotal, intMathTotal,intAllTotal );
		

	}
}