package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		// 아이디와 비밀번호를 입력받아 아이디에 맞는 데이터 삭제
		
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
		System.out.print("아이디: ");
		String id = sc.next();
		System.out.print("비밀번호: ");
		String pw = sc.next();
		
		String sql = "SELECT pw FROM test WHERE id=?";		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				if(rs.getString("pw").equals(pw)) {
					sql = "DELETE FROM test WHERE id=?";
					ps = con.prepareStatement(sql);
					ps.setString(1, id);
					ps.execute();
					System.out.println(id + "의 정보가 삭제되었습니다.");
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
