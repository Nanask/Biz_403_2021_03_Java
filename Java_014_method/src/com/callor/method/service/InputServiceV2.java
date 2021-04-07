package com.callor.method.service;

import java.util.Scanner;

/*
 * 전통(구조적 프로그래밍) 방법
 * 원칙적으로 같은 클래스에서 같은 이름의 method는 중복하여 작성할 수 없다.
 * 
 * public Integer inputValue1(String title);
 * public Integer inputValue2(String title, int start);
 * public Integer inputValue3(String title, int start, int end);
 * 
 * intputValue1("새우깡");
 * intputValue2("새우깡", 100);
 * intputValue3("새우깡", 0 , 1000);
 * intputValue2("새우깡", 0 , 10000); //2번은 매개변수가 2개로 설정되어있기 때문에 3개를 입력하면 오류가 발생
 * 
 * 
 * 객체지향 개발 방법에서는
 * 그러나 매개변수의 개수,타입,순서가 다르면 같은 이름의 method를 중복하여 작성이 가능하다.
 * public Integer inputValue(String title);
 * public Integer inputValue(String title, int start);
 * public Integer inputValue(String title, int start, int end);
 * 
 * 객체.inputValue("새우깡",100); // 자동으로 2번 method가 연결되어 호출됨
 * 객체.inputValue(100,"새우깡"); // 매개변수 순서 오류발생
 */
public class InputServiceV2 {

	protected Scanner scan;

	public InputServiceV2() {

		scan = new Scanner(System.in);

	}

	public Integer inputValue(String title, int start) {

		String msgTitle = String.format("%s( %d 이상의)", title, start);
		while (true) {
			Integer intNum = this.inputValue(msgTitle);
			if(intNum != null) {
				if(intNum < start) {
					System.out.printf("입력값은 %d 이상이여야 합니다\n", start);
				}
			}
			return null;

		}
	}

	/*
	 * 정수 범위에 대한 유효성검사를 수행하는 method 이미 만들어진 inputValue(String title) method와 연동하여
	 * 사용하겠다.
	 */
	public Integer inputValue(String title, int start, int end) {
		// 유효성 검사를 수행하겠다는 메세지를 미리 작성

		String msgTitle = String.format("%s (%d ~ %d 범위의 )", title, start, end);

		while (true) {
			Integer intNum = this.inputValue(msgTitle);

			// this. inputValue(String title) method가 return 해준 값이 null이 아니면 유효성 검사 실행
			if (intNum != null) {
				// 유효성 검사를 통과하지 못하면
				if (intNum < start || intNum > end) { // intNum값이 null이 아니라면 유효성 검사를 실행
					// 메세지를 다시 보여주고
					System.out.println("입력값은 %d ~ %d 까지 입력하세요\n");
					// 다시 inputValue(string title)를 호출하여 입력받아라.
					continue;
				}
			}
			// inputValue(String title)이 null을 return을 했거나 유효한 범위의 정수를 return했으면
			// 그 값이 담겨있다. 그 값을 return하라.
			return intNum;

		}

	}

	/*
	 * 입력할 부분을 작성한 후 while문을 사용하는 이유 exception이 발생했을때 사용자에게 안내 메세지를 보여주고 다시 입력을 받오록
	 * 하기 위한 선조치
	 */
	public Integer inputValue(String title) {
		while (true) {
			System.out.println(title + "값을 입력하세요(QUIT : 입력취소)");
			System.out.print(" >> ");
			String strInput = scan.nextLine();

			// 가장먼저 QUIT를 입력한 결과값

			if (strInput.equals("QUIT")) {
				return null;
			}
			// if 조건문이 false인 경우 실행되는 부분이므로 굳이 else를 사용하지 않아도 문제가 발생하지 않는다.
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				System.out.println("입력 값 오류");
				System.out.println("정수 또는 QUIT 문자열만 입력하세요");
				continue; // 오류를 알려주고 다시 입력할 수 있게 사용한다.
			}
			// try-catch block의 코드가 정삭적으로 모두 완료되었을 때 실행되는 부분
			// 입력한 값이 정상적 정수형 데이터로 변환되어 intNum 변수에 담겨 있다.
			// 입력한 정수값이 return된다.
			return intNum;
		}

	}

}
