package com.callor.classes;

//setter과 getter

import com.callor.model.AddressVO;

public class AddrEx_01 {
	
	public static void main(String[] args) {
		
		AddressVO aVO = new AddressVO();
		
		aVO.setName("홍길동");
		aVO.setAddr("서울식");
		aVO.setTel("010-111-111");
		aVO.setAge(200);
		
		System.out.println(aVO.getName() + "의 나이는 ?" + aVO.getAge());
		
	}

}
