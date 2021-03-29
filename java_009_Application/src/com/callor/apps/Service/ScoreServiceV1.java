package com.callor.apps.Service;

//Score
import java.util.Scanner;

public class ScoreServiceV1 {

	// 클래스 영역에 Scanner 클래스를 사용하여 scan 객체를 선언
	// NullPointerException
	// JDK 또는 여러가지 클래스를 가져와 사용하는 경우 매우 자주 만나는 Exception
	// 클래스를 사용하여 객체를 "선언만" 했고 아직 사용할 준비가 되어 있지 않다.
	// =>생성, 초기화가 안되었다.
	Scanner scan;

	// 학생 수 만큼 과목점수를 저장할 배열 선언
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intTotal;
	float[] floatAvg;
	int members; // 학번
	int length;

	public ScoreServiceV1(int num) {

		intKor = new int[num];
		intEng = new int[num];
		intMath = new int[num];
		int length = 50;

	}

	// service클래스에서 배열의 개수를 고정하지 말고 최초로 객체를 생성할때 필요한 개수를 매개변수로 전달하고
	// 전달받은 매개변수(members)의 값을 사용하여 배열을 만들자
	public void makeMembers() {

		// scan 객체를 생성 및 초기화 하기
		// 객체를 선언하고 생성하는 코드가 없으면 사용하는 과정에서
		// NullpointerException이 발생한다.
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < intKor.length; i++) {
			members = i + 1;

			System.out.printf("%d번의 국어,영어,수학 점수를 기재하세요\n", members);
			System.out.println(LinesService.dLines(length));
			// 무한 반복문을 사용하여 점수가 0 ~100범위를 벗어나면 메세지를 보여주고 다시 점수를 입력받도록 한다.
			// 만약 정상적인 범위(0 ~ 100)까지 코드를 입력하면
			while (true) {
				System.out.print("국어점수: ");
				intKor[i] = scan.nextInt();
				if (intKor[i] < 0 || intKor[i] > 100) {
					System.out.print("영어점수: ");
					intEng[i] = scan.nextInt();
					System.out.print("수학점수: ");
					intMath[i] = scan.nextInt();
					System.out.println(LinesService.dLines(length));
				} else {
					break;
				}
				scan.close();
			}
		}
	}
	//public : 전체, 공용, 모두 , 누구나
	//객체.addNum()형식으로 method를 호출하여 명령을 실행할 수 있도록 하는 Keyword
	public void addNum() {
		this.inputScore();
		
		//현재 method코드의 끝이다 라는 선언
		//method 선언 키워드가 void면 return 명령을 생략할 수 있다.

		return;
		
	}
	//private : 개인적인, 현재 클래스에서만
	//method를 호출하여 명령을 실행 할 수 있도록 하는 Keyword
	//객체. inputScore() 형식으로 사용 불가
	//외부에 공개하지 않고, 현재클래스의 코드에서만 호출할 수 있도록 제한하는 Keyword
	
	//Integer : void Keyword 대신 정수를 선언하는 키워드를 사용하여 method 선언하기
	//method 코드 끝에 반드시 return 명령문이 있어야 한다.
	
	//여기서 사용된 Integer 키워드는 변수를 선언하는 용도의 키워드가 아닌
	//return type 키워드라고 한다.
	//method의 코드내에 "return 값;" 형식의 코드가 반드시 있어야 함을 선언하는 것
	//return type이 void 형(type)일 경우에는 return 명령문이 생략되거나 return 명령문만 단독 사용이 가능하다.
	
	//하지만 return type이 void형이 아닌 경우 return 명령문은 반드시 코드내에 적절한 위치에 있어야 하고
	//아무 문장이 없어도 return 값 형식으로 사용해야 한다.
	private Integer inputScore() {
		return null; // null대신 0을 사용해도 된다. integer가 정수를 나타내기 때문
		
	}
	public String names() {
		return "홍길동";
	}
	public int add() {
		return 0;
	}
	public float addFloat() {
		return 0.0F;
	}
	public long addLong() {
		return 0;
	}
	
	//참, 또는 거짓이 return과 함께 있어야 한다.
	public boolean yesNo() {
		return false;
	}
	public boolean noYes() {
		return true;
	}

	public void makeTotal() {

		for (int i = 0; i < intKor.length; i++) {
			members = i + 1;
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float) intTotal[i] / 3;
			System.out.println(LinesService.dLines(length));
			System.out.printf("%d번의 성적 합계를 계산합니다", members);
			System.out.println(intTotal[i]);
			System.out.printf("%d번의 성적 평균을 계산합니다", members);
			System.out.printf("%3.2f\n", floatAvg[i]);
		}
	}

	public void printScore() {

		for (int i = 0; i < intKor.length; i++) {
			members = i + 1;
			System.out.println(LinesService.dLines(length));
			System.out.printf("고등학교 성적 리스트");
			System.out.println(LinesService.dLines(length));
			System.out.println("학번\t국어\t영어\t수학\t총점\t평균");

			System.out.printf("3%d\t", members);
			System.out.printf("3%d\t", intKor[i]);
			System.out.printf("3%d\t", intEng[i]);
			System.out.printf("3%d\t", intMath[i]);
			System.out.printf("3%d\t", intTotal[i]);
			System.out.printf("3.2%f\t", floatAvg[i]);

		}
	}
}
