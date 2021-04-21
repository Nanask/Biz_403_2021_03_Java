package com.callor.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.callor.db.service.DBContract;

public class OracleEx_01 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello 오라클");
		System.out.println("JdbcDriver" + DBContract.DB_INFO.JdbcDriver);
		System.out.println("URL" + DBContract.DB_INFO.URL);
		System.out.println("USER" + DBContract.DB_INFO.USER);
		System.out.println("PASSWORD" + DBContract.DB_INFO.PASSWORD);
		//이대로 사용한다면 콘솔에 그대로 아이디와 비밀번호가 표시되서 해킹될 위험이 있음
		//=>취약점
		//수업이기때문에 그냥 진행
		
		// JdbcDriver 실행
		Connection dbConn = null;
		try {
			Class.forName(DBContract.DB_INFO.JdbcDriver);
			
			// JDBC Driver를 통하여 Oracle Server에 접속해 달라
			// 접속이 성공하면 그 정보를 dbConn에 담아달라
			dbConn = DriverManager.getConnection(
					DBContract.DB_INFO.URL,
					DBContract.DB_INFO.USER,
					DBContract.DB_INFO.PASSWORD);
			System.out.println("Oracle 연결 성공");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("JDBC Driver 없음");
		}
		//오라클과 어플리케이션의 정보를 공유하게 하는것
		//내부적으로 문자열을 reader를 사용하여 읽는 것과 같으므로 try/catch를 사용
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//연결 완료!!
		PreparedStatement pStr = null;
		
		//sql값을 iolist에 넣어 불러온 후 출력한다.
		String sql = " SELECT * FROM tbl_iolist ";
		try {
			pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			
			while(result.next()) {
				System.out.println(result.getString(2));
			}
			result.close();
			dbConn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
