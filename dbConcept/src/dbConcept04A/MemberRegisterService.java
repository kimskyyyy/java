package dbConcept04A;

import java.text.SimpleDateFormat;
import java.util.Date;

import dbConcept04A.MemberDAO;
import dbConcept04A.MemberDTO;
import dbConcept04A.RegisterRequest;

public class MemberRegisterService {
	private MemberDAO memberDao;
	
	public MemberRegisterService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void regist(RegisterRequest req) {
		// password == confirmPassword
		if(req.getPassword().equals(req.getConfirmPassword()) == false) {
			System.out.println("비밀번호가 다릅니다.");
			return;
		}
		
		// email로 계정 등록 여부 확인
		MemberDTO check = memberDao.selectEmail(req.getEmail());
		if(check != null) {
			System.out.println(req.getEmail() + "는/은 등록된 이메일입니다.");
			return;
		}
		
		// memberDao.insert() 계정 등록
		MemberDTO member = new MemberDTO();
		member.setEmail(req.getEmail());
		member.setName(req.getName());
		member.setPassword(req.getPassword());
		
		Date date = new Date(); // 날짜 구하기
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 형식
		String regDate = sdf.format(date);
		member.setRegisterDate(regDate);
		
		memberDao.insert(member);
		System.out.println("회원정보가 등록되었습니다.");
	}

}









