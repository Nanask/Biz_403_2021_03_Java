package com.callor.apps;

public class Pay_01 {
	
	public static void main(String[] args) {
	
		int nPay  = 3_723_560;
		int nPaper = 50_500; // 최고액면가 화폐
		
		//정수 = 정수 / 정수 : 소수점 이하가 잘린다.
		// 몫을 구하여 액면가액 만큼 개수를 계산
		int nCont = nPay / nPaper;
		System.out.println(nPaper + "원권" + nCount);
		
		//액면가액만큼 개수를 구했으면
		//nPay에서 액면가액 금액을 빼고 이후에 계산
		// 37235610 % 50000 => 5만원권 * 매수 만큼을 3723560에서 뺀 값이 된다.
		// nPay = nPay - ( nPaper * nCount)
		// nPay = nPay % nPaper;
		
		nPay %= nPaper ;
		nPaper /= 5; // 50000만원에서 5를 나누면 10000원이 되기 때문에 따로 값을 작성하지 않아도 된다.
		System.out.println(nPay);
		
		nCont = nPay / nPaper;
		System.out.println(nPaper + "원권" + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		
	
	}
	

}
