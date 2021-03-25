package com.callor.apps.service;

import java.util.Random;

/*
 * Version
 * 
 * 프로젝트 개발 : 개발자가 사용하는 중, Developer Version
 * 누군가에게 Test를 의뢰할 때 종류 
 * 같은 팀의 누군가에게 : alpha Version
 * 외부에 다른 누군가에게 : Bata Version
 * 사용자에게 배포(Deploy) : Release Version, Deploy Version 
 * 							실제 사용하는 사람들에게 설치해서 사용하라
 * 최초 배포 : V1.00 라고 버전정보를 명시, R1.00
 * 		약간의 문제가 발생하여 수정 : V1.1 =>최초배포 이후 수정한 경우 버전 교체
 * 
 * 배포 후에 사용자의 피드백을 받아서 수정하고 재 배포
 * 		V1.XX , V1.XY ~ 등으로 수정해서 재배포 
 * 
 * 사용자의 의견을 수렴하여 새로운 프로젝트를 기획, 제작하여 배포
 * 		기존 프로젝트를 V1이라고 하고 새롭게 기능이 개선(추가)되어 배포된 프로젝트를 V2.xx라고 칭하여 배포한다.
 */


/*
 *  main() method에서 배열을 만들고 값을 저장한 다음, Prime인가를 검사해서 출력했다.
 *  
 *  이 코드를 primeService 클래스를 만들고 분리해서 다시 작성하기
 */

// class 이름짓기
// 1. 첫글자 대문자
// 2. 이후는 camel case
// 3. (upper)

/* 
 * Service 클래스
 * main()에 종합적으로 작성된 코드를 method들을 만들어 분리하고
 * 코드 관리를 쉽게 하도록 만드는 클래스(파일)들
 */
public class PrimeServiceV1 {
	
	// 어떤 변수를 사용하여 프로젝트를 수행할 것인가
	// 여러개(2개이상)의 method에서 공통으로 사용할 변수들을 클래스 영역에 설정한다.
	// 변수를 사용한다 == 변수를 참조한다 : 저장, 읽기
	// 여기는 선언만 하는 곳! 
	int[] intNums; // 원래는 int[] intNums = new int[] 
	// intNums 배열을 설정(초기화, 개수지정)을 하여 사용할 준비
	
	// 생성자(Contructor) method
	// 1.void 키워드를 사용하지 않는다.
	// 2.이름이 클래스 이름과 같다.
	// 3. intNums 배열을 설정( 초기화, 개수지정) 을 하여 사용할 준비
	
	public PrimeServiceV1() {
		int[] intNums = new int[20];
	
		
	}
	// method는 첫글자 소문자로 시작하여 변수 이름짓기와 같은 방식으로 이름을 짓는다.
	// => camel case
	// LowerCamelCase
	// Random 클래스로 값을 만들어 저장
	public void makeNums() {
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
		}
		
		
		
		
	}
	// 저장된 값이 Prime인가 검사하여 출력하기
	public void printPrime() {
	//사용할 변수 설계 과정 	
		
		for(int arr = 0 ; arr < intNums.length ; arr ++) {
			
			int numP = intNums[arr];
			int num = 0 ;
			for(num = 2 ; num < numP ; num++) {
				if(numP % num == 0) {
					break;
					
				}
			}
			if(num < numP) {
				System.out.println(numP + "는 소수아님");
			} else {
				System.out.println(numP + "는 소수");
			}
			
		}
	}
}
