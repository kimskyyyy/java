package dbConcept04.Service;

import dbConcept03.dto.MemberDTO;
import dbConcept04.DAO.MemberDAO;
import dbConcept04.DTO.RegisterRequest;

public class MemberRegisterService {
	private RegisterRequest registerRequest;
	private MemberDTO member = null;
	private MemberDAO memberDao;
	
	public MemberRegisterService(MemberDAO memberDao) {
		
	}
	public void regist(RegisterRequest req) {
		
		member = memberDao.selectEmail(email);
		if(member == null) {
			member = new MemberDTO();
			member.setEmail(email);
			member.setName(name);
			member.setPassWord(password);
			member.setConfirmPassword(confirmPassword);

			
			memberDao.insert(member);
			System.out.println("회원 등록이 되었습니다.");
		}else {
			System.out.println("등록된 정보입니다.");
		}
		// password == confirmPassword
		// email로 계정 등록 여부 확인
		// memberDao.insert() 계정 등록
	}

}
