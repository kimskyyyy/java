package ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {
	String userId = "";
	String userPw = "";
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;	

	public LoginDAO() {
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
	
	// 비밀번호 확인
	public boolean checkPw(String userId, String userPw) {
		String sql = "SELECT userPw FROM javaFx WHERE userId=?";
		try {
			ps = con.prepareStatement(sql);			
			ps.setString(1, userId);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {	
				System.out.println(rs.getString("userPw"));
				if(rs.getString("userPw").equals(userPw)) {
					return true;
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();		
			
		}
		return false;
	}
	

	// 회원가입
	public void insert(String userId, String userPw, String name, String gender, String hobbys) {
		String sql = "INSERT INTO javaFx VALUES(?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			
			ps.setString(1, userId);
			ps.setString(2, userPw);
			ps.setString(3, name);
			ps.setString(4, gender);
			ps.setString(5, hobbys);
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void disconnection() {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(con != null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String loginProc(String id) {
		// TODO Auto-generated method stub
		return null;
	}



}
