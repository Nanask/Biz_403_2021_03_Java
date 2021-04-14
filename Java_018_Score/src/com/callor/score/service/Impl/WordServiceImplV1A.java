package com.callor.score.service.Impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.WordVO;
import com.callor.score.service.WordService;

public class WordServiceImplV1A implements WordService {
	List<WordVO> workList;
	
	public WordServiceImplV1A() {
		workList = new ArrayList<WordVO>();
	}

	@Override
	public void loadWord() {
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		
		String fileName = "src/com/callor/score/Word.txt";
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				System.out.println(reader);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewWord() {
		// TODO Auto-generated method stub
		
	}

}
