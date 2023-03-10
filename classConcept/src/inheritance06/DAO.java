package inheritance06;

import java.util.ArrayList;

public class DAO implements IDAO{
	
	private ArrayList<DTO> members;
	
	public DAO() {
		members = new ArrayList<>();
	}

	// 1. 회원등록
	@Override
	public void insert(DTO member) {
		members.add(member);		
	}

	// id조회
	@Override
	public int findIndexById(String id) {
		for(DTO m : members) {
			if(m.getId().equals(id))
				return members.indexOf(m);
		}
		return -1;
	}

	// 2. 회원검색
	@Override
	public DTO selectId(int index) {
		return members.get(index);
	}
	
	// 3. 회원삭제
	@Override
	public void delete(int index) {
		members.remove(index);
		
	}

	// 4. 회원 전체 검색
	@Override
	public ArrayList<DTO> selectAll() {
		return members;
	}

	// 5. 회원수정
	@Override
	public void update(int index, String password) {
		DTO member = members.get(index);
		member.setPassword(password);
		members.set(index, member);
		
	}



	// 현재 비밀번호와 일치 확인
	@Override
	public boolean checkPassword(String id, String currentPw) {
		for(DTO m : members) {
			if(m.getPassword().equals(currentPw))
				return true;
		}
		return false;
	}


	

	

}
