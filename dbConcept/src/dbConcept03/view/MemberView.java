package dbConcept03.view;

import java.util.Scanner;

import dbConcept03.dto.MemberDTO;
import dbConcept03.service.MemberService;


public class MemberView implements IView{
	Scanner in = new Scanner(System.in);
	String id = "", pw = "", name="", email="";
	MemberDTO member = null;
	MemberService memberService = new MemberService();

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
			case 0: memberService.exit();
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
				
			}
		}		

	}

	@Override
	public void deleteMember() {
		System.out.println("=== 회원 정보 삭제 ===");
		System.out.print("아이디: "); id = in.next();
		System.out.print("패스워드:"); pw = in. next();
		
		memberService.deleteMember(id, pw);		
	}

	@Override
	public void updateMember() {
		System.out.println("=== 회원 정보 변경 ===");
		System.out.print("아이디 : "); id = in.next();
		System.out.print("패스워드 : "); pw = in.next();
		System.out.print("이름 : ");	name = in.next();
		System.out.print("이메일 : "); email = in.next();
		
		memberService.updateMember(id, pw, name, email);		
	}

	@Override
	public void insertMember() {
		System.out.println("=== 회원 정보 입력 ===");
		System.out.print("아이디: "); id = in.next();
		System.out.print("패스워드: "); pw = in.next();
		System.out.print("이름 : ");	name = in.next();
		System.out.print("이메일 : "); email = in.next();
		
		memberService.insertMember(id, pw, name, email);
		
	}

	@Override
	public void selectId() {
		System.out.println("=== 회원 정보 조회 ===");
		System.out.print("아이디 : "); id = in.next();
		
		memberService.selectId(id);
	}

	@Override
	public void selectAll() {
		memberService.selectAll();
		
	}

}


