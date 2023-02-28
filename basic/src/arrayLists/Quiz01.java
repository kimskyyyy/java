package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {

	/*
	  연락처 저장 프로그램 만들기(ArrayList 2개 사용)
	  하나의 리스트: 이름 정보
	  하나의 리스트: 전화번호 정보
	  1. 연락처 등록: 이름과 전화번호(중복허용 불가)
	  2. 연락처 보기: 등록되어 있지 않으면 목록에 없습니다.
	  3. 연락처 삭제: 목록에 없으면 목록에 없습니다.
	  4. 모든 연락처 보기: 등록되어 있는 목록 전부 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = 0;
		String name = "";
		String phone = "";
		int index =0 ;
		ArrayList<String> nameList = new ArrayList<>();
		ArrayList<String> phoneList = new ArrayList<>();

		while(true) {
			System.out.println();
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print( ">>> ");
			
			select = sc.nextInt();

			switch(select) {
			case 1:
				System.out.println("=== 연락처 등록 ===");
				System.out.print("이름을 입력하세요: ");
				name = sc.next();
				nameList.add(name);
				
				System.out.print("전화번호를 입력하세요: ");
				phone = sc.next();
				// 중복 검사
				// contains() 메서드로 구현할 수 있음
				for(int i = 0; i < phoneList.size(); i++) {
					if(phone.equals(phoneList.get(i))) {
						System.out.println("이미 존재하는 전화번호입니다.");
						break;
					}
				}				
				phoneList.add(phone);	
								
				break;
				
			case 2: 
				System.out.println("=== 연락처 보기 ===");
				System.out.print("전화번호 입력: ");
				phone = sc.next();				
				index = phoneList.indexOf(phone);				
				if(index != -1) {	
					System.out.println(nameList.get(index));
					System.out.println(phoneList.get(index));
				} else {
					System.out.println("목록에 없는 전화번호입니다.");
				}		
				
				break;
				
			case 3:
				System.out.println("=== 연락처 삭제 ===");
				System.out.print("삭제 할 전화번호 입력(데이터 삭제): ");
				phone = sc.next();
				index = phoneList.indexOf(phone);
				if(index != -1) {	
					System.out.println("'" + nameList.remove(index) + "'" + " 이름을 삭제합니다. ");
					System.out.println("'" + phoneList.remove(index) + "'" + " 전화번호를 삭제합니다. ");
				} else {
					System.out.println("목록에 없는 전화번호입니다.");
				}
				
				break;
				
			case 4:
				// 등록된 정보가 없는 경우 추가해줌
				if(phoneList.isEmpty() == false) {
					System.out.println("=== 모든 연락처 보기 ===");
					System.out.println(nameList);
					System.out.println(phoneList);					
				} else {
					System.out.println("등록된 전화번호가 없습니다.");
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
