package dbConcept05A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDaoImpl implements IBoardDAO{
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public BoardDaoImpl() {
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
	public int selectMaxNum() {
		String sql = "SELECT nvl(max(num), 0)+1 FROM db_concept5";
		int maxNum = 0;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				maxNum = rs.getInt(1);
			}else {
				maxNum = 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return maxNum;
	}

	@Override
	public void insert(BoardDTO board) {
		String sql = "INSERT INTO db_concept5 VALUES(?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, board.getNum());
			ps.setString(2, board.getSubject());
			ps.setString(3, board.getContent());
			ps.setString(4, board.getWriter());
			ps.setString(5, board.getWriteTime());
			ps.setInt(6, board.getHit());
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public BoardDTO selectNum(int num) {
		String sql = "SELECT * FROM db_concept5 WHERE num = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			if(rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setNum(num);
				board.setSubject(rs.getString("subject"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setWriteTime(rs.getString("write_time"));
				board.setHit(rs.getInt("hit"));
				return board;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public void updateHit(int num) {
		String sql = "UPDATE db_concept5 SET hit=hit+1 WHERE num=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public ArrayList<BoardDTO> selectSubject(String subject) {
		String sql = "SELECT * FROM db_concept5 WHERE subject like ?";
		ArrayList<BoardDTO> boards = new ArrayList<>();
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, "%"+subject+"%");
			rs = ps.executeQuery();
			while(rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setNum(rs.getInt("num"));
				board.setSubject(rs.getString("subject"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setWriteTime(rs.getString("write_time"));
				board.setHit(rs.getInt("hit"));
				
				boards.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return boards;
	}
	@Override
	public ArrayList<BoardDTO> selectAll() {
		String sql = "SELECT * FROM db_concept5 ORDER BY num DESC";
		ArrayList<BoardDTO> boards = new ArrayList<>();
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setNum(rs.getInt("num"));
				board.setSubject(rs.getString("subject"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setWriteTime(rs.getString("write_time"));
				board.setHit(rs.getInt("hit"));
				
				boards.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return boards;
	}

	@Override
	public int delete(int num) {
		String sql = "DELETE FROM db_concept5 WHERE num=?";
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void update(BoardDTO board) {
		String sql = "UPDATE db_concept5 SET subject=?, content=? WHERE num=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(3, board.getNum());
			ps.setString(2, board.getContent());
			ps.setString(1, board.getSubject());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void disconnection() {
		try {
			if(rs != null)
				rs.close();
			if(ps != null)
				ps.close();
			if(con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}







