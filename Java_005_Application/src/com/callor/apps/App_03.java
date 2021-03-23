package com.callor.apps;

import java.util.Random;

/*
 * 정수형 배열 intScores를 10개 선언(생성)
 * Random 클래스를 사용하여 50~100까지 정수를 만들어 IntScores 각 배열에 저장
 * intScores 배열에 저장된 점수를 이용하여 전체총점, 평균을 계산한 후 출력
 */

public class App_03 {
	
	public static void main(String[] args) {
		
		int[] intScores = new int[10];
		Random rnd = new Random();
		
		int Sum = 0;
		float floatAvg = 0;
		
		for(int i = 0 ; i < 10 ; i++ ) {
			intScores[i] = rnd.nextInt(51) + 50;
			Sum += intScores[i];
		}
		floatAvg =(float) Sum/10 ; 
		// 평균은 전체총점을 계산 한 후 한번만 계산하면 된다.
		// 평균을 총점과 같이 for() 반복문에서 계산할 필요는 없다.
		System.out.println("====================================");
		System.out.printf("총점 : %d\t  평균 : %3.2f\n" , Sum , floatAvg);
		System.out.println("====================================");
		
	}

}
