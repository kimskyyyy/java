package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectAll {

	public static void main(String[] args) {
		// 테이블의 모든 데이터 출력하기
		
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "douzone";
		String password = "oracle";
		String sql = "Select * FROM test";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, id, password);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
//			if(rs.next()) {
//				System.out.println("아이디: " + rs.getString("id"));
//				System.out.println("비밀번호: " + rs.getShort("pw"));
//				System.out.println("이름: " +  rs.getString("name"));
//				System.out.println("회원번호: " + rs.getInt("member_num"));
//			}
			while(rs.next()) {
				System.out.println("아이디: " + rs.getString("id"));
				System.out.println("비밀번호: " + rs.getString("pw"));
				System.out.println("이름: " +  rs.getString("name"));
				System.out.println("회원번호: " + rs.getInt("member_num"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(rs != null)
				rs.close();
			if(ps != null)
				ps.close();
			if(con !=null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
