package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		  1. 회원 등록: 이름(중복 허용), 전화번호(중복 허용), 이메일(중복허용 불가)
		  2. 회원 확인: 이메일로 검색하여 있으면 이름, 전화번호, 이메일 출력 / 없으면 없음 출력
		  3. 회원 삭제: 이메일로 검색하여 있으면 이름, 전화번호, 이메일 출력 / 없으면 없음 출력
		  4. 회원 수정: 이메일로 검색하여 있으면 이름, 전화번호 수정 / 없으면 없음 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> phones = new ArrayList<>();
		ArrayList<String> emails = new ArrayList<>();
		String name = "";
		String phone = "";
		String email = "";
		int index = 0;

		
		while(true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 확인");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 수정");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			
			int select = sc.nextInt();
			
			switch(select) {
			
			case 1:
				System.out.print("이메일을 입력해주세요: ");
				email = sc.next();
				if(emails.contains(email)) {
					System.out.println("중복된 이메일입니다.");
				} else {
					emails.add(email);
					
					System.out.print("이름을 입력해주세요: ");
					name = sc.next();
					names.add(name);
					
					System.out.print("전화번호를 입력해주세요: ");
					phone = sc.next();
					phones.add(phone);					
				}
				
				break;
				
			case 2:
				System.out.print("이메일을 입력해주세요: ");
				email = sc.next();
				index = emails.indexOf(email);
				
				if(index != -1) {
					System.out.println("이름: " + names.get(index));
					System.out.println("전화번호: " + phones.get(index));
					System.out.println("이메일: " + emails.get(index));
				} else {
					System.out.println("존재하지 않는 회원입니다.");
				}
					
				break;
				
			case 3:
				System.out.print("이메일을 입력해주세요: ");
				email = sc.next();
				index = emails.indexOf(email);
				
				if(index != -1) {
					System.out.println("이름: " + names.remove(index));
					System.out.println("전화번호: " + phones.remove(index));
					System.out.println("이메일: " + emails.remove(index));
				} else {
					System.out.println("존재하지 않는 회원입니다.");
				}
				
				break;
			
			case 4:				
				System.out.print("이메일을 입력해주세요: ");
				email = sc.next();
				index = emails.indexOf(email);
				if(index != -1) {					
					System.out.print("수정할 이름을 입력해주세요: ");
					name = sc.next();
					names.set(index, name);
					
					System.out.print("수정할 전화번호를 입력해주세요: ");
					phone = sc.next();
					phones.set(index, phone);
					
					System.out.println("이름이 " + names.get(index) + "으로 수정되었습니다.");
					System.out.println("전화번호가 " + phones.get(index) + "으로 수정되었습니다.");
					
				} else {
					System.out.println("존재하지 않는 회원입니다.");	
				}

				
				break;
				
			case 5:
				System.out.println("=== 종료 ===");
				System.exit(0);
				break;
				
			}
		}
		
		
	}
}
