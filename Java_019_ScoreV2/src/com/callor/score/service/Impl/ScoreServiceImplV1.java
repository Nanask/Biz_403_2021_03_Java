package com.callor.score.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Nanask.standard.InputService;
import com.Nanask.standard.impl.InputServiceImplV1;
import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {
	protected InputService is;
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected String[] sub;
	protected Integer[] subList;

	public ScoreServiceImplV1() {
		is = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		sub = new String[] {"국어","영어","수학"};
		subList = new Integer[sub.length];

	}

	@Override
	public void insertScore() {

		while(true) {
			Integer intNum = is.inputValue("학번", 1);
			String strNum = String.format("05%d", intNum);
			if (intNum == null)
				return;
			
			for(int i = 0 ; i < sub.length ; i++) {
				
				subList[i]  = is.inputValue(sub[i], 0, 100);
				if(subList == null) break;
			}
			ScoreVO vo = new ScoreVO();
			
			vo.setNum(strNum);
			vo.setKor(subList[0]);
			vo.setEng(subList[1]);
			vo.setMath(subList[2]);
			
			scoreList.add(vo);
		}
		

	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

}
