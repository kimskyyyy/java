package dbConcept04A;

import dbConcept04A.MemberDAO;
import dbConcept04A.MemberDTO;

public class ChangePasswordService {
	private MemberDAO memberDao;
	
	public ChangePasswordService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void changePassword(String email, String oldPw, String newPw) {
		// 이메일 등록여부 확인.
		MemberDTO member = memberDao.selectEmail(email);
		if(member == null) {
			System.out.println(email + "는/은 등록되지 않았습니다.");
		}else {
			// 패스워드 확인 및 MemberDAO.update() 호출 
			if( member.getPassword().equals(oldPw) == false) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}else {
				member.setPassword(newPw);
				memberDao.update(member);
				System.out.println("비밀번호가 수정되었습니다.");
			}
		}
	}

}








