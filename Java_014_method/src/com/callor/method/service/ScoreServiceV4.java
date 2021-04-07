package com.callor.method.service;

public class ScoreServiceV4 {

	protected InputServiceV2 inServiceV2;

	public ScoreServiceV4() {

		inServiceV2 = new InputServiceV2();
	}

	public Integer inputScore() {

		String[] subject = new String[] { "국어", "영어", "수학" };

		Integer score = 0;

		for (int i = 0; i < subject.length; i++) {

			score = inServiceV2.inputValue(subject[i]);
			if (score == null) {
				System.out.println("종료");
				return null;
			}

		}
		return null;

	}

}
