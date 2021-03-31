package com.callor.classes;

//simpleDateFormat
//date
//현재 컴퓨터의 시간을 문자열로 나타내는경우는 좋으나 특정날짜를 지정하거나 할때는 별로 좋지않음

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_02 {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeForm = new SimpleDateFormat("hh:mm:ss");
		
		String curDate = dateForm.format(date);
		String curTime = timeForm.format(date);
		
		System.out.printf("오늘날짜 : %s, 현재시각 : %s" , curDate, curTime);
		
		
		
		
	}

}
