package method2;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz3 {
	private static ArrayList<String> emails = new ArrayList<>();
	private static ArrayList<String> names = new ArrayList<>();
	private static ArrayList<String> mobiles = new ArrayList<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String email = "", name="", mobile="";
		
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
				insert(email, name, mobile);
				break;
			case 2:
				System.out.println("=== 회원 검색 ===");
				System.out.print("이메일 : "); email = in.next();
				selectEmail(email);
				break;
			case 3:
				System.out.println("=== 회원 삭제 ===");
				System.out.print("이메일 : "); email = in.next();
				delete(email);
				break;
			case 4:	selectAll(); break;
			case 5:
				System.out.println("=== 회원 수정 ===");
				System.out.print("이메일 : "); email = in.next();
				System.out.print("이름 : ");	name = in.next();
				System.out.print("전화번호 : "); mobile = in.next();
				update(email, name, mobile);
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}
	}
	
	public static void insert(String e, String n, String m) {
		if(emails.contains(e) == false) {
			emails.add(e);
			names.add(n);
			mobiles.add(m);		
			System.out.println("정보가 등록되었습니다.");
		} else {
			System.out.println(e + "은/는 중복된 이메일입니다.");
		}
	}
	
	public static void selectEmail(String e) {
		
		int index = emails.indexOf(e);
		
		if(index != -1) {
			System.out.println("이름: " + names.get(index));
			System.out.println("전화번호: " + mobiles.get(index));
			System.out.println("이메일: " + emails.get(index));
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}		
	}
	
	public static void delete(String e) {
		int index = emails.indexOf(e);
		
		if(index != -1) {
			System.out.println("이름: " + names.remove(index) + "님의 정보가 삭제되었습니다.");
			System.out.println("전화번호: " + mobiles.remove(index) + "님의 전화번호가 삭제되었습니다.");
			System.out.println("이메일: " + emails.remove(index) + "님의 이메일이 삭제되었습니다.");
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}		
		
	}
	public static void selectAll() {
		if(emails.isEmpty() == false) {
			System.out.println("이름: " + names);
			System.out.println("전화번호: " + mobiles);					
			System.out.println("이메일: " + emails);					
		} else {
			System.out.println("회원 정보가 존재하지 않습니다.");
		}
		
	}
	public static void update(String e, String n, String m) {
		int index = emails.indexOf(e);
		
		if(index != -1) {			
			names.set(index, n);
			mobiles.set(index, m);
			
			System.out.println("이름이 " + names.get(index) + "으로 수정되었습니다.");
			System.out.println("전화번호가 " + mobiles.get(index) + "으로 수정되었습니다.");			
		} else {
			System.out.println("존재하지 않는 회원입니다.");	
		}
		
	}
	

}
