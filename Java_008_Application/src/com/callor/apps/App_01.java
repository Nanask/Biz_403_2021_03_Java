package com.callor.apps;

import java.sql.Time;

import com.callor.apps.service.TimeServiceV1;

public class App_01 {
	
	public static void main(String[] args) {
		
		TimeServiceV1 tsV1= new TimeServiceV1();
		
		tsV1.makeTimes();
		tsV1.printTimes();
				
	}

}
