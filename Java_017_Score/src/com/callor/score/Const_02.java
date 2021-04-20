package com.callor.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.score.service.ScoreService;
import com.callor.score.service.Impl.ScoreServiceImplV1Ex;

public class Const_02 {
	
	public static void main(String[] args) {
		
		/*
		 * 인터페이스가 있는 클래스의 객체 생성
		 * = 클래스를 선언(작성)할때 인터페이스를 Impl 했다
		 * 
		 * 인터페이스를 사용하여 객체를 선언하고 구현체 클래스의 생성자를 호출하여 객체를 생성,초기화 해야한다.
		 * 
		 * 인터페이스는 생성자 메서드가 없다.
		 */
		
		ScoreService sService = new ScoreServiceImplV1Ex();
		
		
		ArrayList<String> strList1 = new ArrayList<String>();
		LinkedList<String> strList2 = new LinkedList<>();
		Vector<String> strList3 = new Vector<>();
		
		strList1.add("대한민국");
		strList1.add("우리나라");
		
		strList2.add("3 * 4");
		strList2.add("3 / 4");
		
		strList3.add("홍길동");
		strList3.add("이몽룡");
		strList3.add("성춘향");
		
		
		// 리스트에 저장된 내용을 출력하는 method 호출하기
		List(strList1);
		List(strList2);
		List(strList3);
		
	}
	//ArrayList의 내용전체를 Console에 출력하기
	
	/*
	 * 여기에 있는 세개의 method는 각각 ArrayList, LinkedList, Vector type의
	 * 매개변수를 전달받아 연산을 수행한다.
	 * 
	 * 세개의 method는 하는일이 똑같은 코드지만 매개변수 type이 달라서 어쩔수 없이 중복하여
	 * 코드가 작성되어야 한다.
	 */
	public static void List(ArrayList<String> strList) {
		int nSize = strList.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.println(strList.get(i));
		}
	}
	public static void List(LinkedList<String> strList) {
		int nSize = strList.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.println(strList.get(i));
		}
	}
	public static void List(Vector<String> strList) {
		int nSize = strList.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.println(strList.get(i));
		}
	}

}