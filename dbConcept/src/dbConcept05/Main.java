package dbConcept05;

import java.util.Scanner;

public class Main {
	private	static Scanner in = new Scanner(System.in);
	String subject = "", content = "", writer="";
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("1. 게시글 등록");
			System.out.println("2. 게시글 번호 검색"); // 글번호 사용
			System.out.println("3. 게시글 제목 검색"); // like 사용
			System.out.println("4. 게시글 모두 보기");
			System.out.println("5. 게시글 삭제");
			System.out.println("6. 게시글 수정");
			System.out.println("7. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			switch (select) {
			case 1:	insert(); break;
			case 2:	selectNum(); break;
			case 3:	selectSubject(); break;
			case 4:	selectAll(); break;
			case 5:	delete(); break;
			case 6: update(); break;
			case 7: disconnection();
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}
	}
	
	// 1. 게시글 등록
	private static void insert() {
		BoardService boardService = new BoardService();
		
		BoardDTO boardDTO = new BoardDTO();
		System.out.println("=== 게시글 등록 ===");
		System.out.print("제목: "); String subject = in.next();
		System.out.print("내용: "); String content = in.next();
		System.out.print("작성자: "); String writer = in.next();
		
		System.out.println(subject + content + writer);
		
		boardDTO.setSubject(subject);
		boardDTO.setContent(content);
		boardDTO.setWriter(writer);
		
		boardService.insert(boardDTO);
				
	}
	
	// 2. 게시글 번호 검색
	private static void selectNum() {
		BoardService boardService = new BoardService();
		try {
			System.out.println("=== 게시글 번호 검색 ===");
			System.out.print("글 번호: "); int num = in.nextInt();
			
			boardService.selectNum(num);
			
		} catch (Exception e) {
			e.printStackTrace();
			return;					
		}

		
	}
	
	// 3. 게시글 제목 검색
	private static void selectSubject() {
		BoardService boardService = new BoardService();
		System.out.println("=== 게시글 제목 검색 ===");
		System.out.print("글 제목: "); String subject = in.next();
		
		boardService.selectSubject(subject);
		
	}
	
	// 4. 게시글 모두 보기
	private static void selectAll() {
		BoardService boardService = new BoardService();
		
		boardService.selectAll();
		
	}
	
	// 5. 게시글 삭제
	private static void delete() {
		BoardService boardService = new BoardService();
		System.out.println("=== 게시글 삭제 ===");
		System.out.print("삭제할 게시글 번호: "); int num = in.nextInt();
		
		boardService.delete(num);
		
	}


	// 6. 게시글 수정
	private static void update() {
		BoardService boardService = new BoardService();
		System.out.println("=== 게시글 수정 ===");
		System.out.print("수정할 게시글 번호: "); int num = in.nextInt();
		System.out.print("수정할 제목: "); String subject = in.next();
		System.out.print("수정할 내용: "); String content = in.next();
		
		boardService.update(num, subject, content);
		
	}

	// 7. 프로그램 종료
	private static void disconnection() {
		BoardService boardService = new BoardService();
		boardService.disconnection();
		System.out.println("종료합니다.");
	}




}
