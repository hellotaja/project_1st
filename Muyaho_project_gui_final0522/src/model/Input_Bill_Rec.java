package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextArea;

public class Input_Bill_Rec {

	String name = null;
	int price = 0;
	int point = 0;
	int re_num = 0;
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

	public void inputbill(int renum) {

		conn();
		// 메뉴에서 값들 불러오기
		String sql = "select * from recommendmenu where re_num = (?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, renum);

			// executeQuery - select 문에서만 사용
			// executeUpdate - 그 외 모두(ex.delete,insert,update...)
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {

				name = rs.getString("NAME");
				price = rs.getInt("PRICE");
				re_num = rs.getInt("RE_NUM");
			}
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
			psmt.setInt(4, 0);
			psmt.setInt(5, re_num);
			// executeQuery - select 문에서만 사용
			// executeUpdate - 그 외 모두(ex.delete,insert,update...)
			int cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public void showrec(JTextArea textArea_2) {
		conn();
		// 메뉴에서 값들 불러오기
		String sql = "select * from recommendmenu where re_num = 4";
		try {
			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, renum);

			// executeQuery - select 문에서만 사용
			// executeUpdate - 그 외 모두(ex.delete,insert,update...)
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {

				name = rs.getString("NAME");
				price = rs.getInt("PRICE");
				re_num = rs.getInt("RE_NUM");
			}
			System.out.println(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void show_1(JTextArea textArea_2) {
		int cnt = 1;
		conn();

		String sql = "select * from recommendmenu";
		try {
			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, 1);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				cnt ++;
				if(cnt == 2) {
				textArea_2.append(rs.getString("NAME") + "\t" + rs.getInt("PRICE") + "\t" + "\n");
				break;}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void show_2(JTextArea textArea_3) {
		int cnt = 1;
		conn();

		String sql = "select * from recommendmenu";
		try {
			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, 2);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				cnt ++;
				if(cnt == 3) {
				textArea_3.append(rs.getString("NAME") + "\t" + rs.getInt("PRICE") + "\t" + "\n");
				break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void show_3(JTextArea textArea_4) {
		int cnt = 1;
		conn();

		String sql = "select * from recommendmenu";
		try {
			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, 3);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				cnt ++;
				if(cnt == 4) {
				textArea_4.append(rs.getString("NAME") + "\t" + rs.getInt("PRICE") + "\t" + "\n");
				break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void showbill(JTextArea textArea) {
		conn();
		// 메뉴에서 값들 불러오기
		String sql = "select * from orders";
		try {
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				textArea.append(name + "\t" + price + "\t" + "\n");
				break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void totPrice(JTextArea textArea) {
		conn();
		// 메뉴에서 값들 불러오기
		String sql = "select sum(price) as sumprice from orders";
		try {
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {
				textArea.append("총 금액 : " + rs.getInt("SUMPRICE") + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void totPoint(JTextArea textArea) {
		conn();
		// 메뉴에서 값들 불러오기
		String sql = "select sum(point) as sumprice from orders";
		try {
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {
				textArea.append("총 포인트 : " + rs.getInt("SUMPRICE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
