package com.callor.reload.service;

//소수가 아닌경우 notPrime이라는 변수를 만들어 구하기

import java.util.Random;

public class PrimeServiceV1 {
	
	protected Random rnd;
	
	public PrimeServiceV1() {
		// TODO Auto-generated constructor stub
		rnd = new Random();
		
	}
	
	public void primeNum() {
		int num = rnd.nextInt(51) + 50;
		/*
		 * for() 반복문이 실행되거나 끝나는경우
		 * 비교문 "i < num" true인 동안 반복하라
		 * 
		 * 만약 num이 10이라면
		 * i = 9일때까지 반복하라는 뜻
		 * for() 반복문이 종료되면 i 값은 얼마일까?
		 * i 값이 num보다 적으면 {} 내의 코드를 실행하고 실행 후 i++를 실행
		 * i가 9가 되었을 때 {} 를 실행하고 다시 i++를 실행한다.
		 * 그래서 for() 반복문이 중단되지 않고 모두 정상수행이 되면 i값은 num값과 같아진다.
		 * i == num 인데 i < num이냐고 물어본것이라 조건에 맞지 않아 for문이 반복하지 않고 끝나버린다.
		 * 
		 * 만약 for() 반복문이 중간에 break를 만났다면
		 * 무조건 i값은 항상 num값보다 작다.
		 */
		// num 가 6라고 가정했을때 
		// 6 % 2 , 6 % 3 , 6 % 4 , 6 % 5 까지 연산을 수행한다.
		// 이럴경우 소수인경우와 소수가 아닌경우 2가지를 모두 출력한다.
		boolean notPrime = false;
		for(int i = 2 ; i < num ; i++) {
		
//			if( num % i == 0) {
//				break;
				//num를 i값들로 나머지 연산을 했을 때 한번이라도 나머지가 0이면 그 수는 소수가 아닌경우이다.
				//그렇다면 그 이후에는 연산을 할 필요가 없게 되므로 break를 넣어 멈춘다.
				
			}// for() end
		//여기에서 for() 반복문이 break가 되었나?
		// = > 소수가 아니라는 이야기, 연산하는 동안 나머지가 0인 값을 한번이라도 만나면 break를 만나서
		//아니면 모두 완료되었나?
		// = > 소수이다.
			if(notPrime == true) {
				System.out.println("소수가 아니다.");
			}else {
				System.out.println("소수이다.");
			}
		}
	}
