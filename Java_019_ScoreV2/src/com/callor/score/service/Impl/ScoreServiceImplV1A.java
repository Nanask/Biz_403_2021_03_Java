package com.callor.score.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Nanask.standard.InputService;
import com.Nanask.standard.impl.InputServiceImplV1;
import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;

public class ScoreServiceImplV1A implements ScoreService {
	protected InputService inService;
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected StudentService stService;

	public ScoreServiceImplV1A() {
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		stService = new StudentServiceImplV1A();

		/*
		 * 학번입력하면 scoreList에 같은 학번의 성적이 있는지 확인하여 있으면 저장이 안되게 이미 있으면 다시 학번을 입력하도록 한다.
		 */

	}

	@Override
	public void insertScore() {
		// TODO 성적입력

		// 유효성 검사가 끝난 후 학번을 가지고 VO에 담아야 하기 때문에 While() 전에 선언
		String strNum = null;

		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			if (intNum == null)
				return;
			strNum = String.format("%05d", intNum);

			// 이미 중복된 학번인가를 검사
			ScoreVO scoreVO = this.numCheck(strNum);

			// 값이 null이 아니라면 중복된 값이 있다는 뜻이므로 다시 학번을 입력하도록 continue를 사용한다.
			if (scoreVO != null) {
				continue;
			}
			// 여기에 도달하면 학번에 해당하는 점수가 List에 없다.
			// 학생정보에 등록된 학번인가를 검사하여 학생정보에 없으면 다시 학번을 입력받고
			// 있으면 점수를 입력받도록 break;
			StudentVO stVO = stService.getStudent(strNum); //student값을 가져와서 정보확인
			if(stVO == null) {
				System.out.println("없는 학생");
				System.out.println("학번다시 입력");
				continue;
			}
			
			//여기에 도달하면 학적부에 있는 학번이다.
			
			System.out.println("=".repeat(50));
			System.out.printf("학번:%s\n", stVO.getNum());
			System.out.printf("이름:%s\n", stVO.getName());
			System.out.printf("학과:%s\n", stVO.getDept());
			System.out.printf("학년:%s\n", stVO.getGrade());
			System.out.printf("주소:%s\n", stVO.getAddress());
			System.out.println("=".repeat(50));
			System.out.println("학생정보 맞음?");
			System.out.println("맞으면 enter , 틀리면 no");
			System.out.print(">> ");
			String yesNo = scan.nextLine();
			if(yesNo.equals("NO")) {
				continue; //정보가 다르기 때문에 다시 학번을 입력받도록 함
			}
			break;
		} // While end

		// 성적 입력부분

		Integer intKor = null;
		intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null)
			return;
		
		Integer intEng = null;
		intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null)
			return;
		
		Integer intMath = null;
		intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null)
			return;


		// 위에서 담겨있던 데이터는 clear되고 새로운 scoreVO가 생성된다.
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		
		scoreList.add(scoreVO);
		
		this.printScore();

	}// end insertScore()

	// 파라메터로 전달받은 학번이 scoreList에 있는지 검사
	// 있으면 scoreVO return / 없으면 null을 return
	protected ScoreVO numCheck(String num) {

		//scoreList의 값을 순차적으로 vo에 담아라
		for (ScoreVO vo : scoreList) {
			//vo.getNum()에 담겨있는 값과 입력할 strNum값이 같은지 비교하고 같다면 
			if (vo.getNum().equals(num)) { 
				return vo;
			}
		}
		return null;

	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO 성적리스트 출력
		
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=".repeat(80));
		String strNum = null;
		for(ScoreVO vo : scoreList) {
			
			strNum = vo.getNum();
			
			StudentVO stVO = stService.getStudent(strNum);
			
			System.out.print(strNum + "\t");
			System.out.print(stVO.getName() + "\t");
			System.out.print(stVO.getDept() + "\t");
			System.out.print(stVO.getGrade() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f" , vo.getAvg());
		}
		
		
		
		
		
		
	
		
		

	}

}
