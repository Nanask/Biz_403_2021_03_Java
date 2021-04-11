package com.callor.App.service;

import com.callor.App.model.ScoreVO;
import com.callor.App.service.Impl.ScoreServiceImplV1;

public class ScoreServiceV3a extends ScoreServiceImplV1 {

	public String inputNum() {

		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			
			if (intNum == null) {
				return null;
			}
			int num1 = 0;
			for (int i = 0; i < scoreList.size(); i++) {
				String strNum1 = String.format("2021%03d", intNum);
				if (strNum1.equals(scoreList.get(i).getNum())) {
					num1 = 1;
				} 
			}
			if (num1 == 1) {
				System.out.println("중복된 학번입니다.");
				continue;
			}

			String strNum = String.format("2021%03d", intNum); // 2021001
			return strNum;

		} // while end;

	}

//	private String inputNum() {
//
//		while(true) {
//			Integer intNum = inService.inputValue("학번", 1);
//			int num = 0;
//			if (intNum == null) {
//				return null;
//			}
//			String strNum = String.format("2021%03d", intNum);
//			for (int i = 0; i < scoreList.size(); i++) {
//				if (strNum.equals(scoreList.get(i).getNum())) {
//					num++;
//				}
//			}
//			if(num > 0) {
//				System.out.println("이미 입력된 학번입니다. 다시 입력해주세요.");
//				continue;
//			}
//			return strNum;
//		}
//
//	}

	@Override
	public void inputScore() {

		String strNum = this.inputNum();
		if (strNum == null) {
			return;
		}

		// 학생의 이름입력
		String strName = this.inputName(strNum);
		if (strName == null) {
			return;
		}

		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
			return;
		}

		if (intKor == null || intEng == null || intMath == null) {
			return;
		}

		// 입력을 모두 마쳤으면 VO에 담기
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);

		// vo에 담간 데이터를 List 저장소에 추가
		scoreList.add(scoreVO);
	}

	private String inputName(String strNum) {
		// TODO 학번으로 보여주고 이름을 입력받는 method

		while (true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT:입력취소)");
			System.out.print(">> ");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				// return null;
				break;
			} else if (strName.equals("")) { // 입력 없이 Enter만
				System.out.println("학생이름은 반드시 입력해야 합니다");
				continue;
			}
			return strName;
		} // end while
		return null;
	}

}
