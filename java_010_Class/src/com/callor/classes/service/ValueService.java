package com.callor.classes.service;

//Score
//Value_05 에 쓰임 

public class ValueService {
	
	/*
	 * 클래스의 맴버변수를 public으로 선언하는 것은 매우 위험한 코드이다
	 * 어떤 이유로든 public으로 된 맴버변수는 값이 변경될 수 있다.
	 * =>원하지 않는 값으로 변수 내용이 요염될 수 있다
	 * 그런 현상을 방지하기 위해 맴버 변수는 가급적 private으로 선언을 하고 맴버 변수값을 객체.변수 형식으로
	 * 읽어내고자 할때는 getter() method를 만들어 주는 것이 좋다.
	 * == 정보의 은닉
	 */
	public int retNum;
	public int getRetNum() {
		return retNum;
		
		//값을 선언했고 호출한 곳에 return할때는 retNum으로 할것이라고 기재된 것
		//자세한 설명은 밑부분을 참조하자
	}
	
	public void nums() {
		// nums method는 어떤 연산을 수행하고 그 결과값인 100을 호출한 곳에 return 하고 싶다
		// void method에서는 값을 return 할 수 없다.
		// 그래서 맴버변수를 선언하고 맴버변수에 값을 저장해 두었다.
		retNum = 100;
	}
	
	public Integer numsRet() {
		return 100;
	}

}
