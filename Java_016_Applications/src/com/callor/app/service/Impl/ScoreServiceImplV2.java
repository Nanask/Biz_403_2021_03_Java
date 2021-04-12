package com.callor.app.service.Impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Nanask.standard.InputService;
import com.Nanask.standard.MenuService;
import com.Nanask.standard.impl.InputServiceImplV1;
import com.Nanask.standard.impl.MenuServiceImplV1;
import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV2 implements ScoreService {

	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	protected InputService is;
	protected Scanner scan;

	public ScoreServiceImplV2() {
		is = new InputServiceImplV1();
		scan = new Scanner(System.in);

	}

	@Override
	public void selectMenu() {

//		보통 멤버변수(클래스 영역에 선언된 변수들) 객체는 이 클래스의 생성자에서 만드는 것이 좋다.
//		하지만 객체를 생성할 때 전달해야 할 매개변수(파라메터)에 대해 수행해야할 연산코드가 있을 경우는
//		객체를 사용하기 전에 객체를 생성하는 코드를 작성하여도 된다.
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");

		menuService = new MenuServiceImplV1("빛고을 고교 성적처리", scoreMenu);

		while (true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				System.out.println("업무 종료");
				break;
			}
			if (menu == 1) {
				this.inputScore();
			} else if (menu == 2) {
				this.printScore();
			} else if (menu == 3) {
				this.saveScore();
			}
		}
	}

	@Override
	public void inputScore() {

		// 학번 입력, 이름입력, 과목별 성적입력
		// ScoreVO 객체에 담고, List에 추가
		// = ScoreVO 클래스를 사용하여 생성한 scoreVO 객체에 담고
		// = ScoreVO 에 담고

		String strNum = this.inputNum();
		if (strNum == null) {
			return;
		}
		String strName = this.inputName(strNum);
		if (strName == null) {
			return;
		}

		Integer intKor = is.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = is.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = is.inputValue("수학", 0, 100);
		if (intMath == null) {
			return;
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		scoreList.add(scoreVO);

	}

	private String inputNum() {

		Integer intNum = is.inputValue("학번", 1);

		if (intNum == null) {
			return null;
		}
		String strNum = String.format("2021%03d", intNum);
		return strNum;
	}

	private String inputName(String strNum) {

		while (true) {
			System.out.println(strNum + "학생의 이름을 입력하세요.(QUIT : 입력취소)");
			System.out.print(" >> ");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				break;
			} else if (strName.equals("")) {
				System.out.println("학생이름은 반드시 입력해야 합니다.");
				continue;
			}
			return strName;
		}
		return null;
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {

		while (true) {
			System.out.println("성적리스트 저장");
			System.out.println("저장할 파일이름을 입력하세요");
			System.out.print(" >> ");
			String strFileName = scan.nextLine();
			if (strFileName.equals("")) {
				System.out.println("파일이름을 입력해야 합니다");
				continue;
			}

			FileWriter fileWriter = null;
			PrintWriter out = null;

			strFileName = "src/com/callor/app" + strFileName + ".txt";

			try {
				fileWriter = new FileWriter(strFileName);
				out = new PrintWriter(fileWriter);

				int nSize = scoreList.size();
				for (int i = 0; i < nSize; i++) {
					ScoreVO VO = scoreList.get(i);
					out.print(VO.getNum() + ",");
					out.print(VO.getName() + ",");
					out.print(VO.getKor() + ",");
					out.print(VO.getEng() + ",");
					out.print(VO.getMath());
				}
				out.flush();
				out.close();
			} catch (IOException e) {
				System.out.println("파일을 생성할 수 없습니다.");
				System.out.println("파일 이름을 다시 입력해주세요");
				continue;
			}
			return;

		}
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}

