package com.callor.classes;

//Score

import java.util.Scanner;

/*
 * null 값
 * 프로그래밍, 정보처리에서는 어떤 항복의 데이터가 있는가 없는가를 판단해야 하는 경우
 * 
 * 문자열의 경우는 값이 없는 경우를 ""으로 표현할 수 있다
 * 숫자형일 경우는 일반적으로 "0"이라는 값을 없는 값으로 표현을 하기도 한다.
 * 
 * if(변수 == 0) : 없다라는 표현을 사용할 수 있지만
 * 실제로 어떤값이 0인 값을 갖는지, 아니면 아무것도 없어서 0인지 구별할 수 없다.
 * 그래서 null 값을 사용하여 실제로 아무것도 없는 상태를 표현한다.
 * 
 * java primitive type의 변수들은 null 을 저장할 수 없다.
 * wrapper class 사용하여 선언된 변수는 null을 저장할 수 있다.
 * 
 */
public class Value_02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		
		// 키보드에서 숫자를 입력하고 Enter를 누르면 값이 num 변수에 저장되고 다음 코드가 실행
		//Integer num = scan.nextInt();
		//scan.nextInt 숫자가 아닌 경우를 입력하면 오류발생
		//System.out.println(num);
		
		// 키보드에서 문자열을 입력하고 Enter를 누르면 값이 str 변수에 저장되고 다음 코드가 실행되나
		// nextLine라는 코드로 인해 Enter를 눌러도 입력을 종료하고 다음 코드가 실행된다.
		System.out.print("숫자1 >> ");
		String str1 = scan.nextLine();
		if(str1 == "") { // "" <= 문자열변수에서 null 값과 유사한 성격을 갖는 값
			System.out.println("아무것도 없는 값 입력");
		}
		
		System.out.print("숫자2 >> ");
		String str2 = scan.nextLine();
		
		Integer num1 = Integer.valueOf(str1);
		//valueOf() ()안에 있는 것을 변환시켜주는것 , 여기서는 문자열을 정수형으로 변환시켰다.
		Integer num2 = Integer.valueOf(str2);
		System.out.println(num1 + num2);
		
		if(num1 == 0) {
			System.out.println("num1 변수에 0이 담겨있다");
		}
		
		if(num1 == null) {
			System.out.println("num1 변수에 값이 없다");
		}
		
		
	}

}
