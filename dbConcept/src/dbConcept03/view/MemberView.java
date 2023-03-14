package dbConcept03.view;

import java.util.ArrayList;
import java.util.Scanner;

import dbConcept03.dao.MemberDAO;
import dbConcept03.dto.MemberDTO;


public class MemberView implements IView{
	Scanner in = new Scanner(System.in);
	String id = "", pw = "", name="", email="";
	MemberDTO member = null;
	MemberDAO memberDao = new MemberDAO();

	@Override
	public void mainMenu() {		
		while (true) {
			System.out.println("1. 회원 전체 정보 출력");
			System.out.println("2. 회원 정보 조회");
			System.out.println("3. 회원 정보 입력");
			System.out.println("4. 회원 정보 변경");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			switch (select) {
			case 1: selectAll(); break;
			case 2: selectId(); break;
			case 3: insertMember(); break;
			case 4: updateMember(); break;
			case 5: deleteMember(); break;
			case 0: memberDao.exit();
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
				
			}
		}		

	}

	@Override
	public void deleteMember() {
		System.out.println("=== 회원 정보 삭제 ===");
		System.out.print("아이디 : "); id = in.next();
		member = memberDao.selectId(id);
		if(member == null) {
			System.out.println("미등록 정보입니다.");
		}else {
			int result = memberDao.deleteMember(id);
			if(result == 1)
				System.out.println("정보가 삭제되었습니다.");
			else
				System.out.println("정상적으로 처리되지 않습니다. 다시 시도하세요.");
		}
		
	}

	@Override
	public void updateMember() {
		System.out.println("=== 회원 정보 변경 ===");
		System.out.print("아이디 : "); id = in.next();
		System.out.println("패스워드 : "); pw = in.next();
		System.out.print("이름 : ");	name = in.next();
		System.out.print("이메일 : "); email = in.next();
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
	public void insertMember() {
		System.out.println("=== 회원 정보 입력 ===");
		System.out.print("아이디: "); id = in.next();
		System.out.print("패스워드: "); pw = in.next();
		System.out.print("이름 : ");	name = in.next();
		System.out.print("이메일 : "); email = in.next();
		
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
	public void selectId() {
		System.out.println("=== 회원 정보 조회 ===");
		System.out.print("아이디 : "); id = in.next();
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
			for(MemberDTO m : members) {
				System.out.println("회원번호 : " + m.getNum());
				System.out.println("아이디: " + m.getId());
				System.out.println("패스워드: " + m.getPw());
				System.out.println("이름 : " + m.getName());
				System.out.println("이메일 : " + m.getEmail());
				System.out.println();
			}
		}else {
			System.out.println("등록된 정보가 없습니다.");
		}
		System.out.println();
		
	}

}


