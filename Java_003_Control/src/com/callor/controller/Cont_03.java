package com.callor.controller;

public class Cont_03 {
	
	public static void main(String[] args) {
		
		//0~9까지 출력하
		for(int i =0 ; i < 10 ; i ++) {
			
			System.out.println(i);
		}
		/* 
		 * 1++와 i + 1 의 차이
		 * 1.변수 i에 저장된 값이 변경되느냐, 아니냐 의 차이
		 * 
		 * i++ : i에 저장된 값이 1증가하는 값으로 변경됨
		 * 		변경된 i값을 다른 명령에서 사용하려고 할때
		 * 		for()반복문 내에서 i++를 사용할때는 매우 주의를 해야한다.
		 * 		for() 반복문의 횟수가 변경되어 버린다.
		 * i + 1 : i에 저장된 값은 변경되지 않는다.
		 * 		i 변수에 저장된 값에 1을 덧셈하여 임시적으로 다른 명령에서 사용하려고 할때
		 */
		
		for(int i=0 ; i< 10 ; i++) {
	}
		for(int i= 0 ; i < 10 ; i++) {
			System.out.println("우리나라");
			
			
		
		}
		System.out.println("===================================================");
		
		for(int i = 0; i<10 ; i++) {
			int sum = i + 1 ;
			System.out.println("대한민국");
			
	
		}
		
		for(int i =0 ; i < 10 ; i += 2) {
			i++;
			System.out.println("Republic of Korea");
		}
		
		/* 
		 * for()반복문내에서 i++를 실행하고 {for 본문명령문} 내에서 i--를 실행했다.
		 * 이런상황이 되면 i값은 1<10 조건에서 항상 true인 상태가 되어 무한 반복되는 코드가 된다.
		 */
		for(int i = 0 ; i < 10 ; i++) {
			i--;
			System.out.println("대한민국 만세");
			// 무한으로 반복, i++로 증가시키고 i--로 감소시켰기 때문에 영원히 값이 0이 됨
		}

}
}