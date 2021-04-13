package com.callor.score.service.Impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{
	protected String[] subjectList;
	protected Integer[] subScoreList;
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	

	public ScoreServiceImplV2() {
		subjectList = new String[] {"국어","영어","수학"};
		subScoreList = new Integer[subjectList.length];
		
	}

	@Override
	public void inputScore() {
		String strNum = null;
		String strName = null;
		
		while(true) {
			Integer intNum = inputService.inputValue("학번", 1);
			if(intNum == null) {
				return;
			}
			strNum = String.format("2021%03d", intNum);
			
			System.out.println(strNum + "학생의 이름을 입력하세요(QUIT : 입력중단)");
			System.out.print("이름 >> ");
			strName = scan.nextLine();
			if(strName.equals("QUIT")) {
				return;
			}else if (strName.equals("")) {
				System.out.println("학생이름을 반드시 입력해주세요");
				continue;
			}
			break;
		}
		for(int i = 0 ; i < subjectList.length ; i++) {
			String subject = subjectList[i] + "점수" ;
			Integer intScore = inputService.inputValue(subject, 0, 100);
			if(intScore == null) {
				return;
			}
			subScoreList[i] = intScore;
			
			
		}
		ScoreVO VO = new ScoreVO();
		VO.setNum(strNum);
		VO.setName(strName);
		VO.setKor(subScoreList[국어]);
		VO.setEng(subScoreList[영어]);
		VO.setMath(subScoreList[수학]);
		
		ScoreList.add(VO);
		
	}

	@Override
	public void printScore() {
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=".repeat(80));
		
		int nSize = ScoreList.size();
		for(int i = 0 ; i < nSize ; i++) {
			ScoreVO vo = ScoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
			
		}
		System.out.println("=".repeat(80));
	}//end printScore

	@Override
	public void saveScore() {
		
		String fileName = null;
		while(true) {
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.print(">> ");
			fileName = scan.nextLine();
			if(fileName.equals("")) {
				System.out.println("파일이름은 반드시 입력하여야 한다.");
				continue;
			}
			break;
		}
		
		String strFileName ="src/com/callor/score/" + fileName;
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);
			
			int nSize = ScoreList.size();
			
			for(int i = 0 ; i < nSize ; i++) {
				ScoreVO vo = ScoreList.get(i);
				
				out.print(vo.getNum() + "\t");
				out.print(vo.getName() + "\t");
				out.print(vo.getKor() + "\t");
				out.print(vo.getEng() + "\t");
				out.print(vo.getMath() + "\t");
				out.print(vo.getTotal() + "\t");
				out.printf("%3.2f\n",vo.getAvg() );
			}
			out.flush();
			out.close();
			
		} catch (IOException e) {
			
		}
				
		
	}
	
	
	
	

}
