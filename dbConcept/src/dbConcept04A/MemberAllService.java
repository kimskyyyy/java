package dbConcept04A;

import java.util.Collection;

import dbConcept04A.MemberDAO;
import dbConcept04A.MemberDTO;

public class MemberAllService {
	private MemberDAO memberDao;

	public MemberAllService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}

	public void selectAll() {
		// MemberDAO 객체 내부 selectAll() 호출 후 회원 모든 정보 출력
		Collection<MemberDTO> members = memberDao.selectAll();
		if (members.isEmpty() == false) {
			System.out.println("이메일\t\t이름\t비밀번호\t가입일");
			for (MemberDTO member : members) {
				System.out.print(member.getEmail() + "\t");
				System.out.print(member.getName() + "\t");
				System.out.print(member.getPassword() + "\t");
				System.out.println(member.getRegisterDate());
			}
		} else {
			System.out.println("등록 후 이용하세요.");
		}
	}

}
