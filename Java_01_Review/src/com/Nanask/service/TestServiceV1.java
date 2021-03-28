package com.Nanask.service;

import java.util.Scanner;
//5명의 학생의 국어,수학,영어 점수를 컴퓨터를 통해 입력
//받고 총점, 평균을 구하라

public class TestServiceV1 {

	Scanner Scan;

	int[] intKor;
	int[] intEng;
	int[] intMath;
	int members;
	int[] intTotal;
	float[] floatAvg;

		public TestServiceV1() {

		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		}
		public void makeNumbers() {
			Scanner scan = new Scanner(System.in);
			
			
			for (int i = 0; i < intKor.length; i++) {
				members = i + 1;
				System.out.printf("%d번 학생의 국어,영어,수학 점수를 입력하세요\n", members);
				System.out.println("국어 점수 : ");
				intKor[i] = scan.nextInt();
				System.out.println("영어 점수 : ");
				intEng[i] = scan.nextInt();
				System.out.println("수학 점수 : ");
				intMath[i] = scan.nextInt();
			}
			scan.close();
		}

	public void makeTotal() {

		for (int i = 0; i < intKor.length; i++) {
			members = i + 1;
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float) intTotal[i] / 3;

			System.out.printf("%d번의 성적 합계를 계산합니다\n", members);
			System.out.println(intTotal[i]);
			System.out.printf("%3.2f\n번의 성적 평균을 계산합니다", members);
			System.out.printf("%3.2f\n", floatAvg[i]);
		}
	}

	public void ckeckScore() {
		
		System.out.println("==========================================");
		System.out.println("고등학교 성적");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==========================================");

		for (int i = 0; i < intKor.length; i++) {

			System.out.printf("%3d\t", members);

			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);

			System.out.printf("%5d\t", intTotal[i]);
			System.out.printf("%3.2f\n", floatAvg[i]);
		}

	}
}
