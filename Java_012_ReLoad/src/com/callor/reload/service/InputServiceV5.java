package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {

	Scanner scan;
	List<NumberVO> numList;

	public InputServiceV5() {
		// TODO Auto-generated constructor stub

		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {

		System.out.println("1번 숫자를 입력하세요");
		System.out.print("1번 >>");
		String strNum1 = scan.nextLine();
		Integer Num1 = Integer.valueOf(strNum1);

		while (true) {
			System.out.println("1번보다 작은 숫자를 입력하세요");
			System.out.print("2번 >> ");
			String strNum2 = scan.nextLine();
			Integer Num2 = Integer.valueOf(strNum2);

			if (Num1 < Num2) {
				System.out.println(Num1 + "번보다 작은 정수를 입력하세요");
				continue;
			}
			break;
		}
		NumberVO numberVO = new NumberVO();
		numberVO.setNum1(Num1);
		numberVO.setNum2(Num1);
		numList.add(numberVO);

	}//end inputNum
	public void printNum() {
		
		for(int i = 0 ; i < numList.size(); i++) {
			
			NumberVO vo = numList.get(i);
			
			System.out.println(vo.getNum1());
		}
		
		
		
	}

}
