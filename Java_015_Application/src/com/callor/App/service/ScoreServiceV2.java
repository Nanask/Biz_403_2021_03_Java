package com.callor.App.service;

import com.callor.App.model.ScoreVO;
import com.callor.App.service.Impl.ScoreServiceImplV2;

public class ScoreServiceV2 extends ScoreServiceImplV2 {
	/*
	 * scoreList에 성적정보를 추가할 때 학번을 입력받을텐데 이미 등록한 학번 정보가 있으면 그 학번은 추가하지 못하도록 하는 코드
	 * 
	 * V2의 inputNum() method를 재 정의 한다. V2의 inputNum() method를 재 젖ㅇ의 하기 위하여 private를
	 * proteted로 변경했다.
	 * 
	 */
	@Override
	protected String inputNum() {
		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			if (intNum == null) {
				return null;
			}
			String strNum = String.format("2021%03d", intNum);

			/*
			 * 생성한 strNum에 저장된 학번이 scoreList에 있는지 확인
			 */
			int index = 0;
			// index 0 ~ scoreList.size() -1 반복하는 과정에서 0 ~ scoreList.size() -1에 해당한 값을 갖게
			// 된다.
			for (index = 0; index < scoreList.size(); index++) {
				ScoreVO vo = scoreList.get(index);
				if (vo.getNum().equals(strNum)) {
					break;
				}
			}
			// for() 반복문이 모두 정상종료 되었는지? : index >= size()
			// 아니면 중간에 중단되고 빠져나왔는지? : index < size() // for()문 중간에 break가 실행됐다. // 이미 등록된
			// 학번이 있었다라는 의미
			if (index < scoreList.size()) {
				System.out.println(strNum + "는 이미 등록되어 있음");
				// 다시 입력받으러 가기
				continue;
			}
			return strNum;
		}
		
	}

}
