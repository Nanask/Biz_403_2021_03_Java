package com.callor.reload.service;

public class PrimeServiceV5 extends PrimeServiceV4 {

	@Override
	public void primeNum() {

		for (int i = 0; i < 50; i++) {
			
			int rndNum = rnd.nextInt(51) + 50;
			int index = 0;
			for(index = 2 ; index < rndNum ; index++) {
				if(rndNum % index == 0) {
					break;
				}
			}
			//index < rndNum과 반대, index >= rndNum
			//			index >= rndNum
			//			index == rndNum 은 오류가 발생할 확률이 높아 위처럼 사용하는것이 좋음
			if(index >= rndNum) {
				
			}else {
				primeList.add(rndNum);
			}

		}
	}

}
