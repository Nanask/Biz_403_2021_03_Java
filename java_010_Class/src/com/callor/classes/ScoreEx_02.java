package com.callor.classes;

import com.callor.classes.service.ScoreServiceV2;

public class ScoreEx_02 {

	public static void main(String[] args) {

		ScoreServiceV2 ssV2 = new ScoreServiceV2();

		for (int i = 0; i < 100; i++) {
			if (ssV2.inputScore() == null) {
				break;
			}
		}

		// V1을 상속받았기 때문에 print값이 나타남
		ssV2.printScore();

	}

}
