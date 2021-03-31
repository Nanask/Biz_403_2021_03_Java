package com.callor.classes.service;

//ScoreService

//Score
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.callor.model.ScoreVO;


/*
 * 접근제한자(참조제한자)
 * public, private, protected
 * 
 * class, method, 맴버 변수를 선언할 때 사용하는 Keyword(명령어)
 * 접근제한자는 사용하지 않아도 문법적인 오류가 발생하지 않는다
 * 
 * 객체이론에 "정보은닉(감춘다, 제한적으로 접근하게 한다, 데이터를 보호한다)"
 * 
 */


public class ScoreServiceV1 {
	
	/*
	 * 맴버변수를 protected로 선언을 해 두면 현재 클래스(V1)를 상속받은 자식 클래스에서
	 * 변수가 선언된 것처럼 동작할 수 있다.
	 * 
	 * 상속을 허락하고 맴버변수를 공유하고자 할때는 protected를 추가한다.
	 */
	
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	
	public ScoreServiceV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}
	public Integer inputScore() {
		
		// System.out.println("학번을 001 형식으로 입력하세요");
		// System.out.print(">> ");
		// String strNum = scan.next();
		
		/*
		 * scoreList의 데이터 개수를 계산하여 입력할 학번을 자동으로 생성하기
		 */
		int nSize = scoreList.size();
		String strNum = String.format("%03d", nSize + 1);
		//문자의 자리 정렬 
		int intKor = 0;
		while(true){
			System.out.println(strNum + " 번의 국어점수를 입력하세요(중단 : -1)");
			System.out.print(">> ");
			intKor = scan.nextInt();
			if(intKor == -1 ) {
			
				return -1 ;
			}else if (intKor < 0 || intKor > 100) {
				System.out.println("국어점수는 0 ~ 100까지!");
				continue;
			}
			
			
		}
		
		System.out.println(strNum + " 번의 영어점수를 입력하세요");
		System.out.print(">> ");
		int intEng = scan.nextInt();
		
		System.out.println(strNum + " 번의 수학점수를 입력하세요");
		System.out.print(">> ");
		int intMath = scan.nextInt();
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.num = strNum;
		scoreVO.kor = intKor;
		scoreVO.eng = intEng;
		scoreVO.math = intMath;
		scoreList.add(scoreVO);
		
		return 0;
	} 
	
	public void printScore() {
		
		this.printHeader();
		
		for(int i = 0 ; i < scoreList.size() ; i++) {
			
			//scoreList의 i번째 저장된 값을 읽어서 ScoreVO형 sVO 객체에 담기
			ScoreVO sVO = scoreList.get(i);
			
			System.out.print(sVO.num + "\t");
			System.out.print(sVO.kor + "\t");
			System.out.print(sVO.eng + "\t");
			System.out.print(sVO.math + "\n");
			
		}
	} //printScore()
	
	private void printHeader() {
		System.out.println("* 빛나라 고교 성적처리 V1");
		System.out.println(Lines.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println(Lines.sLine(50));
		
		
	}

}
