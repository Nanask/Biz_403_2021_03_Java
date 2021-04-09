package com.callor.App;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class FileWriter_01 {
	
	public static void main(String[] args) {
		
		// 메모리에 저장된 데이터를 Console에 출력할 때 
		System.out.println("출력");
		
		// 키보드로부터 데이터를 입력받기 위해
		Scanner scan = new Scanner(System.in);
//		scan.nextInt();
		
//		임의의 숫자를 만들기 위해서
		Random rnd = new Random();
		rnd.nextInt(100);
		
//		파일에 저장하기
//		1. 어떤 파일로 저장할까
		String fileName = "src/com/callor/App/mydata.txt";
		
//		2. 무엇을 사용하여, 두개의 객체를 선언함
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
//		3. 파일에 데이터를 기록하기 위하여 파일을 열어라
//		새로운 파일을 생성하라 , 만약 이미 있다면 지우고 다시 만들어라
//		파일을 생성했을때는 무조건 try_catch를 사용해야한다.
		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			
			out.println("대한민국만세");
			out.printf("%d * %d = %d\n", 3, 4, 3 * 4);
			out.println("우리나라만세");
//			이 명령이 실행되는 동안에는 하드디스크에 저장하지 않고 임시로 보관하고 있다가
			
			out.flush();
//			이제 저장하겠다
			out.close();
//			종료하겠다
			System.out.println("저장 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
