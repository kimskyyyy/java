package dbConcept02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDaoImpl {
	private Connection con = null; // 자동으로 null되서 = null 할 필요X
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "douzone";
	String password = "oracle";	
			
	String sql = "";
	
	PreparedStatement ps = null;
	ResultSet rs = null;

	int  result;
	
	//
	private ArrayList<MemberDTO> members;
	
	public MemberDaoImpl() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 회원 등록
	public void insert(MemberDTO member) {
//		members.add(member);
		sql = "INSERT INTO db_concept VALEUS(?, ?, ?, number_num.nextval)";
//		sql = "INSERT INTO db_concept VALEUS(?, ?, ?, test_seq.nextval)";
		try {
			// 아직 DB로 명령문을 전달하지 않음
			ps = con.prepareStatement(sql);
						
			ps.setString(1, member.getEmail());
			ps.setString(2, member.getName());
			ps.setString(3, member.getMobile());
			
			// DB로 명령문 전달
			ps.executeUpdate(); // INSERT, UPDATE, DELETE
			// SELECT -> ps.executeQuery(); 결과값 반환
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	public int findIndexByEmail(String email) {
		sql = "SELECT * FROM db_concept WHERE email=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			// 이메일 존재하면
			if(rs.next()) {
				result = rs.getInt("number_num");				
			}else {
				result = -1;
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public MemberDTO selectEmail(int num) {
		sql = "SELECT * FROM db_concept WHERE id=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			// 이메일 존재하면
			if(rs.next()) {
				result = rs.getInt("num");		
				System.out.println("아이디: " + rs.getString("id"));
				System.out.println("비밀번호: " + rs.getString("pw"));
				System.out.println("이름: " + rs.getString("name"));
				System.out.println("회원번호: " + rs.getInt("member_num"));
			}else {
				System.out.println("id가 존재하지 않습니다.");
				result = -1;
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return members.get(num);
	}
	

	public void delete(int num) {
		sql = "DELETE FROM db_concept WHERE id=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.execute();
			System.out.println(id + "의 정보가 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		members.remove(num);
	}
	

	public void selectAll() {
		sql =  "Select * FROM db_concept";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while(rs.next()) {
				System.out.println("아이디: " + rs.getString("id"));
				System.out.println("비밀번호: " + rs.getString("pw"));
				System.out.println("이름: " +  rs.getString("name"));
				System.out.println("회원번호: " + rs.getInt("member_num"));
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(int num, String name, String mobile) {
		sql = "UPDATE db_concept SET pw=? WHERE id=?";

		try {
			ps.setString(1, id);
			ps.execute();
			System.out.println(id + "의 정보가 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}










