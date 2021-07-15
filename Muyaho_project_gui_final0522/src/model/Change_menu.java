package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextArea;

public class Change_menu {

	String name = null;
	int re_num = 0;
	int price = 0;
	int point = 0;
	int menunum = 0;

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

	public void inputnew(int renum, int menunum) {

		conn();
		// �� ���� �� DB���� ��������
		// ���� recommendmenu ���̺��� ����

		String sql = "delete from recommendmenu where re_num = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, renum);

			// executeQuery - select �������� ���
			// executeUpdate - �� �� ���(ex.delete,insert,update...)
			int cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// menu ���̺��� ������ �� ����
		sql = "select * from menu where menunum = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, menunum);

			// executeQuery - select �������� ���
			// executeUpdate - �� �� ���(ex.delete,insert,update...)
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {

				name = rs.getString("NAME");
				price = rs.getInt("PRICE");
				re_num = rs.getInt("MENUNUM");
			}
			System.out.println(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// menu���� ������ �� recommendmenu ���̺� �� �ֱ� re_num, name, price, main_num
		sql = "insert into recommendmenu select menunum, name, price from menu where menunum = ?";
		try {
			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, 1);
			psmt.setInt(1, menunum);
			// executeQuery - select �������� ���
			// executeUpdate - �� �� ���(ex.delete,insert,update...)
			int cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

}
