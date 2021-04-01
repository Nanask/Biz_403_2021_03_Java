package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {

	Scanner scan;
	List<NumberVO> numList;

	public InputServiceV4() {
		// TODO Auto-generated constructor stub

		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();

	}
	public void inputNum() {

		System.out.println("1번 정수를 입력하세요");
		System.out.println("1번 >> ");
		Integer num1 = scan.nextInt();
		System.out.println("2번 정수를 입력하세요");
		System.out.println("2번 >> ");
		Integer num2 = scan.nextInt();

		NumberVO vo = new NumberVO();
		vo.setNum1(num1);
		vo.setNum2(num2);
		numList.add(vo);
	}

	public void printNum() {

		for (int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
			System.out.println(vo.getNum1() + "\t");
			System.out.println(vo.getNum2());

		}

	}
}
