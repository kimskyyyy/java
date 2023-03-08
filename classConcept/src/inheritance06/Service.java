package inheritance06;

public class Service implements IService{
	/*
	 * 검증, 데이터 처리해서 DAO로
	 */
	DAO dao = new DAO();
//	DTO member = new DTO();

	// 1. 회원등록
	@Override
	public void insert(String id, String password, String name) {
		int index = dao.findIndexById(id);
		
		if(index == -1) {
			DTO member = new DTO();
			member.setId(id);
			member.setPassword(password);
			member.setName(name);
			
			dao.insert(member);
			
			System.out.println("회원 등록이 되었습니다.");
		}else {
			System.out.println("등록된 정보입니다.");
		}
		
	}

	// 2. 회원검색
	@Override
	public void select(String id) {
		int index = dao.findIndexById(id);
		
		if(index == -1) {
			System.out.println("회원이 존재하지 않습니다.");
		} else {
			dao.selectId(index);
		}
	}

	// 3. 회원삭제
	@Override
	public void delete(String id) {
		int index = dao.findIndexById(id);
		
		if(index == -1) {
			System.out.println("회원이 존재하지 않습니다.");
		} else {
			dao.delete(index);
		}		
	}

	// 4. 회원 전체 검색
	@Override
	public void selectAll() {
		dao.selectAll();		
	}

	// 5. 회원수정
	@Override
	public void update(String id, String currentPw, String changePw) {
		int index = dao.findIndexById(id);
		
		if(index == -1) {
			System.out.println("회원이 존재하지 않습니다.");
		} else {
			// 현재 비밀번호 일치 확인			
			if(dao.checkPassword(id, currentPw) == true) {
				dao.update(index, changePw);
				System.out.println("비밀번호가 변경되었습니다.");
			} else {
				System.out.println("현재 비밀번호를 확인해주세요.");
			}
		}
		
	}
	

}
