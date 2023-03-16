package dbConcept05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO implements IBoardDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public BoardDAO() {
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
		// TODO Auto-generated method stub
		return 0;
	}

	// 1. 게시글 등록
	@Override
	public void insert(BoardDTO board) {
		PreparedStatement ps = null;
		String sql = "SELECT nvl(max(num), 0)+1 as max_num FROM db_concept5";
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				board.setNum(rs.getInt("max_num"));
			} else {
				board.setNum(0);
			}
			sql = "INSERT INTO db_concept5 VALUES(?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, board.getNum());
			ps.setString(2, board.getSubject());
			ps.setString(3, board.getContent());
			ps.setString(4, board.getWriter());
			ps.setString(5, board.getWriteTime());
			ps.setInt(6, board.getHit());			

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	// 2. 게시글 번호 검색
	@Override
	public BoardDTO selectNum(int num) {
		String sql = "SELECT * FROM db_concept5 WHERE num=?";

		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			if (rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setNum(num);
				board.setSubject(rs.getString("subject"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setWriteTime(rs.getString("write_time"));
				board.setHit(rs.getInt("hit"));
				
				return board;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 게시글 조회수 업데이트
	@Override
	public void updateHit(int num) {
		String sql = "SELECT * FROM db_concept5 WHERE num=?";
		int updateHit;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			if (rs.next()) {		
				updateHit = (int)rs.getInt("hit") +1;
				sql = "UPDATE db_concept5 SET hit=? WHERE num=?";
				try {
					ps = con.prepareStatement(sql);
					ps.setInt(1, updateHit);
					ps.setInt(2, num);
					
					ps.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}				
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	

		
	}

	
	// 3. 게시글 제목 검색
	@Override
	public ArrayList<BoardDTO> selectSubject(String subject) {
		String sql = "SELECT * FROM db_concept5 WHERE subject like ? ORDER BY num DESC";
		ArrayList<BoardDTO> boards = new ArrayList<>();
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, "%" + subject + "%"); // 와일드카드 사용
			rs = ps.executeQuery();
			while (rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setNum(rs.getInt("num"));
				board.setSubject(rs.getString("subject"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setWriteTime(rs.getString("write_time"));
				board.setHit(rs.getInt("hit"));
				
				boards.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boards;
	}
	

	// 5. 게시글 삭제
	@Override
	public int delete(int num) {
		String sql = "DELETE FROM db_concept5 WHERE num=?";
		int result = 0;		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,num);
			
			ps.executeUpdate();
			result = 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	
	// 4. 게시글 모두 보기
	@Override
	public ArrayList<BoardDTO> selectAll() {
		String sql = "SELECT * FROM db_concept5 ORDER BY num DESC";
		ArrayList<BoardDTO> boards = new ArrayList<>();
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setNum(rs.getInt("num"));
				board.setSubject(rs.getString("subject"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setWriteTime(rs.getString("write_time"));
				board.setHit(rs.getInt("hit"));
				
				boards.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boards;
	}
	

	// 6. 게시글 수정
	@Override
	public void update(BoardDTO boardDTO) {
		String sql = "UPDATE db_concept5 SET subject=?, content=? WHERE num=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, boardDTO.getSubject());
			ps.setString(2, boardDTO.getContent());
			ps.setInt(3, boardDTO.getNum());
						
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
