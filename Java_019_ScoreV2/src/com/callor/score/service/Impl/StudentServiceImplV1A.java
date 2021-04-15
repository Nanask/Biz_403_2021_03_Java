package com.callor.score.service.Impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1A implements StudentService {

	protected List<StudentVO> studentList;
	protected String studentFile;

	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 학과 = 4;
	protected final int 주소 = 5;

	public StudentServiceImplV1A() {

		/*
		 * new StudentServiceImplV1() 생성자를 호출하여 객체를 생성하려고 하면 고정된
		 * 파일이름("src/com/callor/score/student.txt")을 사용하여 파일을 읽을 수 있도록 할 예정
		 * 
		 * 생성자에서는 new StudentServiceImplV1("파일명") 의 생성자 method를 다시 호출하는 구조가 된다.
		 */

		// 여기에서 다음의 생성자 메서드를 또 한번 호출
		// new StudentServiceImplA("src/com/callor/score/student.txt");
		this("src/com/callor/score/student.txt");
	}

	public StudentServiceImplV1A(String fileName) {

		this.studentFile = fileName;
		// 어떤곳에서든 매개변수를 사용하여 사용할 수 있도록 만들기
		studentList = new ArrayList<StudentVO>();

		// 클래스를 객체로 생성할때 method를 호출하여 데이터를 사용하도록 준비해 달라
		// list가 생성되고 나서 만들어진 것을 호출해야 되기 때문에 반드시 list밑에다가 적어야한다.
		this.loadStudent();

	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub

	}

	/*
	 * Student.txt 파일에서 학생정보를 읽어 studentList에 데이터 준비하기
	 */

	@Override
	public void loadStudent() {

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(this.studentFile);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				// 파일로부터 읽는 값이 null이다
				// EOF(End of File)에 다다랐다.
				if (reader == null)
					break;

				String students[] = reader.split(":");

				StudentVO vo = new StudentVO();

				vo.setNum(students[학번]);
				vo.setName(students[이름]);
				vo.setGrade(students[학년]);
				vo.setDept(students[학과]);
				vo.setAddress(students[주소]);

				// 디버깅. 맞게 vo값이 들어왓는지 확인하는 절차
//				System.out.println(vo.toString());
				studentList.add(vo);

			}
		} catch (FileNotFoundException e) {
			System.out.println(this.studentFile + "파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽는 동안 문제가 발생했습니다.");
		}

	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO 학번으로 학생조회하여 학생정보 return;

		/*
		 * 1번코드
		 * 기본적인 코드
		 */
//		int nSize = studentList.size();
//		for (int i = 0; i < nSize; i++) {
//			
//			//vo = new StudentVO();
//			//vo = studentList.get(i);
//			//위의 코드와 같은 코드
//			StudentVO vo = studentList.get(i);
//			
//			if (vo.getNum().equals(num)) {
//				return vo;
//			}
//		}
		/*
		 * 2번코드
		 * 새로운 for, forEach
		 * 
		 * 밑의 코드와 같은 코드
		 * int nSize = studentList.size();
		 * for (int i = 0; i < nSize; i++) {
		 * StudentVO vo = studentList.get(i);
		 */
		for(StudentVO vo : studentList) {
			
			
			if(vo.getNum().equals(num)) return vo;
		}
		return null;

	}

	@Override
	public void printStudent() {

		// nSize를 사용하는이유
		// 배열을 사용하여 for()반복문을 구현할때는 배열.length 속성을 직접 반복문의 조건으로 설정한다
		// i < 배열.length
		// List 객체는 특성상 수시로 데이터의 개수가 변경된다.
		// List에 담긴 개수를 알려주는 size() method는 호출될때마다 List에 담긴 데이터 개수를 다시
		// 새는 코드가 실행된다.

		// for()반복문 내에서 i < List.size() 코드를 사용하면
		// for() 반복분이 반복되는 동안 계속해서 개수를 헤아리게 된다.
		// 데이터 개수가 몇개 안될때는 큰 문제가 없지만 데이터 개수가 많아지면 그만큼 성능이 떨어지게 된다.

		// list 전체를 for()반복문을 사용하여 순회할때는 먼저 size() 값을 int형 변수에 담아놓고 시작하자
		int nSize = studentList.size();

		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t주소");
		System.out.println("-".repeat(80));

		for (int i = 0; i < nSize; i++) {

			StudentVO vo = studentList.get(i);

			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.print(vo.getDept() + "\t");
			System.out.print(vo.getAddress() + "\n");
		}
		System.out.println("-".repeat(80));

	}

}
