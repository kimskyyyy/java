package dbConcept03.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbConcept03.dto.MemberDTO;

public class MemberDAO implements IDao {
	private Connection con;

	public MemberDAO() {
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

	@Override
	public MemberDTO selectId(String id) {
		PreparedStatement ps = null;
		String sql = "SELECT * FROM db_concept3 WHERE id=?";
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setNum(rs.getInt("num"));
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				member.setEmail(rs.getString("email"));
				return member;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 회원 정보 입력
	@Override
	public void insertMember(MemberDTO member) {
		PreparedStatement ps = null;
		String sql = "SELECT nvl(max(num), 0)+1 as max_num FROM db_concept3";
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				member.setNum(rs.getInt("max_num"));// rs.getInt("max_num");
			} else {
				member.setNum(0);
			}
			sql = "INSERT INTO db_concept3 VALUES(?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, member.getNum());
			ps.setString(2, member.getId());
			ps.setString(3, member.getPw());
			ps.setString(4, member.getName());
			ps.setString(5, member.getEmail());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberDTO> selectAll() {
		PreparedStatement ps = null;
		String sql = "SELECT * FROM db_concept3 ORDER BY num";
		ResultSet rs = null;
		ArrayList<MemberDTO> members = new ArrayList<MemberDTO>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setNum(rs.getInt("num"));
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				member.setEmail(rs.getString("email"));

				members.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return members;

	}

	@Override
	public int updateMember(MemberDTO member) {
		String sql = "UPDATE db_concept3 SET pw = ?, name = ?, email = ? WHERE id = ?";
		PreparedStatement ps = null;
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getPw());
			ps.setString(2, member.getName());
			ps.setString(3, member.getEmail());
			ps.setString(4, member.getId());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public int deleteMember(String id) {
		String sql = "DELETE FROM db_concept3 WHERE id = ?";
		PreparedStatement ps = null;
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public void exit() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
