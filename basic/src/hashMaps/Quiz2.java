package hashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		 * HashMap을 사용하여 회원 정보 만들기
		 * HashMap1: <id:password>
		 * HashMap2: <id:name>
		 * 1. 회원등록: id, password, name 3개 정보를 등록함.(id는 key : value는 password, name 사용)
		 * 2. 회원검색: id(key)를 이용하여 회원 정보를 검색하여 출력
		 * 3. 회원삭제: id(key)를 이용하여 회원 정보 삭제
		 * 4. 회원 모두 보기: 모든 정보 출력
		 * 5. 비밀번호 수정: id(key)를 이용하여 비밀번호 수정
		 * 6. 프로그램 종료: 프로그램을 종료
		 */
		
		HashMap<String, String> member = new HashMap<>();
		HashMap<String, String> memberName = new HashMap<>();
		String id = "", password = "", name = "";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 회원등록");
			System.out.println("2. 회원검색");
			System.out.println("3. 회원삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 비밀번호 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print(">>> ");
			
			int select = sc.nextInt();
			
			switch(select) {
			
			case 1: 
				System.out.print("id를 입력해주세요: ");
				id = sc.next();
				
				if(member.containsKey(id) == false) {
					
					System.out.print("비밀번호를 입력해주세요: ");
					password = sc.next();
					
					System.out.print("이름을 입력해주세요: ");
					name = sc.next();
					
					member.put(id, password);
					memberName.put(id, name);
					
				} else {
					System.out.println("이미 존재하는 id입니다.");
				}
				
				
				break;
				
			case 2:
				System.out.print("검색할 id를 입력해주세요: ");
				id = sc.next();
				
				if(member.containsKey(id) == false) {
					System.out.println("존재하지 않는 id입니다.");
				} else {
					System.out.println("=== 검색결과 ===");
					System.out.println("id: " + id + ", password: "+ member.get(id) + ", name: " + memberName.get(id));					
				}
				
				
				break;
				
			case 3:
				System.out.print("삭제할 id를 입력해주세요: ");
				id = sc.next();
				
				if(member.containsKey(id) == false) {
					System.out.println("존재하지 않는 id입니다.");
				} else {
					member.remove(id);
					memberName.remove(id);
				}
				
				break;
				
			case 4:
				for(String key : member.keySet()) {
				System.out.println("id: " + key + ", password: " + member.get(key) + ", name: " + memberName.get(key));
			}
				
				break;
				
			case 5:
				System.out.print("id를 입력해주세요: ");
				id = sc.next();
				
				if(member.containsKey(id) == false) {
					System.out.println("존재하지 않는 id입니다.");
				} else {
					System.out.print("수정할 비밀번호를 입력해주세요: ");
					password = sc.nextLine();
					
					member.put(id, password);
				}
				
				break;
				
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
				
			default:
				System.out.println("메뉴를 확인해주세요.");
			
			
			}
			
		}
		
		
		
		
	}
	

}
