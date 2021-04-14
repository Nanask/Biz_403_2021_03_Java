package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Word_01 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/Word.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				
				String[] strName = reader.split(":");
				
				System.out.printf("%s\6%s\n" , strName[0],strName[1]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}

}
