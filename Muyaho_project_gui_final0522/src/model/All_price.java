package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class All_price {
	
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
	
	/*
	public void deleteprice() {
		conn();
		
		String sql = "delete * from orders";
		try {
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				textArea.append(rs.getString("MENU_ID") + "\t"+
				rs.getInt("COUNT") + "\t" + rs.getInt("PRICE")+ "\t"+ rs.getInt("POINT")+ "\t"+ rs.getInt("MENU_NUM")+ "\t"+"\n");
				//break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	*/
	public int memberPoint(int inputnum) {
		int point = 0;
		//JLabel lblNewLabel_1
		conn();
		
		String sql = "select * from members where member_num =(?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, inputnum);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
			 point = rs.getInt("POINT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(point);
		}return point;
	}
	
	public void allprice(JTextArea textArea) {
		//JLabel lblNewLabel_1
		conn();
		
		String sql = "select * from sales";
		try {
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				textArea.append(rs.getString("MENU_ID") + "\t"+
				rs.getInt("PRICE") + "\t" + rs.getString("day")+ "\t"+ rs.getInt("COUNT")+ "\t"+"\n");
				//break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			conn();
		
		 sql = "delete orders";
		try {
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
