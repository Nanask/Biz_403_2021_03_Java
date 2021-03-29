package com.callor.apps;

//score

import com.callor.apps.Service.ScoreServiceV3;

public class App_03 {
	
	public static void main(String[] args) {
		
		ScoreServiceV3 ssV3 = new ScoreServiceV3(5);
		ssV3.makeScores();
	}

}
