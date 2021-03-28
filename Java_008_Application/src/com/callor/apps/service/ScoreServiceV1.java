package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	Scanner scan;
	
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intTotal;
	float[] floatAvg;
	int num ; //학번
	
	public ScoreServiceV1() {
		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];
		
	}
	public void makeMembers() {

		int length = 30;
		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i < intKor.length ; i++) {
			num = i + 1;
			System.out.println(LinesService.dLines(length));
			System.out.printf("%d번의 국어,영어,수학 점수를 기재하세요\n" , num);
			System.out.print("국어점수: ");
			intKor[i] = scan.nextInt();
			System.out.print("영어점수: ");
			intEng[i] = scan.nextInt();
			System.out.print("수학점수: ");
			intMath[i] = scan.nextInt();
		}
		scan.close();
	}
	public void makeTotal() {
		//Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i < intKor.length ; i++) {
			num = i + 1;
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float)intTotal[i] / 3;
			System.out.printf("%d번의 성적 합계를 계산합니다", num);
			System.out.println(intTotal[i]);
			System.out.printf("%d번의 성적 평균을 계산합니다", num);
			System.out.printf("%3.2f\n",floatAvg[i]);
			
		}
	}
	
	public void printScore() {
		for(int i = 0 ; i < intKor.length ; i++) {
		
		}
	}
	

}
