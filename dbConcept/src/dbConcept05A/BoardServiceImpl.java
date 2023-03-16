package dbConcept05A;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BoardServiceImpl implements IBoardService{
	private BoardDaoImpl boardDao;
	
	public BoardServiceImpl() {
		boardDao = new BoardDaoImpl();
	}
	
	@Override
	public void insert(BoardDTO board) {
		
		if(board.getSubject() == null || board.getSubject().isEmpty()) {
			System.out.println("제목은 필수 항목입니다. 입력하세요.");
			return;
		}
		
		board.setHit(0);
		board.setNum(boardDao.selectMaxNum());
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		board.setWriteTime(sdf.format(date));
		
		boardDao.insert(board);
		
	}

	@Override
	public void selectNum(String n) {
		int num = 0;
		try {
			num = Integer.parseInt(n);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		BoardDTO board = boardDao.selectNum(num);
		if(board != null) {
			boardDao.updateHit(num);
			
			System.out.println("번호\t제목\t내용\t작성자\t작성일\t조회수");
			System.out.println(board.getNum() + "\t" + board.getSubject() + "\t"
					+ board.getContent() +"\t" +board.getWriter() + "\t"
					+ board.getWriteTime() + "\t" + (board.getHit()+1));
			
		
		}else {
			System.out.println("존재하지 않은 게시글입니다.");
		}
		
	}

	@Override
	public void selectSubject(String subject) {
		if(subject== null || subject == "") {
			System.out.println("필수 항목입니다. 입력하세요.");
			return;
		}
		
		ArrayList<BoardDTO> boards = boardDao.selectSubject(subject);
		
		if(boards.isEmpty() == false) {
			System.out.println("번호\t제목\t내용\t작성자\t작성일\t조회수");
			for(BoardDTO board : boards) {
				System.out.println(board.getNum() + "\t" + board.getSubject() + "\t"
						+ board.getContent() +"\t" +board.getWriter() + "\t"
						+ board.getWriteTime() + "\t" + board.getHit());
			}
		}else {
			System.out.println("게시글을 등록 후 이용하세요.");
		}
	}

	@Override
	public void selectAll() {
		ArrayList<BoardDTO> boards = boardDao.selectAll();
		if(boards.isEmpty() == false) {
			System.out.println("번호\t제목\t내용\t작성자\t작성일\t조회수");
			for(BoardDTO board : boards) {
				System.out.println(board.getNum() + "\t" + board.getSubject() + "\t"
						+ board.getContent() +"\t" +board.getWriter() + "\t"
						+ board.getWriteTime() + "\t" + board.getHit());
			}
		}else {
			System.out.println("게시글을 등록 후 이용하세요.");
		}
	}

	@Override
	public void delete(String n) {
		int num = 0;
		try {
			num = Integer.parseInt(n);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		int result = boardDao.delete(num);
		if(result == 1) {
			System.out.println("게시글 정보가 삭제되었습니다.");
		}else {
			System.out.println("관리자에게 문의하세요. 또는 잠시 후에 다시 시도하세요.");
		}
	}

	@Override
	public void update(String n, String subject, String content) {
		int num = 0;
		try {
			num = Integer.parseInt(n);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		BoardDTO board = boardDao.selectNum(num);
		if(board != null) {
			board.setNum(num);
			board.setSubject(subject);
			board.setContent(content);
			boardDao.update(board);
			System.out.println("게시글이 수정되었습니다.");
		}else {
			System.out.println("미등록된 정보입니다.");
		}
	}
	
	public void disconnection() {
		boardDao.disconnection();
	}

}








