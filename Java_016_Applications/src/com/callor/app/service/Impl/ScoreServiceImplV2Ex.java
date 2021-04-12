package com.callor.app.service.Impl;

import com.Nanask.standard.InputService;
import com.callor.app.model.ScoreVO;

/*
 * selectMenu는 그대로 활용
 * inputScore()만 다시 작성
 */

public class ScoreServiceImplV2Ex extends ScoreServiceImplV2 {

	protected String[] subjectList;
	protected Integer[] subScoreList;
	
	//과목명, 과목점수가 담긴 배열에 대한 위치를 숫자로 사용하지 않고 명명된 이름으로 사용하기 위하여
	//배열에 index값을 상수로 선언해 둔다.
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	public ScoreServiceImplV2Ex() {
		subjectList = new String[] { "국어", "영어", "수학" };
		subScoreList = new Integer[subjectList.length];
	}

	@Override
	public void inputScore() {
		String strName = null;
		String strNum = null;
		while (true) {
			Integer intNum = is.inputValue("학번", 1);
			
			if (intNum == null) {
				return;
			}
			strNum = String.format("2021%03d", intNum);

			System.out.println(strNum + "학생의 이름 입력(QUIT : 입력중단)");
			System.out.print("이름 >> ");
			strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return;
			} else if (strName.equals("")) {
				System.out.println("학생이름은 반드시 입력하세요");
				continue;
			}
			break;
		}

//		각과목의 점수를 별도로 입력받아 변수에 저장하기를 하려고 하니 귀찮아서 창조적 게으름을 피움

//		입력받을 과목명을 배열변수로 선언하고 
		String[] subject = { "국어", "영어", "수학" };
//		subject 배열을 멤버역역으로 이동 subjectList
		Integer[] intScore = new Integer[subjectList.length];

		for (int i = 0; i < subjectList.length; i++) {
			intScore[i] = is.inputValue(subjectList[i], 0, 100);
			if (intScore[i] == null) {
				return;
			}
		}
		ScoreVO VO = new ScoreVO();
		VO.setNum(strNum);
		VO.setName(strName);
		VO.setKor(subScoreList[국어]);
		VO.setEng(subScoreList[영어]);
		VO.setMath(subScoreList[수학]);
		
		
		
		System.out.println("=".repeat(50));
		System.out.println(VO.toString());
		System.out.println("=".repeat(50));
		scoreList.add(VO);
		
	}

	@Override
	public void printScore() {
		
		System.out.println("빛나라 고교 성적리스트 2021");
		System.out.println("=".repeat(80));
		for(int index = 0 ; index < subjectList.length ; index++) {
			System.out.print(subjectList[index] + "\t");
		}
		
		System.out.println();
		System.out.println("-".repeat(80));
		
		/*
		 * 파일에 저장할 때 각 데이터를 컴마(,)로 구분하여 입력하고 파일 이름을 *.csv로 저장하면
		 * excel에서 파일을 읽을 수 있다.
		 * 
		 * csv : comma -separated-variables
		 * 컴마로 값을 구분한 파일
		 */
		
		int nSize = scoreList.size();
		for(int i = 0 ; i < nSize ; i++) {
			ScoreVO VO = scoreList.get(i);
			System.out.print(VO.getNum() + "\t");
			System.out.print(VO.getName() + "\t");
			System.out.print(VO.getKor() + "\t");
			System.out.print(VO.getEng() + "\t");
			System.out.print(VO.getMath() + "\t");
			System.out.print(VO.getTotal() + "\t");
			System.out.print(VO.getAvg() + "\t");
		}
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		super.saveScore();
	}
	

	
	
	
}
