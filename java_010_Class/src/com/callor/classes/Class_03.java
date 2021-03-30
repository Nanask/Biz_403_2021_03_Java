package com.callor.classes;

//List , Class

//ArrayList는 add값을 method로 지정하여 사용하고 범위를 나타내는 단위인 length대신 size를 사용한다.
//또한 특정 값을 불러낼때에는 get을 사용한다.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class_03 {
	
	public static void main(String[] args) {
		
		//<Integer> 필요한 정수형 데이터를 저장하겠다.
		// Generic 사용 : <객체>
		// List 형 객체에 저장할 데이터의 type을 제한함으로써 코드의 실행에 효율을 높이고,
		// 메모리 사용의 효율을 높이기 위함이다.
		List<Integer> divisor = new ArrayList<Integer>();
		Random rnd = new Random();
		int intNum = rnd.nextInt(51) + 50;
		
		for(int i = 2 ; i < intNum ; i++) {
			if(intNum % i == 0) {
				divisor.add(i);
				//미리 배열을 저장할 필요 없이 add를 사용하여 표시하면 된다.
			}
		}
		
		System.out.println("생성된 난수 : " + intNum);
		System.out.print("약수들의 리스트 : ");
		
		//size : 데이터가 몇개 저장되어있는지 알려주는 것
		for(int i = 0 ; i < divisor.size(); i++) {
			System.out.println(divisor.get(i) + "\t");
			
			
		}
	}

}
