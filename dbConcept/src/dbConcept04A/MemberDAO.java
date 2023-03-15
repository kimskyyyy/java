package dbConcept04A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

//import dbConcept04A.MemberDTO;

public class MemberDAO implements IMemberDAO {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public MemberDAO() {
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

	@Override
	public MemberDTO selectEmail(String email) {
		String sql = "SELECT * FROM db_concept4 WHERE email=?";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if (rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setEmail(email);
				member.setName(rs.getString("name"));
				member.setPassword(rs.getString("password"));
				member.setRegisterDate(rs.getString("register_date"));
				return member;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insert(MemberDTO member) {
		String sql = "INSERT INTO db_concept4 VALUES(?,?,?,?)";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getEmail());
			ps.setString(2, member.getName());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getRegisterDate());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Collection<MemberDTO> selectAll() {
		String sql = "SELECT * FROM db_concept4";
		ArrayList<MemberDTO> members = new ArrayList<>();
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setEmail(rs.getString("email"));
				member.setName(rs.getString("name"));
				member.setPassword(rs.getString("password"));
				member.setRegisterDate(rs.getString("register_date"));
				
				members.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return members;
	}

	@Override
	public void update(MemberDTO member) {
		String sql = "UPDATE db_concept4 SET password=? WHERE email=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getPassword());
			ps.setString(2, member.getEmail());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String email) {
		String sql = "DELETE FROM db_concept4 WHERE email=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,email);
			
			ps.executeUpdate();
		} catch (SQLException e) {
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
}




















