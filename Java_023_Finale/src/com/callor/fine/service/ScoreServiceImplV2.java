package com.callor.fine.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {
//	List<ScoreVO> scoreList;

	public ScoreServiceImplV2() {
		
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

}
