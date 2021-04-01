package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {
	int rndNum;
	protected Random rnd;
	protected List<Integer> primeList;

	public PrimeServiceV4() {
		// TODO Auto-generated constructor stub
		rndNum = 0;
		primeList = new ArrayList<Integer>();
	}

	public void primeNum() {

		for (int i = 0; i < 50; i++) {
			rndNum = rnd.nextInt(51) + 50;

			boolean notPrime = false;
			for (int index = 2; index < rndNum; index++) {
				if (rndNum % index == 0) {
					notPrime = true;
					break;
				}
			}
			//if( notPrime == true) {
			//if(notPrime == false) {
			if (!notPrime) {
				// else를 쓰는대신 !를 사용하여 반대되는 의미를 표시
				primeList.add(rndNum);
			}
		}
	} // end primeNum()

	public void printPrime() {
		//배열, List 구조의 데이터들을 전체를 반복하여 (읽기) 처리할 경우
		//for(int i = 0 ; i< primeList.size() ; i++) {
		//Integer prime = primeList.get(i) 의 두줄을 한번에 실행하는 효과
		// 			primeList의 값을 순서대로 prime값에 넣겠다라는 의미
		for (Integer prime : primeList) {  
			System.out.println(prime);
		}

	}

}
