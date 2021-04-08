package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {
	Scanner scan;

	public InputServiceV1() {
		scan = new Scanner(System.in);

	}

	public Integer InputValue(String title) {

		System.out.println(title + "값을 입력하세요(QUIT : 종료)");
		System.out.println(" >> ");
		title = scan.nextLine();
		while (true) {

			if (title.equals(title)) {
				return null;
			}
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(title);
			} catch (NumberFormatException e) {
				System.out.println("정수 또는 QUIT만 입력하세요");
				continue;

			}
			return intNum;

		}

	}

	public Integer InputValue(String title, int start) {

		String msgTitle = String.format("%s( %d 이상의)", title, start);
		while (true) {
			Integer intNum = this.InputValue(msgTitle);
			if (intNum != null) {
				if (intNum < start) {
					System.out.printf("입력값은 %d 이상이여야 합니다\n", start);
					continue;
				}
			}
			return null;
		}

	}

	public Integer InputValue(String title, int start, int end) {

		String msgTtile = String.format("%s (%d ~ %d 범위의 )", title, start, end);

		while (true) {
			Integer intNum = this.InputValue(msgTtile);

			if (intNum != null) {
				if (intNum < start || intNum > end) {
					System.out.printf("입력값은 %d ~ %d 까지 입력하세요\n", start, end);
					continue;
				}
			}
			return intNum;
		}

	}

}
