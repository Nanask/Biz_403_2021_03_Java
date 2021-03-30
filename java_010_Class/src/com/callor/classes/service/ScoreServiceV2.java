package com.callor.classes.service;

//ScoreService

import java.util.ArrayList;


import com.callor.model.ScoreVO;



/*
 * ScoreServiceV1을 extends (상속,확장)
 * ScoreServiceV1에 있는 method를 그대로 이어받아서
 * ScoreServiceV1에 마치 복사 붙이기 한 것처럼 사용하겠다.
 * 
 * V1에서 작성된 inputScore()를 V2에서 새롭게 개선
 * 
 * 필요한 부분만 남기고 나머지는 모두 삭제
 * 
 * public : 모두에게 개방한다. 모두에게 공개한다
 * 		누구나 접근(읽기, 쓰기, 실행)을 하게 한다.
 *  	Class obj = new Class()
 * 		obj.method();
 * 		obj.변수 = 100;
 * 
 * private : 현재 파일에 있는 코드에서만 접근 가능
 * 		obj.변수 = 100; // 문법오류가 난다
 * 
 * protected : 객체를 통해서는 직접 접근금지
 * 		Class obj = new Class()
 * 		obj.method() 방식으로는 접근이 안된다.
 * 		클래스를 상속받게 하겠다 라는 전제하에 상속을 받은 클래스에서는 자유롭게 접근이 가능하다.
 * 
 * 		부모클래스와 상속받은 자식클래스 간의 공유가 목적
 */



public class ScoreServiceV2 extends ScoreServiceV1{
	
	/*
	 * V1에서 protected로 만든 변수는 V2에서 바로 사용가능
	 */
	
	public Integer inputScore(String strNum, String strSub) {
		int intScore = 0;
		while(true){
			System.out.println(strNum + " 번의" + strSub + "점수를 입력하세요(중단 : -1)");
			System.out.print(">> ");
			intScore = scan.nextInt();
			if(intScore == -1 ) {
			
				return null;
			}else if (intScore < 0 || intScore > 100) {
				System.out.println(strSub + "점수는 0 ~ 100까지!");
				continue;
			}
			
		break;	
		}
		return intScore;
	}
	
	public Integer inputScore() {
		
		String[] strSubject = {"국어","영어","수학"};
		Integer[] intScores = new Integer[strSubject.length];

		
		int nSize = scoreList.size();
		String strNum = String.format("%03d", nSize + 1);
		
		for(int i = 0 ; i <strSubject.length ; i++) {
			intScores[i] = this.inputScore(strNum, strSubject[i]);
			if(intScores[i] == null) {
				return null;
			}
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.num = strNum;
		scoreVO.kor = intScores[0];
		scoreVO.eng = intScores[1];
		scoreVO.math = intScores[2];
		scoreList.add(scoreVO);
		
		return 0;
	} // inputScore()


}
