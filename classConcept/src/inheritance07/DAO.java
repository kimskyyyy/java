package inheritance07;

import java.util.HashMap;

public class DAO {
	private HashMap<String, DTO> members;
	
	public DAO() {
		members = new HashMap<>();
	}
	
	// 회원등록
	public void insert(String id, DTO dto) {
		members.put(id, dto);
	}
	
	// id 조회
	public boolean findById(String id) {
		boolean result = members.containsKey(id);
		return result;
	}
	
	// 회원 검색
	public DTO selectId(String id) {
		DTO dto = members.get(id);
		return dto;
	}

	// 회원삭제
	public void remove(String id) {
		members.remove(id);
	}
	
	// 전체조회
	public void findAll(){
		for(String key : members.keySet()) {
			System.out.println("아이디 : " + key);
			DTO dto = members.get(key);
			System.out.println("비밀번호 : " + dto.getPw());
			System.out.println("이름 : " + dto.getName());
			System.out.println();
		}		
	}
	
	// 비밀번호변경(수정)
	public void updatePw(String id, DTO dto) {
		members.put(id, dto);
	}
	
}








