package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV2 extends ScoreServiceV1 {

	public ScoreServiceV2(int members) {
		intKor = new int[ members ];
		intKor = new int[intKor.length];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];

	}

}