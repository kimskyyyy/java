package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public RegDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "douzone";
		String password = "oracle";

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 회원 가입
	public void regProc(RegDTO regDto) {
		String sql = "INSERT INTO javaFx VALUES(?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			
			ps.setString(1, regDto.getName());
			ps.setString(2, regDto.getId());
			ps.setString(3, regDto.getPw());
			ps.setString(4, regDto.getGender());
			ps.setString(5, regDto.getAge());
			ps.setString(6, regDto.getHobbys());
			
			ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	
	// 아이디 조회
	public boolean findId(String userId) {
		String sql = "SELECT * FROM javaFx WHERE userId=?";
		try {
			ps = con.prepareStatement(sql);			
			ps.setString(1, userId);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {	
				System.out.println(rs.getString("userId"));
				return true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();		
			
		}
		return false;		
	}
	
//	// 비밀번호 확인
//		public boolean checkPw(String userId, String userPw) {
//			String sql = "SELECT userPw FROM javaFx WHERE userId=?";
//			try {
//				ps = con.prepareStatement(sql);			
//				ps.setString(1, userId);
//				
//				rs = ps.executeQuery();
//				
//				if(rs.next()) {	
//					System.out.println(rs.getString("userPw"));
//					if(rs.getString("userPw").equals(userPw)) {
//						return true;
//					}
//				}
//				
//				
//			} catch (Exception e) {
//				e.printStackTrace();		
//				
//			}
//			return false;
//		}

}
