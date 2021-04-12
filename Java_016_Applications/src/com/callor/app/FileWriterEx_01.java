package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

//입력값을 저장할 때 콘솔을 실행시키고 해당 패키지를 누른 후 f5를 누르면 파일생성!

public class FileWriterEx_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		//2개의 난수로 4칙연산을 수행할텐데
		//뺄셈과 나눗셈은 반드시 큰수 - 작은수, 큰수 / 작은수
		
		if(num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		int sum = num1 + num2;
		int minus = num1 - num2;
		
		
		/*
		 * eclipse를 사용하여 프로젝트를 만들었을때 Project의 소스코드가 저장되는 곳은
		 * Project/src 폴더 이후에 패키지 이름으로 만들어진다.
		 * 새로운 파일을 만들기 위해서 src/package-name 폴더를 지정하는데
		 * 타이핑을 직접하다보면 오타가 발생할 수 있기 때문에 Copy Qulalified...를 사용하여 임의 파일
		 * 이름을 가져오고 필요한 파일로 이름을 변경하여 사용한다.
		 */
		String fileName = "src/com/callor/app/mydata.txt";
		
		//file과 관련된 클래스를 사용할 때는 객체선언과 생성문을 분리하여 작성한다.
		
		//fileWriter , printWriter를 객체로 선언
		FileWriter fileWriter = null; //파일을 생성하기 위해 초기화
		PrintWriter out = null; // print라는 이름은 충돌을 일으킬 수 있기 때문에 out으로 이름을 설정했음
		
		// 객체 생성
		// FileWriter 클래스를 객체로 생성할 때 만들(작성할,새로생성할) 파일이름(경로포함)을
		// 생성자 매개변수로 전달해 주어야 한다.
		
		try {
			// FileWriter 클래스의 객체만으로도 파일에 기록할 수 있지만 상당히 복잡하고 불편한 코드를 만들어야 한다.
			// PrintWriter 클래스의 객체를 Filewriter 클래스의 객체와 연결하여 
			// System.out 의 print 관련 method와 똑같은 방법으로 파일에 text들을 저장한다.
			
			//OS <-> FileWriter <-> PrintWriter가 서로 연결되어 데이터를 파일에 기록한다.
			fileWriter = new FileWriter(fileName); //파일이 만들어져(열려있어) 대기중
			out = new PrintWriter(fileWriter);
			
			out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			
			
			
//			out.printf("%d + %d = %d\n" ,num1 , num2 ,num1 + num2);
//			
//			if(num1 > num2) {
//				out.printf("%d - %d = %d\n" ,num1 , num2 ,num1 - num2);
//			}else {
//				out.printf("%d - %d = %d\n" ,num2 , num1 ,num2 - num1);
//			}
//			
//			out.printf("%d * %d = %d\n" ,num1 , num2 ,num1 * num2);
//			
//			if(num1 > num2) {
//				out.printf("%d / %d = %d\n" ,num1 , num2 ,num1 / num2);
//			}else {
//				out.printf("%d / %d = %d\n" ,num2 , num1 ,num2 / num1);
//			}
			
			
			out.flush(); //기록하기
			
			out.close(); //파일닫기
			
			//PrintWriter를 닫으면 FileWriter도 같이 닫히기 때문에 일부러 close하지 않아도 무방하다.
			fileWriter.close();
			
			System.out.println("저장완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(fileName + "파일을 생성할 수 없음");
		}
	
	}
}
