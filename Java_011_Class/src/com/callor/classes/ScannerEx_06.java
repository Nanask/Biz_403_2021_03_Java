package com.callor.classes;

//try-catch
//endsWich
//continue;
//문제가 발생하더라도 다시 입력할 수 있게 도와줌

import java.util.Scanner;

public class ScannerEx_06 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			Integer intNum1 = 0;
			Integer intNum2 = 0;
			
			System.out.println("=====================================================");
			System.out.println("숫자 2개를 입력하세요");
			System.out.print("숫자1 (QUIT:중단하기) >> ");
			String strNum1 = scan.nextLine();
			//Scanner의 변수를 이용하여 사용한 것이기 때문에 Scanner scan으로 표시되어있다면 scan으로
			//						Scanner scanner로 변수를 표시했다면 scanner로 표기해야 선언이 안됐다는 오류가 발생하지 않는다.
			
			if(strNum1.endsWith("QUIT")) {
				//main() method에서 return이 실행되면 어플리케이션을 끝내겠다는 통보
				return;
			}
			try {
				intNum1 = Integer.valueOf(strNum1);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자로만 입력하세요");
				continue;
			}
			System.out.println("-----------------------------------------------------");
			System.out.print("숫자 2 >> ");
			String strNum2 = scan.nextLine();
			try {
				intNum2 = Integer.valueOf(strNum2);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자로만 입력하세요");
				continue;
			}
			
			
			System.out.printf("%d * %d = %d\n", intNum1, intNum2 , intNum1 * intNum2);
			
			
			
		}
	}

}
