package com.callor.apps;

import com.callor.apps.Service.ScoreServiceV1;
import com.callor.apps.Service.ScoreServiceV2;

public class App_02 {
	
	public static void main(String[] args) {
		
		ScoreServiceV2 ssV2 = new ScoreServiceV1();
		ssV2.makeScores();
	}

}
