package com.callor.App;

import com.Nanask.standard.InputService;
import com.Nanask.standard.impl.InputServiceImplV1;

public class InputEx_02 {
	
	public static void main(String[] args) {
		
		InputService isV1 = new InputServiceImplV1();
		
		isV1.inputValue("새우깡");
		
		System.out.println(isV1.toString());
		
	}

}
