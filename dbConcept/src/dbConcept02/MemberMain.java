package dbConcept02;

import java.util.Scanner;

import dbConcept02A.MemberDaoImpl;

public class MemberMain {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String email = "", name="", mobile="";
		
		MemberDaoImpl memberDao = new MemberDaoImpl();	
	
		
		while (true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 회원 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			switch (select) {
			case 1:
				System.out.println("=== 회원 등록 ===");
				System.out.print("이메일 : "); email = in.next();
				System.out.print("이름 : ");	name = in.next();
				System.out.print("전화번호 : "); mobile = in.next();
				
				int num = memberDao.findIndexByEmail(email);
				if(num == -1) {
					MemberDTO member = new MemberDTO();
					member.setEmail(email);
					member.setName(name);
					member.setMobile(mobile);
					
					memberDao.insert(member);
					System.out.println("회원 등록이 되었습니다.");
				}else {
					System.out.println("등록된 정보입니다.");
				}
				break;
			case 2:
				System.out.println("=== 회원 검색 ===");
				System.out.print("이메일 : "); email = in.next();
				num = memberDao.findIndexByEmail(email);
				if(num == -1) {
					System.out.println("미등록 정보입니다.");
				}else {
					MemberDTO member = memberDao.selectEmail(num);
					System.out.println("회원번호: " + member.getNum());
					System.out.println("이메일 : " + member.getEmail());
					System.out.println("이름 : " + member.getName());
					System.out.println("전화번호 : " + member.getMobile());
				}
				break;
			case 3:
				System.out.println("=== 회원 삭제 ===");
				System.out.print("이메일 : "); email = in.next();
				num = memberDao.findIndexByEmail(email);
				if(num == -1) {
					System.out.println("미등록 정보입니다.");
				}else {
					memberDao.delete(num);
					System.out.println("정보가 삭제되었습니다.");
				}
				break;
			case 4:	
				System.out.println("=== 회원 전체 조회 ===");
				memberDao.selectAll();
				break;
			case 5:
				System.out.println("=== 회원 수정 ===");
				System.out.print("이메일 : "); email = in.next();
				System.out.print("이름 : ");	name = in.next();
				System.out.print("전화번호 : "); mobile = in.next();
				num = memberDao.findIndexByEmail(email);
				if(num == -1) {
					System.out.println("미등록 정보입니다.");
				}else {
					memberDao.update(num, name, mobile);
					System.out.println("정보가 수정되었습니다.");
				}
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}
	}
	
	
}









