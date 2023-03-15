package dbConcept04A;

import dbConcept04A.MemberDAO;
import dbConcept04A.MemberDTO;

public class MemberDeleteService {
	private MemberDAO memberDao;
	
	public MemberDeleteService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void checkPassword(String email, String password, String confirmPassword) {
		// 패스워드 확인
		if(password != null && password.equals(confirmPassword) == false) {
			System.out.println("비밀번호가 서로 다릅니다.");
			return;
		}
		
		// MemberDAO 객체 내 selectEmail() 메소드를 호출 
		MemberDTO member = memberDao.selectEmail(email);
		if(member == null) {
			System.out.println(email + "는/은 등록되지 않았습니다.");
		}else {
			// 저장된 회원 정보와 입력된 회원 정보 검증
			if(password.equals(member.getPassword()) == false) {
				System.out.println("저장된 비밀번호와 일치하지 않습니다.");
			}else {
				// MemberDAO 객체 내 delete() 호출
				memberDao.delete(email);
				System.out.println("계정 정보가 삭제되었습니다.");
			}
		}
	}
}







