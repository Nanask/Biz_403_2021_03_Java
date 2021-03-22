package com.callor.arrays;

public class Array_02 {
	
	public static void main(String[] args) {
		
		// 어떤 값을 지정할 변수를 3개 이상 만들어야 한다면 배열을 만드는 것이 효율적이다.
		int intKor1 = 0;
		int intKor2 = 0;
		int intKor3 = 0;
		
		// 두가지는 같은 방법임
		
		int[] intKors = new int[3]; // 배열은 0부터 시작해서 첨자보다 숫자 1개가 적다.
		
		//값저장
		//변수이름[위치주소] = 값
		//변수이름[첨자] = 값 / 첨자는 무조건 정수여야 한다.
		
		intKors[0] = 100;
		intKors[1] = 90;
		intKors[2] = 88;
		// intKors[3] = 100; 설정값이 3이라서 불가능
		
		//값 읽기
		intKor1 = intKors[0];
		intKor2 = intKors[0];
		intKor3 = intKors[0];
		
		//배열하고자 하는 숫자가 같을경우 종류별로 해도 상관없음
		
		for(int index = 0 ; index < 3 ; index++ ) {
			System.out.println(intKors[index]);
			
		}
		
	}

}
