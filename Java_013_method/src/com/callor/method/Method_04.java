package com.callor.method;

import java.util.Scanner;

import com.callor.method.service.NumberServiceV2;

public class Method_04 {

	public static void main(String[] args) {

		NumberServiceV2 nsV2 = new NumberServiceV2();

		Integer sNum = nsV2.inputNum();

		Scanner scan = new Scanner(System.in);
		

		/*
		 * 입력을 받을때 정수 0 ~ 100까지 또는 문자열 QUIT
		 * 다른 TYPE의 데이터를 동시에 취급하기 위해서는 기본 type을 String형으로 설정하는 것이 편하다.
 		 */
		System.out.println(" 0 ~ 100까지 중 정수입력");
		System.out.println("QUIT 입력하면 종료");
		System.out.println(" >> ");
		
		//모든 입력을 문자열 type으로 하라
		//입력받은 문자열을 strNum에 저장하라
		//int num = scan.nextInt(); 대신 밑에 표현처럼!
		String strNum = scan.nextLine(); //모든 입력을 문자열 type으로 하라
		if(strNum.equals("QUIT")) {
			System.out.println("종료합니다");
		}else {
			
			//QUIT가 아닌 다른 값이 입력됬으면 일단 입력한 값을 정수형으로 변환하자
			//변환된 정수값을 변수에 저장
			int intNum1 = Integer.valueOf(strNum);
			//int 형으로 받은 값은 integer형으로 변환하는 과정을 거친다.
			Integer intNum = Integer.valueOf(strNum);
			
			System.out.println("입력된 정수 : intNum2");
		}

	}

}
