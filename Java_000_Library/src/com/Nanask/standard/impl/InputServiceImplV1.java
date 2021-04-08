package com.Nanask.standard.impl;

import java.util.Scanner;

import com.Nanask.standard.InputService;

/*
 * 인터페이스를 implemets 한 클래스는 이름을 지을 때 저미사에 보톡 Impl을 붙였다
 * 
 * 인터페이스를 impL 한 경우에는 인터페이스에 설계된 추상메서드를 만들고 
 */
public class InputServiceImplV1 implements InputService {
	protected Scanner scan;

	public InputServiceImplV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer inputValue(String title) {
		// TODO prompt 타이틀을 보여주고 정수 입력받기
		while (true) {
			System.out.println(title + "값을 입력하세요(QUIT : 입력중단");
			System.out.print(" >> ");
			String strIn = scan.nextLine();
			if (strIn.equals("QUIT")) {
				System.out.println("입력 취소");
				return null;
			}
			Integer intIn = null;

			try {
				intIn = Integer.valueOf(strIn);
			} catch (NumberFormatException e) {
				System.out.println("정수나 QUIT만 입력가능");
				continue;
			}
			return intIn;
		}// end while

	}

	@Override
	public Integer inputValue(String title, int start) {
		// TODO 시작값을 갖는 유효성 검사 추가한 method
		title = String.format("%s (%d 이상)", title, start);
		while(true) {
			//intIn에 저장된 값 == inputValue(String title)이 return해준 값
			Integer intIn = this.inputValue(title);
			if( intIn != null ) {
				if(intIn < start) {
					System.out.printf("입력값은 %d 이상으로 입력하라\n", start);
					continue;
				}
			}
			return intIn;
		}//end while
		
		
	}

	@Override
	public Integer inputValue(String title, int start, int end) {
		// TODO 제목,시작값,종료값으로 유효성 검사 method
		
		title = String.format("%s(%d ~%d 범위의", title,start,end);
		while(true) {
			Integer intIn = this.inputValue(title);
			if(intIn != null) {
				if(intIn < start || intIn > end) {
					System.out.printf("값은 %d ~ %d 까지만 입력하라\n", start , end);
					continue;
				}
			}
			return intIn;
			
		}
	}

}
