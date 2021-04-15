package com.callor.score.service.Impl; //내가만든 클래스

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService{
	
	List<StudentVO> studentList;
	
	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadStudent() {
		
		String studentfile = "src/com/callor/score/student.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(studentfile);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				
				String students[] = reader.split(":");
				
				StudentVO vo = new StudentVO();
				
				vo.setNum(students[0]);
				vo.setName(students[1]);
				vo.setGrade(students[2]);
				vo.setDept(students[4]);
				vo.setAddress(students[5]);
				
				System.out.println(vo.toString());
				studentList.add(vo);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽는 동안 문제가 발생했습니다.");
		}
		
		
	}

	@Override
	public StudentVO getStudent(String num) {
		
		int nSize = studentList.size();
		
		for(int i = 0 ; i < nSize ; i++) {
			
			StudentVO vo = studentList.get(i);
			
			if(num == vo.getNum()) {
				return vo;
			}else if(num != vo.getNum()) {
				System.out.println("입력되는 값이 없습니다.");
				break;
			}
		}
		return null;
	}

	@Override
	public void printStudent() {
		
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t주소");
		System.out.println("-".repeat(80));
		
		int nSize = studentList.size();
		
		for(int i = 0 ; i < nSize ; i++) {
			
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
