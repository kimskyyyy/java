package inheritance06;

import java.util.ArrayList;

public class Service implements IService{
	/*
	 * 검증, 데이터 처리해서 DAO로
	 */
	DAO dao = new DAO();
//	DTO member = new DTO();

	// 1. 회원등록
	@Override
	public void insert(String id, String password, String name) {
		if(id.isEmpty()) {
			System.out.println("아이디를 입력해주세요.");
		}
		
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
			DTO member = dao.selectId(index);
			System.out.println("아이디: " + member.getId());
			System.out.println("비밀번호: " + member.getPassword());
			System.out.println("이름: " + member.getName());
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
			System.out.println("회원이 삭제되었습니다.");
		}		
	}

	// 4. 회원 전체 검색
	@Override
	public void selectAll() {
		ArrayList<DTO> members = dao.selectAll();	
		if(members.isEmpty()) {
			System.out.println("등록된 데이터가 없습니다.");
			return; // void 반환형인데 빈 return을 넣은 경우 메서드를 끝냄
		}
		
		for(DTO member : members) {
			System.out.println("아이디: " + member.getId());
			System.out.println("비밀번호: " + member.getPassword());
			System.out.println("이름: " + member.getName());
		}
	}

	// 5. 회원수정
	@Override
	public void update(String id, String currentPw, String changePw) {
		int index = dao.findIndexById(id);
		
		if(index == -1) {
			System.out.println("회원이 존재하지 않습니다.");
			return;
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
	
	public boolean checkId(String id) {
		boolean result = false;
		if(dao.findIndexById(id) != -1) {
			result = true;
		}
		return result;
	}

}
