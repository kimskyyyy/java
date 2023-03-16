package dbConcept05;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BoardService implements IBoardService{
	BoardDTO board = null;
	BoardDAO boardDAO = new BoardDAO();	

	// 1. 게시글 등록
	@Override
	public void insert(BoardDTO boardDTO) {
		board = new BoardDTO();
		board.setSubject(boardDTO.getSubject());
		board.setContent(boardDTO.getContent());
		board.setWriter(boardDTO.getWriter());
		
		Date date = new Date(); // 날짜 구하기		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 형식
		String regDate = sdf.format(date);
		board.setWriteTime(regDate);;
		
		// 게시글 조회수는 db에서 default로 0 주거나 NVL써서 조회할 때 null인 경우에만 0으로 반환하고 그 외에는 ++하면 될 듯
		// 그러면  insert 할 때 컬럼명 다 써줘야 하는데 번거로움... -> 그냥 0으로 넣어주기!
		
		board.setHit(0);
		
		boardDAO.insert(board);
		System.out.println("게시글 등록 완료");		
	}

	// 2. 게시글 번호 검색
	@Override
	public void selectNum(int n) {
		board = boardDAO.selectNum(n);
		if(board == null) {
			System.out.println("존재하지 않는 게시글 번호입니다.");
		}else {
			
			boardDAO.updateHit(n); // 조회수 업데이트
			
			System.out.println("번호 : " + board.getNum());
			System.out.println("제목: " + board.getSubject());
			System.out.println("내용: " + board.getContent());
			System.out.println("작성자 : " + board.getWriter());
			System.out.println("작성일 : " + board.getWriteTime());
			System.out.println("조회수 : " + board.getHit());

		}
		
	}

	// 3. 게시글 제목 검색
	@Override
	public void selectSubject(String subject) {
		ArrayList<BoardDTO> boards = boardDAO.selectSubject(subject);
		if(boards.isEmpty() == false) {
			System.out.println("번호\t제목\t내용\t작성자\t작성일\t\t조회수");
			for(BoardDTO b : boards) {
				System.out.print(b.getNum() + "\t");
				System.out.print(b.getSubject() + "\t");
				System.out.print(b.getContent() + "\t");
				System.out.print(b.getWriter() + "\t");
				System.out.print(b.getWriteTime() + "\t");
				System.out.print(b.getHit() + "\t");
				System.out.println();
			}
		}else {
			System.out.println("게시글이 존재하지 않습니다.");
		}
		System.out.println();
		
	}

	// 4. 게시글 모두 보기
	@Override
	public void selectAll() {
		ArrayList<BoardDTO> boards = boardDAO.selectAll();
		if(boards.isEmpty() == false) {
			System.out.println("번호\t제목\t내용\t작성자\t작성일\t\t조회수");
			for(BoardDTO b : boards) {
				System.out.print(b.getNum() + "\t");
				System.out.print(b.getSubject() + "\t");
				System.out.print(b.getContent() + "\t");
				System.out.print(b.getWriter() + "\t");				
				System.out.print(b.getWriteTime() + "\t");
				System.out.print(b.getHit() + "\t");
				System.out.println();
			}
		}else {
			System.out.println("게시글이 존재하지 않습니다.");
		}
		System.out.println();
		
	}

	
	// 5. 게시글 삭제
	@Override
	public void delete(int n) {
		board = boardDAO.selectNum(n);
		if(board == null) {
			System.out.println(n + "번 게시글은 존재하지 않습니다.");
		} else {
			if(boardDAO.delete(n) == 1) {
			System.out.println("게시글이 삭제되었습니다.");
			} else {
				System.out.println("게시글 삭제 실패");
			}
		}
		
		System.out.println();
		
	}

	// 6. 게시글 수정
	@Override
	public void update(int n, String subject, String content) {
		board = boardDAO.selectNum(n);
		if(board == null) {
			System.out.println("존재하지않는 게시글입니다.");
		}else {
			board = new BoardDTO();
			board.setNum(n);
			board.setSubject(subject);
			board.setContent(content);
			
			boardDAO.update(board);
			System.out.println("게시글이 수정되었습니다.");
		}
		
	}

	public void disconnection() {
		boardDAO.disconnection();
		
	}

}
