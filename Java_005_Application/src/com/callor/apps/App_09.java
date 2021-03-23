package com.callor.apps;

import java.text.DecimalFormat;

public class App_09 {
	
	public static void main(String[] args) {
		
		int intNum = 3939239;
		DecimalFormat strForm = new DecimalFormat("###,###");
		
		// format(숫자) 명령을 수행하면 숫자를 3자리 구분기호를 부착하여
		// 문자열로 만들어준다.
		String str = strForm.format(intNum);
		System.out.println(str);
		//위 방법은 변수에 담는 방법
		
		System.out.println(strForm.format(92348578));
		//바로 출력하는 방법
	}

}
