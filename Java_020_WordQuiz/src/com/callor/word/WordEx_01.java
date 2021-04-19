package com.callor.word;

import com.callor.word.impl.WordServiceImplV1;

public class WordEx_01 {
	
	public static void main(String[] args) {
		
		WordServiceImplV1 wService = new WordServiceImplV1();
		
		//10번 동안 다 단어가 다르게 나오는지 확인해보는 절차
		for(int i = 0 ; i < 10 ; i++) {
		
			wService.startGame();
		}
		
	}

}
