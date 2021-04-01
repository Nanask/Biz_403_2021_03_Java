package com.callor.reload.service;

//ArrayList , List
//정수 한개를 만들어 ArrayList에 담기

/*
 * Service 클래스
 * 어디선가 ( main() method ) 에서 객체로 선언, 생성한 후 method호출을 통해 명령을 실행하는 클래스
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inputServiceV1 {
	
	//클래스 영역에 선언된 객체들 : "맴버변수"들
	//접근제한자
	//private : 단독으로 사용하는 경우
	//protected : 이 클래스를 누군가 상속하여 사용할 수 있도록 하는 경우
	//정수형 데이터들을 담을 리스트형 객체
	//Integer wrapper 클래스 형 데이터들을 담을 리스트
	protected List<Integer> intList;
	protected Scanner scan;
	
	//선언만 된 객체는 코드(method)를 호출하여 기능을 수행할 수 없다.
	//반드시 생성(초기화)를 해 주어야 한다.
	//현재 Service 클래스의 생성자 method에서 수행을 한다.
	
	public inputServiceV1() { 
		// TODO inputServiceV1의 생성자 Method
		
		intList = new ArrayList<Integer>();
		scan = new Scanner(System.in);
		
	}//여기까지가 생성 및 초기화를 하는 과정
	
	//method의 선언문
	//클래스에 선언하는 기본 type의 method
	//{} : 블래이드, 코드블럭
	//코드블럭( {} )에 연산을 수행하는 코드를 작성하고 그 코드들의 묶음을 inputNum이라고 하겠다는 선언
	public void inputNum() { 
		
		System.out.println("숫자를 입력하세요");
		System.out.print(">> "); //프롬프트 , 결과출력하는곳
		Integer num = scan.nextInt();
		
		//키보드로 입력받은 정수를 intList에 추가
		intList.add(num);
	}
	public void printNum() {
		
		//for문을 사용하는 이유? 정수 1개일때는 상관없으나 여러개의 값을 사용할때는 만들어야한다.
		//여기서는 list라는 배열을 사용했으므로 정수가 1개여도 숫자를 추가하여도 순서대로 배열을 만들어서
		//출력하기 위해 for문을 사용했다.
		for(int i = 0 ; i < intList.size() ; i++) {
			Integer num = intList.get(i);
			System.out.println("정수 : " + num);
		}
		
		
	}
	


}
