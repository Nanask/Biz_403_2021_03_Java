package com.callor.score;

import com.callor.score.service.WordService;
import com.callor.score.service.Impl.WordServiceImplV1A;

public class WordEx_01 {

	public static void main(String[] args) {
		
		WordService wService = new WordServiceImplV1A();
		
		wService.viewWord();
	}
}
