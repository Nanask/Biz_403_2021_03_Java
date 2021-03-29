package com.callor.apps;

import com.callor.apps.model.ScoreVO;

public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		ScoreVO 홍길동 = new ScoreVO();
		
		홍길동.kor = 90;
		홍길동.eng = 80;
		홍길동.math = 99;
		
		int total = 홍길동.getTotal();
		System.out.println("홍길동 총점 : " + total);
		
		//정보의 은닉
		//멤버변수를 private으로 선언하는 것
		//멤버변수의 값이 원치않게 변경되는 것을 방지하기 위함이다.
		
		//private 선언된 total 멤버변수는
		//연결연산자를 통해 Total 멤버변수에 값을 직접 저장할 수 없다.
		//홍길동.total = 900;
		
		//getter method
		//get으로 시작되는 method는 private으로 선언된 멤버변수의 값을 읽을때 사용하는 method 선언 접두사이다.
		System.out.println("홍길동 평균 : " + 홍길동.getAvg());
		
		System.out.println(홍길동.getClass());
		//객체가 어떤 클래스로부터 만들어진 것인지 알게 해주는 것, 하지만 코드가 어떻게 작동되는지는 나오지 않지만 알필요는 없음
			
		
		
	}

}
