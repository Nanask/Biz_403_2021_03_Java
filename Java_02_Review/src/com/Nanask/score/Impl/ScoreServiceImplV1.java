package com.Nanask.score.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Nanask.score.model.ScoreVO;
import com.Nanask.score.service.ScoreServiceV1;
import com.Nanask.standard.InputService;
import com.Nanask.standard.MenuService;
import com.Nanask.standard.impl.InputServiceImplV1;
import com.Nanask.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1 implements ScoreServiceV1 {
	//protected를 사용하는 이유는 상속받았을때도 사용할 수 있게 하기 위함
	protected MenuService ms; 
	protected InputService is;
	protected String[] subject;
	protected Integer[] subScoreList;
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	
	public ScoreServiceImplV1() {
		// TODO 객체 초기화
		is = new InputServiceImplV1();
		subject = new String[] {"국어","영어","수학"};
		subScoreList = new Integer[subject.length];  
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		
	}

	@Override
	public void slectMenu() {
		//TODO 메뉴만들기 , Menu jar파일을 사용하여 메뉴를 만들었음
		
		List<String>menuList = new ArrayList<String>(); // 메뉴의 항목을 적기 위함
		
		menuList.add("학생정보 등록");
		menuList.add("성적등록"); // inputScore
		menuList.add("성적정보 열기"); //readScore
		menuList.add("성적정보 저장"); //saveScore
		menuList.add("성적정보 출력"); //printScore
		
		ms = new MenuServiceImplV1("빛누리 고등학교 성적 2021", menuList);
		
		Integer intMenu = null;
		while(true) {
			if(intMenu == null) {
				break;
			} else if(intMenu == 1) {
				
			} else if(intMenu == 2) {
				this.InputScore();
			} else if(intMenu == 3) {
				this.readScore();
			} else if(intMenu == 4) {
				this.saveScore();
			} else if(intMenu == 5) {
				this.printScore();
			}
		}
		
	}

	@Override
	public void InputScore() {
		//TODO 학생 성적배열, 성적배열을 담는 배열, 학번, 이름, 스캐너
		
		String strNum = null;
		String strName = null;
		
		while(true) {
			Integer intNum = is.inputValue("학번", 1);
			if(intNum == null) {
				return;
			}
			strNum = String.format("2021%03d", intNum);
			
			System.out.println(intNum + "학생의 이름을 입력하세요(QUIT : 입력중단)");
			System.out.print(">> ");
			strName = scan.nextLine();
			if(strName.equals("QUIT")) {
				return;
			}else if(strName.equals("")) {
				System.out.println("이름은 반드시 입력해야 합니다.");
				continue;
			}
			break;
			
		}//while end
		
		for(int i = 0 ; i < subject.length ; i++) {
			String sub = subject[i] + "점수"; // subject[i]는 과목이 과목수만큼 반복
			Integer intSub = is.inputValue(sub, 0, 100);
			if(intSub == null) {
				return;
			}
			subScoreList[i] = intSub; //과목의 배열을 담는 배열
					
		}
		ScoreVO vo = new ScoreVO();
		vo.setNum(strNum);
		vo.setName(strName);
		vo.setKor(subScoreList[국어]);
		vo.setEng(subScoreList[영어]);
		vo.setMath(subScoreList[수학]);
		
		scoreList.add(vo);
		
	}

	@Override
	public void printScore() {
		// TODO get을 이용하여 가져오기
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=".repeat(80));
		
		int nSize = scoreList.size();
		for(int i = 0 ; i < nSize ; i++) {
			
			ScoreVO vo = new ScoreVO();
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f" , vo.getAvg() + "\n");
			
		}
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

}
