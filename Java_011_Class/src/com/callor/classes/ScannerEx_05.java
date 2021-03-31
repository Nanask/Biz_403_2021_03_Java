package com.callor.classes;

//equals
import java.util.Scanner;

public class ScannerEx_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print(">> ");
		String str = scan.nextLine();
		System.out.println("입력한 문자열 : " + str);

//		if(str == "END") {
//			System.out.println("안녕!!");
//		}else {
//			System.out.println("반가워!!");
//			//end를 입력해도 ==를 뛰어넘고(비교하지 못하고) "반가워"라는 값이 출력됨
//			//==(동등연산자)는 문자열에서 사용하면 안된다.
//		}
		if (str.equals("END")) {
			System.out.println("안녕!!");
		} else {
			System.out.println("반가워!!");

		}

	}
}
