package com.callor.var;

public class Varriable_20 {
	
	public static void main(String[] args) {
		
		int intKor = 91;
		int intEng = 82;
		
		int intSum = intKor + intEng;
		//설정된 코드를 사용해야 한다. Sum을 사용했으므로 덧셈을 따로 표기할 필요는 없다.
		System.out.printf("%d + %d = %d", intKor, intEng , intSum); // intKor + intEng
		
		
		//논리적 오류, 정수로 설정했으나 정수로 나누어지지 않아 소수점 이하는 생략됨
		int avg = (intKor + intEng) / 2;
		avg = intSum / 2;
		System.out.println("평균 : " + avg);
				
		
	}

}
