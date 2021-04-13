package com.callor.score.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Nanask.standard.InputService;
import com.Nanask.standard.MenuService;
import com.Nanask.standard.impl.InputServiceImplV1;
import com.Nanask.standard.impl.MenuServiceImplV1;
import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {
	protected MenuService menuService; // jar파일 가져오기
	protected List<ScoreVO> ScoreList; // scoreVO의 GET,SET 사용하기 위함
	protected InputService inputService; // InputValue를 사용하기 위함
	protected Scanner scan;

	public ScoreServiceImplV1() {
		inputService = new InputServiceImplV1();
		scan = new Scanner(System.in);
		ScoreList = new ArrayList<ScoreVO>();
				

	}

	@Override
	public void selectMenu() {

		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("학생정보 등록");
		scoreMenu.add("성적등록"); // inputScore
		scoreMenu.add("성적정보 열기"); //readScore
		scoreMenu.add("성적정보 저장"); //saveScore
		scoreMenu.add("성적정보 출력"); //printScore

		menuService = new MenuServiceImplV1("대한 고등학교 성적처리 시스템 2021", scoreMenu);
		Integer menu = null;
		while (true) {

			menu = menuService.selectMenu();
			if (menu == null) {
				System.out.println("업무 종료");
				break;
			}
			if (menu == 1) {
				
			} else if (menu == 2) {
				this.inputScore();
			} else if (menu == 3) {
				this.readScore();
			} else if (menu == 4) {
				this.saveScore();
			} else if (menu == 5) {
				this.printScore();

			}
			
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
