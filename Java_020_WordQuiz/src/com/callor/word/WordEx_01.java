package com.callor.word;

import com.callor.word.impl.WordServiceImplV2;
import com.callor.word.service.WordService;

public class WordEx_01 {

	public static void main(String[] args) {

		WordService wService = new WordServiceImplV2();

		wService.startGame();
	}

}
