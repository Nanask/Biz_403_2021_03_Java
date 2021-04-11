package com.callor.App.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Nanask.standard.InputService;
import com.Nanask.standard.impl.InputServiceImplV1;
import com.callor.App.model.ScoreVO;
import com.callor.App.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected InputService inService;
	protected String[] subject;
	protected String strName;
	protected String num;

	public ScoreServiceImplV1() {
		// TODO 변수 초기화
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();
		subject = new String[] { "국어", "영어", "수학" };
		strName = null;
		num = null;

	}

	@Override
	public void selecMenu() {
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
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strNenu);
			} catch (NumberFormatException e) {
				System.out.println("1번 또는 2번 또는 QUIT만 입력하세요");
			}
			if (intMenu == 1) {
				this.inputScore();
			} else if (intMenu == 2) {
				this.printScore();
			}
		}
	}

	@Override
	public String inputName() {
		// TODO 학생 이름 입력창

		System.out.println("=".repeat(50));
		System.out.println("이름을 입력하세요(종료하려면 QUIT)");
		System.out.print("이름 : ");
		String strName = scan.nextLine();
		if (strName.equals("QUIT")) {
			return null;
		}
		return strName;
	}

	public String inputNum() {
		System.out.println("=".repeat(50));
		System.out.println("학번을 입력하세요(종료하려면 QUIT)");
		System.out.print("학번 : ");
		String num = scan.nextLine();
		Integer intNum = null;
		try {
			intNum = Integer.valueOf(num);
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요");
		}
		System.out.println("-".repeat(50));
		if (num.equals("QUIT")) {
			return null;
		}
		return num;

	}

	@Override
	public void inputScore() {
		// TODO 학생성적구하기
		strName = this.inputName();
		num = this.inputNum();
		Integer[] scores = new Integer[subject.length];

		for (int i = 0; i < subject.length; i++) {
			scores[i] = inService.inputValue(subject[i], 0, 100);

		}
		ScoreVO VO = new ScoreVO();
		VO.setKor(scores[0]); // 국어
		VO.setEng(scores[1]); // 영어
		VO.setMath(scores[2]); // 수학
		VO.setNum(num);
		VO.setName(strName);
		scoreList.add(VO);
	}

	@Override
	public void printScore() {
		// TODO 성적리스트
		int nSize = scoreList.size();

		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=".repeat(50));
		for (int i = 0; i < nSize; i++) {
			ScoreVO VO = scoreList.get(i);
			System.out.print(VO.getNum() + "\t");
			System.out.print(VO.getName() + "\t");
			System.out.print(VO.getKor() + "\t");
			System.out.print(VO.getEng() + "\t");
			System.out.print(VO.getMath() + "\t");
			System.out.print(VO.getTotal() + "\t");
			System.out.print(VO.getAvg() + "\n");
		}
	}
}
