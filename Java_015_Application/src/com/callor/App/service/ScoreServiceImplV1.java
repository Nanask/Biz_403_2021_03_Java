package com.callor.App.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.App.model.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService {

	List<ScoreVO> scoreList;
	Scanner scan;
	InqutServiceV2 inService;
	String[] subject;
	String strName;

	public ScoreServiceImplV1() {
		// TODO 변수 초기화
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		inService = new InqutServiceV2();
		subject = new String[] {"국어","영어","수학"};
		strName = null;

	}

	@Override
	public void selecNenu() {
		// TODO 메뉴
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("고등학교 성적");
			System.out.println("=".repeat(50));
			System.out.println("1.학생 성적 입력");
			System.out.println("2.학생 성적 리스트 출력");
			System.out.println("QUIT 업무종료");
			System.out.print("업무선택 >> ");
			String strNenu = scan.nextLine();
			if (strNenu.equals("QUIT")) {
				System.out.println("업무종료");
				break;
			}
			Integer intNenu = Integer.valueOf(strNenu);
			if (intNenu == 1) {
//				this.inputName();
				this.inputName();
			} else if (intNenu == 2) {
				this.printScore();

			}

		}
		System.out.println("업무종료");

	}

	@Override
	public String inputName() {
		// TODO 학생 이름 입력창
		
		while (true) {
			strName = null;
			System.out.printf("학번과 학생이름을 입력하세요(종료하려면 QUIT)\n");
			System.out.print("학번 : ");
			String num = scan.nextLine();
			System.out.print("이름 : ");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return null;
			}
			this.inputScore();
			return null;
		}
		
	}

	@Override
	public void inputScore() {
		// TODO 학생성적구하기
		Integer[] scores = new Integer[subject.length];
				
		

		for (int i = 0; i < 5; i++) {
			scores[i] = inService.inputValue(subject[i], 0, 100);
			System.out.printf("%d 학생의 성적을 입력하세요(종료하려면 QUIT)", strName);
			ScoreVO VO = new ScoreVO();
			VO.setKor(scores[0]); //국어
			VO.setEng(scores[1]); //영어
			VO.setMath(scores[2]); //수학
		}
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

}
