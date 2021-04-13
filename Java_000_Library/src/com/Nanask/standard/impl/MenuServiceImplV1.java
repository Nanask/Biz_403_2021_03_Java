package com.Nanask.standard.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Nanask.standard.MenuService;

/*
 * 사용자에게 업무리스트를 보여주고 업무 번호를 입력하면 해당하는 업무 번호를 return
 * QUIT를 입력하면 null return
 */

public class MenuServiceImplV1 implements MenuService {

	protected String title;
	protected List<String> menuList;
	protected Scanner scan;
	
	/*
	 * 생성자에 매개변수 선언
	 * MenuServiceImplV1 클래스를 사용하여 객체를 생성할때는 title 변수와 menuList에 값을 담아서
	 * 파라메터로 전달하고 생성자를 호출해야한다.
	 * 
	 * new MenuServiceImplV1() 형식으로 작성이 안된다.
	 * 반드시 String, List형 두개의 값을 전달해 주어야 한다.
	 * new MenuServiceImplV1(title, menuList)형식으로 만들어야 한다.
	 */

	public MenuServiceImplV1(String title, List<String>menuList) {
		
		//객체를 생성할 때 전달한 매개변수 title을 멤버변수 this.title
		this.title = title; // 매개변수와 멤버변수의 이름이 같으므로 this를 사용해줌
//		menuList = new ArrayList<String>();
		this.menuList = menuList; // 직접생성하는 것이 아닌 누군가가 만들어서 보내줄수 있게 해줌
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {

		while (true) {
			System.out.println("=".repeat(50));
			System.out.println(title);
			System.out.println("-".repeat(50));
			int nSize = menuList.size(); //메뉴리스트개수
			for (int menuIndex = 0; menuIndex < nSize; menuIndex++) {

				System.out.printf("%d.%s\n", menuIndex + 1, menuList.get(menuIndex));

			}
			System.out.println("QUIT. 업무종료");
			System.out.println("-".repeat(50));
			System.out.print("업무선택(QUIT) >> ");
			String strM = scan.nextLine();
			if (strM.equals("QUIT")) {
				return null;
			}
			Integer intM = null;

			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.printf("업무는 1 ~ %d, 또는 QUIT만 입력하세요", nSize);
				continue;
			}
			if(intM < 1 || intM > nSize) {
				System.out.printf("업무는 1 ~ %d 까지 선택하세요\n", nSize);
				continue;
			}
			return intM;
		}

	}

}
