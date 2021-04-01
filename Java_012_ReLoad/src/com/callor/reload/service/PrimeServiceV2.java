package com.callor.reload.service;

public class PrimeServiceV2 extends PrimeServiceV1 {
	
	// protected로 선언된 객체, 변수는 자동으로 생성되어 상속받은곳에서 사용할 수 있다.
	// Random을 굳이 만들필요는 없다.

	
	public void pirmeNum() {
		
		int rndNum = rnd.nextInt(51) +50;
		
		//flag 변수 : 상태를 설정하여 사용할 변수
		boolean notPrime = false;
		for(int i = 2 ; i < rndNum ; i++) {
			if(rndNum % i == 0) {
				notPrime = true;
				break;
			}
		}
		// flag 색깔에 따라 소수, 소수가 아님을 출력하는 것
		if( notPrime ) {
			//notPrime이라는 값이 false로 설정이 되어있으므로 굳이 ==false로 표시하지 않아도 된다.
			System.out.println(rndNum + "는 소수가 아님");
		}else {
			System.out.println(rndNum + "는 소수임");
		}
	}
}
