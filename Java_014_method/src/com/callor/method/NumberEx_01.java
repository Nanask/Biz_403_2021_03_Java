package com.callor.method;

import com.callor.method.service.NumberServiceV1;

public class NumberEx_01 {
	
	public static void main(String[] args) {
		
		NumberServiceV1 nsV1 = new NumberServiceV1();
		
		// 두개의 매개변수를 갖는 addNum() method에게 정수 31과 29를 전달하고
		// 그 결과값을 retNum 변수에 담아라
		Integer retNum = nsV1.addNum(14, 20);
		if(retNum == null) {
			System.out.println("결과는 짝수가 아님");
		}else {
			System.out.printf("결과 [%d] 는 짝수", retNum);
			
		}
		
		/*
		 * addNum(float num1, float num2) method는 
		 * 		return type이 Float 이기 때문에 
		 * 		return 되는 결과값을 저장하는 변수(retNum1)도
		 * 		반드시 float,Float 형이여야 한다.
		 */
//		Integer retNum1 = nsV1.addNum(30.2F, 33.2F);
		Float retNum1 = nsV1.addNum(30.3F, 30.2F);
		
		//NullPointerException 발생
//		float retNum2 = nsV1.addNum(30.3F, 30.2F);
		
		/*
		 * 변수를 선언하는 방식에는 primitive / wrapper class 방식이 있다.
		 * 
		 * 특히 숫자를 다루는 경우에 항상 숫자값만 저장된다는 보장이 있을 경우는
		 * 		primitive 방식으로 선언해도 아무런 문제가 없다.
		 * 
		 * java나 DB(DataBase)와 연동되는 프로젝트를 구현할 때는 null(널) 이라는 값을 항상 인식해야 한다.
		 * 		어떤 결과가 null 값을 갖게 되는 경우 primitive 방식에서는 취급이 불가하다.
		 * 
		 * 이럴때 변수를 선언하려면 wrapper class 방식을 사용하는 것이 바람직하다.
		 */
		
		nsV1.addNum(30, 40);
		nsV1.addNum(30, 40);
	}
	

}
