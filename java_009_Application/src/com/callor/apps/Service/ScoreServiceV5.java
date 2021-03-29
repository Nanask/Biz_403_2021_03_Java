package com.callor.apps.Service;

import java.util.Scanner;

public class ScoreServiceV5 {
	
	
	String[] subject;
	
	/*
	 * 3과목의 점수를 저장할 배열을 10개 만들었다고 가정하자.
	 * 
	 * 8번 요소의 배열에 각각 점수를 저장
	 * intKor[8] = 90
	 * intEng[8] = 70;
	 * intMath[8] = 66;
	 */
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	Scanner scan;
	public ScoreServiceV5(int members) {
		scan = new Scanner(System.in);
		subject = new String[] {"국어","영어","수학"};
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}
	/*
	 * 현재는 학생 수 만큼 모든 과목의 점수 입력을 끝내야만 다른 업무로 진행이 된다.
	 * 몇명의 학생, 일부과목 점수만 입력을 마치고 잠시 업무를 멈추고 싶을때 현재 코드는 불가능하다
	 * => 일부만 입력하고 업무를 중단하는 기능을 추가하자
	 */
	public void makeScores() {
		
		//과목의 개수만큼 점수를 담을 임시 배열 선언
		Integer[] scores = new Integer[subject.length];
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%d 번의 학생의 성적입력\n", i+1);
			
			//subject의 배열만큼 과목을 반복문을 돌린다.
			for(int j = 0 ; j < subject.length ; j++) {
				scores[j] = this.inputScore(subject[j]);
				
				/*
				 * 입력업무중 -1을 입력했을 때 입력업무를 중단하고 main()으로 되돌아가고 싶다
				 * 이때 break를 사용하면 for() 겹쳐있기 때문에 원하는대로 코드가 작동되지 않는다.
				 * 이럴경우 return type이 void이지만 return명령을 실행하여 method코드
				 */
				if(scores[j] == - 1) {
					return;
				}
			}
			
			intKor[i] = scores[0];
			intEng[i] = scores[1];
			intMath[i] = scores[2];
		}
		
	}
	private Integer inputScore(String sub) {
		
		Integer score = 0;
		
		while(true) {
			System.out.println(sub + "점수를 입력하세요(QUIT : -1");
			System.out.print(" >> ");
			score = scan.nextInt();
			//점수입력을 하는 중에 -1을 입력하면 입력중단하라
			if(score == -1) {
				return -1;
			}else if(score < 0 || score > 100) {
				System.out.println(sub + "점수는 0 ~ 100까지 ");
				// continue;
				
				// continue 명령을 사용하는 대신
				// else를 사용하여 코드를 작성
				} else {
					break;	
				}
			}
			return score ;
		//Unreachable code 필요없다는 코드, while문으로 break를 생성하지 않아 무한 반복되기 때문에 사용할 일이 없다고 표시된 것
		//return 하고자 하는 것으로 0에서 수정을 해야한다.
	}
	
	/*
	 * 프로젝트를 만들고 컴파일을 수행하고 실행을 했을때 우리가 선언한 클래스는 코드만 존재하는 상태가 된다
	 * 이 클래스를 객체로 선언하고, 생성한 후에 여러가지 method를 호출하여 업무를 수행할 수 있다.
	 * 
	 * method나 변수에 static을 부착하면 사용하지 않아도 method코드나, 변수가 메모리에 상주하게 된다.
	 * 
	 * 편리한 대신 메모리를 많이 차지하기 때문에 꼭 필요한 순간에만 사용하자
	 */
	
	public static String dLine() {
		
		return "===============================================";
	}
	

}
