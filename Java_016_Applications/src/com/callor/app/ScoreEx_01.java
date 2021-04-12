package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.Impl.ScoreServiceImplV1;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		/*
		 * 아직 ScoreServiceImplV1 클래스의 method들은  코드가 구체적으로 구현되지 않았다
		 *  = method는 만들어져 있지만, 코드는 아직 미완성이다
		 *  
		 *  이런상황에 다른 팀원이 ScoreServiceImplV1 클래스의 method를 호출하는 코드를 작성했을때
		 *  1.method가 없어서 발생하는 문법오류는 없고
		 *  2.언젠가는 호출한 method코드가 구현될 것임을 약속받은 상태이다.
		 *  3.따라서 ScoreServieImplV1의 method를 호출하는 코드는 잠시 만들어만 두고
		 *  	이후의 코드에 집중하여 코딩을 계속할 수 있다.
		 */
		ScoreService sService = new ScoreServiceImplV1();
		
		sService.inputScore();
		
		
	}

}
