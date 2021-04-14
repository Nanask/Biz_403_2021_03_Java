package com.callor.score.service.Impl;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.model.WordVO;

public class WordServiceImplV2 extends WordServiceImplV1 {

	public WordServiceImplV2() {
	}

	@Override
	public void viewWord() {

		Random rnd = new Random();

		while (true) {
			WordVO vo = this.getWord();
			String strEng = vo.getEnglish();
			String[] strWords = strEng.split("");

			for (int i = 0; i < 100; i++) {

				int index1 = rnd.nextInt(strWords.length);
				int index2 = rnd.nextInt(strWords.length);

				String temp = strWords[index1];
				strWords[index1] = strWords[index2];
				strWords[index2] = temp;
			}
			while (true) {
				System.out.println("=".repeat(50));
				System.out.println(vo.toString());
				System.out.println("-".repeat(50));
				System.out.println("다음 단어를 올바르게 배열하시오");
				System.out.println(Arrays.toString(strWords));
				System.out.println("-".repeat(50));

				System.out.print(">> ");
				String strInput = scan.nextLine();
				if (strInput.equals("Quit"))
					return; //어디서 호출하던지 무조건 메소드를 끝낸다

				if (strInput.equalsIgnoreCase(vo.getEnglish())) {
					System.out.println("맞았습니다. 참 잘했어요");
					break;

				} else {
					System.out.println("힌트 : " + vo.getKorea());
					System.out.println("다시한번 생각해 보세요");
					continue;
				}

			} // while end

		} // while end

	}
}
