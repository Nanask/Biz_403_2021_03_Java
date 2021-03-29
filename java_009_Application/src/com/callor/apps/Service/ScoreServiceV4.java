package com.callor.apps.Service;

import java.util.Scanner;

public class ScoreServiceV4 {
	
	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	Scanner scan;
	public ScoreServiceV4(int members) {
		scan = new Scanner(System.in);
		for(int i = 0 ; i < intKor.length ; i++) {
		//선언하는곳과 생성자가 분리되어 있다면 new String[]으로 표기해야 한다.
		System.out.printf("%d번 학생의 성적입력\n", i+1);
		intKor[i] = this.inputScore(subject[0]);
		intEng[i] = this.inputScore(subject[0]);
		intMath[i] = this.inputScore(subject[0]);
	}
	}
	public void makeScores() {
		
		for(int i = 0 ; i < intKor.length ; i++) {
			//subject의 배열만큼 과목을 반복문을 돌린다.
			
			Integer intKor = this.inputScore(subject[i]) ;
		}
		
	}
	private Integer inputScore(String sub) {
		
		Integer score = 0;
		
		while(true) {
			System.out.println(sub + "점수를 입력하세요");
			System.out.print(" >> ");
			score = scan.nextInt();
			if(score < 0 || score > 100) {
				System.out.println(sub + "점수는 0 ~ 100까지 ");
				continue;
				//continue 대신 else { break; 로 표기해도 상관없다.
			}
			break;
			
		}
		
		return score;
		//Unreachable code 필요없다는 코드, while문으로 break를 생성하지 않아 무한 반복되기 때문에 사용할 일이 없다고 표시된 것
		//return 하고자 하는 것으로 0에서 수정을 해야한다.
	}
	

}
