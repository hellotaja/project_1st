package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextArea;

import  GUI.Login_1;

public class Order {
//	Login_1 lg = new Login_1();
//	int membernum = lg.getInputnum();
	
	Connection conn = null;
	PreparedStatement psmt = null;

	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "muyaho";
		String db_pw = "muyaho";

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void close() {

		try {
			psmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public int searchrefreshPoint(int membernum) {
		int memberpoint =0;
		conn();
		// 메뉴에서 값들 불러오기
		String sql = "select point from members where MEMBER_NUM = (?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, membernum);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
			memberpoint = rs.getInt("POINT");	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}return memberpoint;
	}
	public void refreshPoint(int totalpoint, int membernum) {
		//System.out.println(membernum);
		
		int memberpoint = searchrefreshPoint(membernum);
		conn();
		// 메뉴에서 값들 불러오기
		String sql = "update members set point= (?) where MEMBER_NUM = (?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, memberpoint+totalpoint);
			psmt.setInt(2, membernum);
			
			int cnt = psmt.executeUpdate();
			if (cnt >0) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}//return memberpoint;
	}
	
}
