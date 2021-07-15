package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Recommand_set {
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
	//commit
	public void commit() {
		conn();
		String sql = "commit";
		try {
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//주문서 메뉴번호 리스트에 저장
	public ArrayList<Integer> getmenunum() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		conn();
		String sql = "select menu_num from orders";
		try {
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
			arr.add(rs.getInt("MENU_NUM"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}return arr;
	}
	// 1번메뉴 20번 메뉴 삭제하고 세트 1저장
	public void rec_set1() {
		conn();
		String sql = "delete from orders where menu_num = 1";
		try {
			psmt = conn.prepareStatement(sql);
			int rs = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn();
		 sql = "delete from orders where menu_num = 20";
		try {
			psmt = conn.prepareStatement(sql);
			int rs = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn();
		 sql = "insert into orders values(?,?,?,?,?)";
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
	// 8번 17번 메뉴 삭제하고 2번 저장
	public void rec_set2() {
		conn();
		String sql = "delete from orders where menu_num = 8";
		try {
			psmt = conn.prepareStatement(sql);
			int rs = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn();
		 sql = "delete from orders where menu_num = 17";
		try {
			psmt = conn.prepareStatement(sql);
			int rs = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn();
		 sql = "insert into orders values(?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "에스프레소스무디");
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
		}
		
	}
	//14번 18번 삭제하고 세트3 추가
	public void rec_set3() {
		conn();
		String sql = "delete from orders where menu_num = 14";
		try {
			psmt = conn.prepareStatement(sql);
			int rs = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn();
		 sql = "delete from orders where menu_num = 18";
		try {
			psmt = conn.prepareStatement(sql);
			int rs = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn();
		 sql = "insert into orders values(?,?,?,?,?)";
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
	public int change_set() {
		int cnt =0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr = getmenunum();
		for(int i =0;i<arr.size();i++) {
			for(int j =0;j<arr.size();j++) {
				System.out.println(i+j);
				int menu1 = arr.get(i);
				int menu2 = arr.get(j);
				if(menu1 ==1 && menu2 ==20) {
					rec_set1();
					cnt =1;
					//break;
				}
				else if(menu1 ==8 && menu2 ==17) {
					rec_set2();
					cnt =1;
					//break;
				}
				else if(menu1 ==14 && menu2 ==18) {
					rec_set3();
					cnt =1;
					//break;
				}
			}
		}return cnt;
	}
}
