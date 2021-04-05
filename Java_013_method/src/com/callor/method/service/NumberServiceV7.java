package com.callor.method.service;

public class NumberServiceV7 {
	String[] sub;

	InputService is; // inputScore를 불러옴

	public NumberServiceV7() {
		sub = new String[] { "국어", "영어", "수학", "과학", "국사" };

		is = new InputService();

	}

	public void inputScore() {

		Integer score = 0;

		for (int i = 0; i < sub.length; i++) {
			score = is.inputValue(sub[i]); //inputService에 선언되어있는 inputValue를 갖고옴

			while (true) { //inputValue값에서 못한 다른 유효성 검사를 추가함
				if (score == null) { //과목의 값이 null일때 return
					return;
				} else if (score < 0 || score > 100) { //과목의 값이 0이 아니고 점
					System.out.println("0부터 100까지 숫자를 입력해주세요");
					continue;
				} else {
					break;
				}

			}

		}

	}

}
