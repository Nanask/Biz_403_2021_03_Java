package com.callor.word.impl;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.Nanask.standard.InputService;
import com.Nanask.standard.MenuService;
import com.Nanask.standard.impl.InputServiceImplV1;
import com.callor.word.domain.WordVO;

/*
 * 점수처리
 * 단어를 맞추면  (+)
 * 단어를 틀리면 재도전 (-)
 * 힌트 요구 (-)
 * 건너뛰기 (-)
 * 
 */

public class WordServiceImplV2A extends WordServiceImplV1 {

//	protected InputService inService;
//	protected MenuService mService;
//	protected Scanner scan;
//	protected List<WordVO> wordList; // word 들의 List

	// wordList의 개수를 담을 변수
//	protected int nWordCount;
//	protected Random rnd;
//
//	protected final int 영어 = 0;
//	protected final int 한글 = 1;
//	
	protected WordVO gameWord;

	/*
	 * getSuffleWord() method를 호출하여 suffle된 영단어를 받고 반복하여
	 * 
	 * suffle된 영단어를 inputWord()에게 전달하여 게임을 진행한다.
	 */
	public void startGame() {
		// 게임용 단어 만들기
		int nWordIndex = rnd.nextInt(nWordCount);
		WordVO wordVO = wordList.get(nWordIndex);

		// getSuffleWord() 사용하지 않고 직접 suffleWord()를 호출하도록 변경
		String viewWord[] = this.suffleWord(wordVO.getEnglish());
		while (true) {
			String strInput = this.inputWord(viewWord);
			if(strInput.equals("QUIT")) {
				System.out.println("게임종료");
			}
		}

		// 점수계산
	}

	protected String inputWord(String[] viewWord) {
		// TODO Auto-generated method stub

		System.out.println("=".repeat(50));
		System.out.println("뤼팡의 영단어 게임 V2");
		System.out.println("-".repeat(50));
		System.out.println("다음 보여지는 단어를 바르게 배열하시오");
		System.out.println(Arrays.toString(viewWord));
		System.out.println("-".repeat(50));
		while (true) {
			

			System.out.println("1.다음게임(Skip)");
			System.out.println("2.힌트보기");
			System.out.println("QUIT : 게임중단");

			System.out.println("-".repeat(50));
			System.out.print(">> ");
			String strInput = scan.nextLine();

			if (strInput.equals("")) {
				System.out.println("단어나, 메뉴를 선택하세요");
				continue;
			}
			return strInput;
		}
		return null;
	}

	/*
	 * list에서 getter된 영단어VO를 전역변수(클래스영역에 멤버변수)로 선언하고 단어를 저장했다
	 * 
	 * 그랬더니 영단어VO는 다른 method에서도 참조하는 변수가 되고 method간에 서로 관심을 가져야 하는 사이가 되버린다. 이런 상황이
	 * 진행되면 영단어VO(게임단어)변수의 상태를 잘 관리해야 하는 문제가 발생한다.
	 * 
	 * getSuffleWord()를 사용하지 않고 list에서 영단어VO를 getter하고 직접 데이터를 관리하도록 만든다
	 */
//	protected String[] getSuffleWord() {
//
//		
//		String[] suffleEnglish= this.suffleWord(gameWord.getEnglish());
//		return suffleEnglish;
//	}

	/*
	 * suffle된 단어배열을 매개변수로 받고 게임을 진행하기
	 */

	private String[] suffleWord(String[] strEnglish) {

		String[] suffleEnglish = strEnglish.split("");

		int nCount = suffleEnglish.length;
		for (int i = 0; i < 1000; i++) {

			int index1 = rnd.nextInt(nCount);
			int index2 = rnd.nextInt(nCount);

			String temp = suffleEnglish[index1];
			suffleEnglish[index1] = suffleEnglish[index2];
			suffleEnglish[index2] = temp;

		}
		return suffleEnglish;

	}

}
