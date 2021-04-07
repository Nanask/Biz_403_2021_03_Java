package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	protected String[] subject;
	protected InputServiceV2 isV2;
	protected List<Integer> kors;
	protected List<Integer> engs;
	protected List<Integer> maths;
	

	public ScoreServiceV5() {

		subject = new String[] { "국어", "영어", "수학" };
		isV2 = new InputServiceV2();
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();
	}

	public Integer inputScore() {
		int[] scores = new int[subject.length];
		int num = scores.length + 1;

		for (int i = 0; i < subject.length; i++) {
			Integer score = isV2.inputValue(subject[i], 0, 100);
			if (subject[i].equals("국어")) {
				kors.add(score);
			} else if (subject[i].equals("영어")) {
				engs.add(score);
			} else if (subject[i].equals("수학")) {
				maths.add(score);
			}
		}
		return null;

	}

	public void inputScore2() {
		int[] scores = new int[subject.length];

		for (int sb = 0; sb < subject.length; sb++) {
			scores[sb] = isV2.inputValue(subject[sb], 0, 100);

			kors.add(scores[0]);
			engs.add(scores[1]);
			maths.add(scores[2]);

		}
	}

	public void printScore() {

		System.out.println("국어\t영어\t수학\t총점\t평균");

		for (int index = 0; index < kors.size(); index++) {
			System.out.println(kors.get(index) + "\t");
			System.out.println(engs.get(index) + "\t");
			System.out.println(maths.get(index) + "\t");

		}
	}

}
