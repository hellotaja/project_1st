package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextArea;

public class Sort_cell {
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
	
	//매출내역 조회 함수 (메뉴별 정렬)
	public void view_cell(JTextArea textArea_bill) {
		conn();
		// 메뉴에서 값들 불러오기
		String sql = "select menu_id ,count ,day, price  from sales  order by menu_id ";
		try {
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				textArea_bill.append(rs.getInt("MENU_ID") + "\t"+
						rs.getString("DAY") + "\t" + rs.getInt("COUNT") 
				+ "\t" + rs.getInt("PRICE")+ "\t"+"\n");
				//break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
