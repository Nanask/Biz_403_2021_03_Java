package com.callor.method;

import com.callor.method.service.InputServiceV1;

public class NumberEx_02 {

	public static void main(String[] args) {
		
		InputServiceV1 inService = new InputServiceV1();
		
		//문자열 1개만 전달하여 method 호출
		//문자열을 전달받아 값을 입력받고 결과를 return
//		inService.inputValue("새우깡");
		
		//문자열 1개와 정수 2개를 전달하여 method호출
		//2개의 정수 범위 내의 값이 입력됐는지 유효성검사 실행
		inService.inputValue("새우깡",0, 100);
	} 
	
}
