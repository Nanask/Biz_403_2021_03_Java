package com.callor.apps;

import com.callor.apps.service.ScoreServiceV2;

public class App_09 {
	
	public static void main(String[] args) {
		
		// Public ScoreServiceV1()
		// Public ScoreServiceV2 ( int members )
		// method의 괄호() 안에 선언된 변수 
		// 매개변수, parameter 라고 한다.
		// 5는 ssV2 객체를 만들때 생성자에게 전달(보내는) 값
		// argument
		// 필요한 값을 변경하여 사용할 수 있음
		ScoreServiceV2 ssV2 = new ScoreServiceV2(5);
		
		ssV2.makeMembers();
		ssV2.makeTotal();
		ssV2.printScore();
		
		
	
		
	}

}
