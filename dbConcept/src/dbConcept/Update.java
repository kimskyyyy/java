package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		// 아이디를 입력 받아 비밀번호를 수정

		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "douzone";
		String password = "oracle";
		
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
		String userId = sc.next();
		System.out.print("현재 비밀번호: ");
		String currentPassword = sc.next();
		System.out.print("변경할 비밀번호: ");
		String newPassword = sc.next();
		
		String sql = "SELECT * FROM test WHERE id=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			rs = ps.executeQuery();
			// 아이디 존재하면
			if(rs.next()) {
				if(rs.getString("pw").equals(currentPassword)) {
					sql = "UPDATE test SET pw=? WHERE id =?";
					ps = con.prepareStatement(sql);
					ps.setString(1, newPassword);
					ps.setString(2, userId);
					ps.executeUpdate();	
					System.out.println("비밀번호가 수정되었습니다.");
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
			}else {
				System.out.println("id가 존재하지 않습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
