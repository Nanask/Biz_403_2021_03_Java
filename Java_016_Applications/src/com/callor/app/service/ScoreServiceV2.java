package com.callor.app.service;

import java.util.Scanner;

public class ScoreServiceV2 implements ScoreService {
	protected Scanner scan;
	
	public ScoreServiceV2() {
		scan = new Scanner(System.in);
	}
	

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(50));
		System.out.println("빛고을 고교 성적처리 2021");
		System.out.println("=".repeat(50));
		System.out.println("1.성적입력");
		System.out.println("2.성적리스트 출력");
		System.out.println("3.성적저장");
		System.out.println("QUIT.종료");
		System.out.print("업무선택 >> ");
		String strMenu = null;
		if(strMenu.equals("QUIT")) {
			System.out.println("업무종료");
			return;
		}
		Integer intMenu = Integer.valueOf(strMenu);
		if(intMenu == 1) {
			this.inputScore();
		}
		if(intMenu == 2) {
			this.printScore();
		}
		if(intMenu == 3) {
			this.saveScore();
		}
		
		
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
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
