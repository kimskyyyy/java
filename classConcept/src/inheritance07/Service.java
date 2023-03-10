package inheritance07;

public class Service {
	private DAO dao;
	
	public Service() {
		dao = new DAO();
	}
	
	// 1. 회원등록
	public void insert(String id, String pw, String name) {
		if(dao.findById(id) == false) {
			DTO dto = new DTO();
			dto.setId(id);
			dto.setPw(pw);
			dto.setName(name);
			dao.insert(id, dto);
		}else {
			System.out.println("등록된 아이디입니다.");
		}

	}
	
	// 2. 회원조회
	public void selectId(String id) {
		if(dao.findById(id) == true) {
			DTO dto = dao.selectId(id);
			System.out.println("아이디 : " + dto.getId());
			System.out.println("비밀번호 : " + dto.getPw());
			System.out.println("이름 : " + dto.getName());
			dao.insert(id, dto);
		}else {
			System.out.println("등록되지 않은 아이디입니다.");
		}
		
		System.out.println();
	}

	// 3. 회원삭제
	public void remove(String id) {
		if(dao.findById(id) == true) {
			dao.remove(id);
			System.out.println(id + "계정 정보가 삭제되었습니다.");
		}else {
			System.out.println("등록되지 않은 아이디입니다.");
		}
	}

	// 4. 전체조회
	public void findAll() {
		dao.findAll();
	}

	// 5. 회원수정
	public void updatePassword(String id, String currentPw, String changePw) {
		if(dao.findById(id) == true) {
			DTO dto = dao.selectId(id);
			if(dto.getPw().equals(currentPw) == false) {
				System.out.println("아이디 / 비밀번호를 확인 후 다시 입력하세요.");
				System.out.println("확인용// 입력한 현재 비밀번호: " + currentPw +" 진짜 기존 비밀번호: " + dto.getPw());
				return;
			}			
			dto.setPw(changePw);
			dao.updatePw(id, dto);			
			System.out.println("비밀번호가 변경되었습니다.");
			return;
		}else {
			System.out.println("등록되지 않은 아이디입니다.");
		}	

	}
	
}



















