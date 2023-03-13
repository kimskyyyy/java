package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateA {
	public static void main(String[] args) {
		// 아이디를 입력 받아 비밀번호를 수정
		
		Connection con = null;
		String user = "douzone";
		String password = "oracle";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : "); String id = sc.next();
		System.out.print("현재 비밀번호 : "); String currentPw = sc.next();
		System.out.print("변경 비밀번호 : "); String changePw = sc.next();
		String sql = "SELECT pw FROM test WHERE id=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				if(rs.getString("pw").equals(currentPw)) {
					sql = "UPDATE test SET pw=? WHERE id=?";
					ps = con.prepareStatement(sql);
					ps.setString(1, changePw);
					ps.setString(2, id);
					ps.executeUpdate();
					System.out.println("비밀번호가 수정되었습니다.");
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
			}else {
				System.out.println("미등록 정보입니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(rs != null)
				rs.close();
			if(ps != null)
				ps.close();
			if(con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

