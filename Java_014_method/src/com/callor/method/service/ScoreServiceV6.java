package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

/*
 * 데이터를 입력(키보드, Random, 파일, 인터넷)
 * 		데이터를 VO에 담고
 * 입력된 데이터를 List에 추가
 * 			연산을 수행
 * 다시 List 저장
 * 데이터를 읽어서
 * 		List에 저장해
 * 출력
 */

public class ScoreServiceV6 {
	
	// final 키워드를 부착한 변수 = 상수
	// 상수 = 한번 저장된 값을 변경할 수 없는 특별한 변수
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	protected String[] subject;
	ScoreVO VO;
	InputServiceV2 isV2;
	List<ScoreVO> scoreList;

	public ScoreServiceV6() {

		subject = new String[] { "국어", "영어", "수학" };
		VO = new ScoreVO();
		isV2 = new InputServiceV2();
		scoreList = new ArrayList<ScoreVO>();

	}

	public void inputScore() {
		int[] scores = new int[subject.length];

		for (int sb = 0; sb < subject.length; sb++) {
			scores[sb] = isV2.inputValue(subject[sb], 0, 100);

		ScoreVO VO = new ScoreVO();
		VO.setKor(scores[0]);
		VO.setEng(scores[1]);
		VO.setMath(scores[2]);
		scoreList.add(VO);

		}
	}
	public void inputScore2() {
		
		for(int i = 0 ; i < 5 ; i++) {
			
			Integer kor = isV2.inputValue("국어", 0, 100);
			if(kor == null) {
				return;
			}
			Integer eng = isV2.inputValue("영어", 0, 100);
			if(eng == null) {
				return;
			}
			Integer math = isV2.inputValue("수학", 0, 100);
			if(math == null) {
				return;
			}
			ScoreVO VO = new ScoreVO();
			VO.setKor(kor);
			VO.setEng(eng);
			VO.setMath(math);
			scoreList.add(VO);
		} // for end
		
		

	}

	public void printScore() {

		System.out.println();
	}

	
}
