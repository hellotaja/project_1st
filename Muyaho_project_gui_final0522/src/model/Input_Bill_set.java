package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Input_Bill_set {
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
	
	public void inputset1() {
		conn();
		 String sql = "insert into orders values(?,?,?,?,?)";
		 try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, "아메리카노");
				psmt.setInt(2, 1);
				psmt.setInt(3, 3600);
				psmt.setInt(4, 360);
				psmt.setInt(5, 1);
				int rs = psmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		 conn();
		 sql = "insert into orders values(?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "치즈케이크");
			psmt.setInt(2, 1);
			psmt.setInt(3, 5400);
			psmt.setInt(4, 540);
			psmt.setInt(5, 20);
			int rs = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void inputset2() {
		conn();
	 String sql = "insert into orders values(?,?,?,?,?)";
	try {
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, "에쏘스무디");
		psmt.setInt(2, 1);
		psmt.setInt(3, 4500);
		psmt.setInt(4, 450);
		psmt.setInt(5, 1);
		int rs = psmt.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	}
	conn();
	 sql = "insert into orders values(?,?,?,?,?)";
	try {
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, "스콘");
		psmt.setInt(2, 1);
		psmt.setInt(3, 5400);
		psmt.setInt(4, 540);
		psmt.setInt(5, 20);
		int rs = psmt.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	}}
	public void inputset3() {
		conn();
	 String sql = "insert into orders values(?,?,?,?,?)";
	try {
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, "얼그레이");
		psmt.setInt(2, 1);
		psmt.setInt(3, 4050);
		psmt.setInt(4, 405);
		psmt.setInt(5, 1);
		int rs = psmt.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	}
	conn();
	 sql = "insert into orders values(?,?,?,?,?)";
	try {
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, "카스테라");
		psmt.setInt(2, 1);
		psmt.setInt(3, 5400);
		psmt.setInt(4, 540);
		psmt.setInt(5, 20);
		int rs = psmt.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
}
