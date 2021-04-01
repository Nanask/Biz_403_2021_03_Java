package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {
	protected List<Integer> intList;
	protected Scanner scan;

	// 클래스 영역에 선언된 변수는 "맴버변수"라고 하고 맴버변수는 이 클래스의 어떤 method에서든지
	// 자유롭게 접근하여 저장, 읽기가 가능하다.
	// int num;

	public InputServiceV2() {
		// TODO Auto-generated constructor stub

		intList = new ArrayList<Integer>();
		scan = new Scanner(System.in);

		// method의 {} 에 선언된 변수는 지역변수라고 한다.
		// 지역변수는 {}를 벗어나면 변수가 소멸된다.
		// {}이 서로 다르면 이름은 같아도 절대 접근이 불가하다.
		// 맴버변수에 같은 이름이 있는데 지역변수에 같은 이름으로 변수를 또 선언하면
		// 맴버변수는 감춰져서 접근이 불가하다.
		// String num;
	}

	public void inputNum() {
		int intNum = 0;
		while (true) {
			System.out.println("50에서 150이내 정수를 입렵하세요");
			System.out.println(">> ");
			intNum = scan.nextInt();

			if (50 > intNum && intNum < 150) {
				intList.add(intNum);
				break;
			} else {
				System.out.println("값은 50 ~ 150범위내에서 입력하세요");
			}
		}
	}
}
