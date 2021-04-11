package com.Nanask.app.service;

import java.util.Scanner;

public class InputService {

	Scanner scan;

	public InputService() {
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {

		while (true) {
			System.out.println(title + "값을 입력하세요(QUIT : 종료)");
			System.out.print(" >> ");
			title = scan.nextLine();
			if (title.equals("QUIT")) {
				return null;
			}
			Integer intIn = null;
			try {
				intIn = Integer.valueOf(title);
			} catch (Exception e) {
				System.out.println("QUIT 또는 정수만 입력하세요");
				continue;
			}
			return intIn;
		} // while end
	}

	public Integer inputValue(String title, int start) {

		String msgTitle = String.format("%s (%d 이상의)", title, start);
		while (true) {
			Integer intNum = this.inputValue(msgTitle);

			if (intNum != null) {
				if (intNum < start) {
					System.out.printf("입력값은 %d 이상이여야 합니다\n", start);
					continue;
				}

			}
			return intNum;
		}
	}

	public Integer inputValue(String title, int start, int end) {

		String msgTitle = String.format("%s (%d ~ %d 범위의)", title, start, end);

		while (true) {

			Integer intNum = this.inputValue(msgTitle);

			if (intNum != null) {
				if (intNum != null) {
					if (intNum < start || intNum > end) {
						System.out.printf("입력값은 %d ~ %d 까지 입력하세요\n", start, end);
						continue;
					}
				}
			}
			return intNum;

		} // while end
	}

}
