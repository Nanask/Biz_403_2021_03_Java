package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.Impl.ScoreServiceImplV1A;

public class ScoreEx_01A {
	
	public static void main(String[] args) {
		
		ScoreService ss = new ScoreServiceImplV1A();
		
		ss.insertScore();
		
	}
	
	

}
