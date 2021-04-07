package com.callor.method;

import com.callor.method.service.InputServiceV2;

public class NumberEx_03 {
	
	public static void main(String[] args) {
		InputServiceV2 inService = new InputServiceV2();
		
		//inService.inputValue("새우깡"); //새우깡의 값을 입력해주세요
		//inService.inputValue("새우깡", 0, 1000); // 범위의 값을 입력하세요
		inService.inputValue("새우깡", 100);
		inService.inputValue("새우깡", 0 , 1000);
		inService.inputValue("새우깡", 100);
		
		
	}

}
