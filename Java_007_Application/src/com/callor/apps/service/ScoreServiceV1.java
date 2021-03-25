package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1 {

	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intTotal;
	float[] floatAvg;

	public ScoreServiceV1() {
		intKor = new int[10];
		intKor = new int[intKor.length];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];

	}

	public void makeMembers() {

		Random rnd = new Random();

		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;
		}
	}

	public void makeTotal() {
		for (int i = 0; i < intKor.length; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intKor[i];
			intTotal[i] += intKor[i];
			floatAvg[i] = (float) intTotal[i] / 3;

		}
	}

	public void printScore() {
		System.out.println("============================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("3%d\t", intKor[i]);
			System.out.printf("3%d\t", intEng[i]);
			System.out.printf("3%d\t", intMath[i]);
			System.out.printf("%3d\t", intTotal[i]);
			System.out.printf("%3.2f\n", floatAvg[i]);
		}
		System.out.println("============================================");

	}

}
