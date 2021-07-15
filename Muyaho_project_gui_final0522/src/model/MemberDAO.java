package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {
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
	public boolean join(MemberDTO dto) {
		boolean result = false;
		// 회원가입시 입력한 정보를 DB에 저장
		conn();
		String sql = "insert into members values(?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, dto.getMemberNum());
			psmt.setString(2, dto.getName());
			psmt.setInt(3, 0);
			// executeQuery - select 문에서만 사용
			// executeUpdate - 그 외 모두(ex.delete,insert,update...)
			int cnt = psmt.executeUpdate();
			System.out.println(cnt);
			if(cnt >0) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	return result;	
	}
}
