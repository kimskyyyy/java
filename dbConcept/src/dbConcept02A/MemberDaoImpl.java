package dbConcept02A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDaoImpl implements IMemberDAO{
	private Connection con;
	
	public MemberDaoImpl() {
		String user = "douzone";
		String password = "oracle";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void exit() {
		try {
			if(con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void insert(MemberDTO member) {
		PreparedStatement ps = null;
		String sql = "SELECT nvl(max(num), 0)+1 as max_num FROM db_concept";
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				member.setNum(rs.getInt(1));//rs.getInt("max_num");
			}else {
				member.setNum(0);
			}
			sql = "INSERT INTO db_concept VALUES(?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, member.getNum());
			ps.setString(2, member.getEmail());
			ps.setString(3, member.getName());
			ps.setString(4, member.getMobile());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public MemberDTO selectEmail(String email) {
		PreparedStatement ps = null;
		String sql = "SELECT * FROM db_concept WHERE email=?";
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setNum(rs.getInt("num"));
				member.setEmail(rs.getString("email"));
				member.setName(rs.getString("name"));
				member.setMobile(rs.getString("mobile"));
				return member;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<MemberDTO> selectAll() {
		PreparedStatement ps = null;
		String sql = "SELECT * FROM db_concept";
		ResultSet rs = null;
		ArrayList<MemberDTO> members = new ArrayList<MemberDTO>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setNum(rs.getInt("num"));
				member.setEmail(rs.getString("email"));
				member.setName(rs.getString("name"));
				member.setMobile(rs.getString("mobile"));
				members.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return members;
	}
	
	@Override
	public int delete(String email) {
		String sql = "DELETE FROM db_concept WHERE email = ?";
		PreparedStatement ps = null;
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	@Override
	public int update(String email, String name, String mobile) {
		String sql = "UPDATE db_concept SET name = ?, mobile = ? WHERE email = ?";
		PreparedStatement ps = null;
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(3, email);
			ps.setString(1, name);
			ps.setString(2, mobile);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	
	
	
}










