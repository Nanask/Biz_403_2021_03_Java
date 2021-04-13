package com.callor.score.service.Impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV3 extends ScoreServiceImplV2 {

	
	
	//V1, V2로 부터 다음 method를 상속받은 상태
	//selectMenu(),
	//inputScore(),
	//printScore(),
	//saveScore()
	
	//redScore()
	
	/*
	 * samle.score
	 */
	@Override
	public void readScore() {
		
		String readFile = "src/com/callor/score/sample_score_txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		/*
		 * List에 있는 removeAll() method는 2개의 list에 중복된 데이터가 있으면 중복된 데이터를 삭제하는 method
		 * 
		 * List type 의 데이터를 새로 추가하고자 할때는 기존의 데이터를 삭제하고 추가를 해야 한다.
		 * 이때 사용할 수 있는 코드이다.
		 * 
		 * 파일이나 데이터베이스에서 데이트를 가져와서 List에 반영하고자 할때 먼저 실행해주는 코드
		 */
		ScoreList.removeAll(ScoreList);
		//기존의 데이터에서 추가되는 데이터 중 중복되는 부분을 지워라는 뜻
		
		try {
			fileReader = new FileReader(readFile);
			buffer = new BufferedReader(fileReader);
			while(true) {
				String reader = buffer.readLine();
				//if조건문에 대해 실행할 명령문이 한 줄만 있을 경우 중괄호{}를 생략하고 명령문을 사용할 수 있다.
				if(reader == null)
					//if문 다음에 중괄호를 쓰지 않는다면 밑에 print만 실행하고 멈춰버린다.
//					System.out.println("중단하고");
					break;
					
					String[] scores = reader.split(":");
					Integer intKor = Integer.valueOf(scores[1]);
					Integer intEng = Integer.valueOf(scores[2]);
					Integer intMath = Integer.valueOf(scores[3]);
					
					ScoreVO scoreVO = new ScoreVO();
					scoreVO.setNum(scores[0]);
					scoreVO.setKor(intKor);
					scoreVO.setEng(intEng);
					scoreVO.setMath(intMath);
					ScoreList.add(scoreVO);
					
			}
			buffer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
