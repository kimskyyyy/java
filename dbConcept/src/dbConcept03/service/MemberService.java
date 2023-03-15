package dbConcept03.service;

import java.util.ArrayList;

import dbConcept03.dao.MemberDAO;
import dbConcept03.dto.MemberDTO;

public class MemberService implements IMemberService{
	MemberDTO member = null;
	MemberDAO memberDao = new MemberDAO();

	@Override
	public void deleteMember(String id, String pw) {
		
		member = memberDao.selectId(id);
		
		if(member == null) {
			System.out.println(id + "는/은 등록된 정보가 아닙니다.");
		}else {
			if(member.getPw().equals(pw)) {
				memberDao.deleteMember(id);
				System.out.println(id + " 정보가 삭제되었습니다.");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
		System.out.println();
		
	}

	@Override
	public void updateMember(String id, String pw, String name, String email) {
		member = memberDao.selectId(id);
		if(member == null) {
			System.out.println("미등록 정보입니다.");
		}else {
			member = new MemberDTO();
			member.setId(id);
			member.setPw(pw);
			member.setName(name);
			member.setEmail(email);
			int result = memberDao.updateMember(member);
			
			if(result == 1)
				System.out.println("정보가 수정되었습니다.");
			else
				System.out.println("수정이 정상적으로 처리되지 않습니다. 다시 시도하세요.");
		}
		
	}

	@Override
	public void insertMember(String id, String pw, String name, String email) {
		member = memberDao.selectId(id);
		if(member == null) {
			member = new MemberDTO();
			member.setId(id);
			member.setPw(pw);
			member.setName(name);
			member.setEmail(email);
			
			memberDao.insertMember(member);
			System.out.println("회원 등록이 되었습니다.");
		}else {
			System.out.println("등록된 정보입니다.");
		}
		
	}

	@Override
	public void selectId(String id) {
		member = memberDao.selectId(id);
		if(member == null) {
			System.out.println("미등록 정보입니다.");
		}else {
			System.out.println("회원번호 : " + member.getNum());
			System.out.println("아이디: " + member.getId());
			System.out.println("패스워드: " + member.getPw());
			System.out.println("이름 : " + member.getName());
			System.out.println("이메일 : " + member.getEmail());

		}
		
	}

	@Override
	public void selectAll() {
		ArrayList<MemberDTO> members = memberDao.selectAll(); 
		if(members.isEmpty() == false) {
			System.out.println("번호\t아이디\t비밀번호\t이름\t이메일");
			for(MemberDTO m : members) {
				System.out.print(m.getNum() + "\t");
				System.out.print(m.getId() + "\t");
				System.out.print(m.getPw() + "\t");
				System.out.print(m.getName() + "\t");
				System.out.println(m.getEmail());
				System.out.println();
			}
		}else {
			System.out.println("등록된 정보가 없습니다.");
		}
		System.out.println();
		
	}
	
	public void exit() {
		memberDao.exit();
	}
	

}
