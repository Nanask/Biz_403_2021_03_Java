package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1 {

	Random rnd;

	public NumberServiceV1() {
		// TODO Auto-generated constructor stub

		Random rnd = new Random();

	}
	/*
	 * Random 수를 생성하여 3의 배수이면 그 수 값을 표현하고 아니라면 null을 return하라. => 반드시 어떤 값을
	 * return하라! 대표값으로 어떤 type의 값을 return 할 것인가 생성한 수가 1 ~ 100까지 정수형 난수 중 3의 배수이면서
	 * 정수인 값을 return 하라 정수형 3의 배수를 return하라!
	 * 
	 * return type을 void가 아닌 정수형 type으로 지정해야 한다. int와 Integer가 있다. return 의 두번째 조건에
	 * "아니면 null 값을 return"하나는 지시가 있으므로 int 형은 사용할 수 없다.
	 * 
	 * void 키워드 method에 return 명령이 꼭 없어도 되는 경우 // 결정이 되지 않았을때 가장 기본적으로 사용하는 키워드
	 * 
	 * 이 method는 정수형 3의 배수 또는 null값을 return 해야 하기 때문에 Integer형 return type을 설정해야 한다.
	 * 그래서 void 대신 Integer를 사용한다.
	 * 
	 * void 대신 Integer를 사용하면 반드시 return 명령문과 return할 값 (대상)이 코드에 있어야 한다. 이 method는
	 * return 명령문만으로 처리가 되지 않고 반드시 return 할 값(대상)이 있어야한다.
	 * 
	 * primitive type중에 숫자형 인 경우는 0을 wrapper 클래스 type을 사용하는 경우는 null을 보통 사용한다.
	 */

	public Integer inputNum() {

		// 키워드가 Integer 형이기 때문에 int를 사용해도 상관없음
		Integer num1 = rnd.nextInt(100) + 1;
		int num2 = rnd.nextInt(100) + 1;

		if (num1 % 3 == 0) {
			return num1;
		}
		
		if (num1 % 3 == 0) {
			/*
			 * 현재 inputNum() method의 return type은 Integer이다.
			 * 그런데 여기서 return하는 num2변수의 type은 int이다.
			 * 별다른 문제를 일으키거나 하지는 않지만 실제 코드가 작동 될때는 int형을 Integer wrapper클래스 형으로 변환하는 과정이 일어난다.
			 */
			return num2;
		}
		return null; // 키워드가 void가 아닐경우 return의 기본적인 표현

	}
}
