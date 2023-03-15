package dbConcept04.Service;

import dbConcept04.DAO.MemberDAO;

public class MemberAllService {
	private MemberDAO memberDao;
	
	public MemberAllService(MemberDAO memberDao){
	}
	
	public void selectAll() {
		// MemberDAO 객체 내부 selectAll() 호출 후 회원 모든 정보 출력
	}

}
