package com.callor.App.sevice;

import java.util.Scanner;

import com.Nanask.standard.InputService;
import com.Nanask.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 {
	Scanner scan;
	InputService is;
	
	public ScoreServiceV1() {
		is = new InputServiceImplV1();
		scan = new Scanner(System.in);
	}
	
	public void Score() {
		int sum = 0;
		float avg = 0;
		
		Integer kor = is.inputValue("국어", 0, 100);
		if(kor == null) {
			return;
		}
		Integer eng = is.inputValue("영어", 0, 100);
		if(eng == null) {
			return;
		}
		Integer math = is.inputValue("수학", 0, 100);
		if(math == null) {
			return;
		}
		
		sum = kor + eng + math;
		avg = (float)sum / 3;
		
		System.out.printf("총점 : %d\n" , sum);
		System.out.printf("총점 : %3.2f" , avg);
		
	}
		
		
	

}
