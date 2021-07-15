package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextArea;

public class Input_Bill {
	String name =null;
	int price = 0;
	int point = 0;
	int menu_num =0;
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
	
	public void inputbill(int menunum) {

		conn();
		// 메뉴에서 값들 불러오기
		String sql = "select * from menu where MENUNUM = (?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, menunum);
		
			// executeQuery - select 문에서만 사용
			// executeUpdate - 그 외 모두(ex.delete,insert,update...)
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				
			name = rs.getString("NAME");
			price = rs.getInt("PRICE");
			point = rs.getInt("POINT");
			menu_num =rs.getInt("MENUNUM");
			}
//			 System.out.println(name);
//			 System.out.println(price);
			 System.out.println(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 주문서에 집어넣기
		 sql = "insert into orders values(?,?,?,?,?)";
		 try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, name);
				psmt.setInt(2, 1);
				psmt.setInt(3, price);
				psmt.setInt(4, point);
				psmt.setInt(5, menu_num);
				
				// executeQuery - select 문에서만 사용
				// executeUpdate - 그 외 모두(ex.delete,insert,update...)
				int cnt = psmt.executeUpdate();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		finally {
			close();
		}
		 
	}
		public void showbill(JTextArea textArea_bill) {
			conn();
			String sql = "select * from orders";
			try {
				psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
				while(rs.next()) {
					textArea_bill.append(rs.getString("MENU_ID") + "\t" + rs.getInt("PRICE") + "\t" + rs.getInt("POINT")
	                        + "\t"+"\n");
					//break;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void showsetbill(JTextArea textArea_bill) {
			conn();
			String sql = "select * from orders";
			try {
				psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
				while(rs.next()) {
					textArea_bill.append(rs.getString("MENU_ID") + "\t" + rs.getInt("PRICE") + "\t" + rs.getInt("POINT")
	                        + "\t"+"\n");
					break;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void totPrice(JTextArea textArea_bill) {
			conn();
			// 메뉴에서 값들 불러오기
			String sql = "select sum(price) as sumprice from orders";
			try {
				psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
				if(rs.next()) {
					textArea_bill.append("총 금액 : "+ rs.getInt("SUMPRICE")+"\n");}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public int totPointnum() {
			int totPoint =0;
			conn();
			// 메뉴에서 값들 불러오기
			String sql = "select sum(point) as sumprice from orders";
			try {
				psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
				if(rs.next()) {
					totPoint = rs.getInt("SUMPRICE");}
			} catch (SQLException e) {
				e.printStackTrace();
			} return totPoint;
		}
		public void totPoint(JTextArea textArea_bill) {
		
			conn();
			// 메뉴에서 값들 불러오기
			String sql = "select sum(point) as sumprice from orders";
			try {
				psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
				if(rs.next()) {
					textArea_bill.append("총 포인트 : "+ rs.getInt("SUMPRICE"));
					}
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}


	

}
