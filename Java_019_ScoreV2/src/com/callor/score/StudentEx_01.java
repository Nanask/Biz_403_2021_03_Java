package com.callor.score;

import com.callor.score.service.StudentService;
import com.callor.score.service.Impl.StudentServiceImplV1;

public class StudentEx_01 {
	
	public static void main(String[] args) {
		//기본값(생성자에 만들어진 파일)으로 설정된 파일을 사용하여 객체 생성 진행
		StudentService ssV1 = new StudentServiceImplV1();
		
		ssV1.loadStudent();
		ssV1.printStudent();
		
	}

}
