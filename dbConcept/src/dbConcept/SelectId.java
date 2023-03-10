package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectId {
	public static void main(String[] args) {
		// 아이디로 데이터 조회
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: "); String userId = sc.next();
		
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "douzone";
		String password = "oracle";
		String sql = "SELECT * FROM test WHERE id=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, id, password);
			ps = con.prepareStatement(sql);
			ps.setString(1,  userId);
			// 5. SELECT 명령문을 전달했다면 결과가 존재하기에 객체(ResultSet)로 받음.
			rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("아이디: " + rs.getString("id"));
				System.out.println("비밀번호: " + rs.getString("pw"));
				System.out.println("이름: " + rs.getString("name"));
				System.out.println("회원번호: " + rs.getInt("member_num"));
			} else {
				System.out.println("미등록 아이디 입니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(rs != null)
				rs.close();
			if(ps != null)
				ps.close();
			if(con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
