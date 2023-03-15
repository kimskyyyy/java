package dbConcept04.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import dbConcept04.DTO.MemberDTO;

public class MemberDAO implements IMemberDAO{
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
	public Collection<MemberDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO selectEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(MemberDTO member) {
		PreparedStatement ps = null;
//		ResultSet rs = null;
		String sql = "INSERT INTO db_concept4 VALUES(?, ?, ?)";
		
		try {			
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getEmail());
			ps.setString(2, member.getPassword());
			ps.setString(3, member.getName());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

	@Override
	public void update(MemberDTO member) {
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
		
	}

	@Override
	public void delete(String email) {
		String sql = "DELETE FROM db_concept4 WHERE email = ?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	

}
