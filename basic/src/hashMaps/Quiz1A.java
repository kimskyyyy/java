package hashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz1A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, String> menus = new HashMap<>();
		String menu = "", price = "";
		
		while(true) {
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격보기");
			System.out.println("3. 메뉴 종료");
			System.out.print(">> ");
			String select = input.next();
			input.nextLine();
			switch(select) {
			case "1": System.out.print("메뉴 등록 : ");
						menu = input.nextLine();
						if(menus.containsKey(menu) == false) {
							System.out.print("메뉴 가격 : ");
							price = input.nextLine();
							menus.put(menu, price);
						}else {
							System.out.println("이미 등록된 메뉴 입니다.");
						}
						break;
			case "2": 
						for(String key : menus.keySet()) {
							System.out.println(key + " : " + menus.get(key) + "원");
						}
						
						System.out.println();
						while(true) {
							System.out.println("1. 메뉴 수정");
							System.out.println("2. 메뉴 삭제");
							System.out.println("3. 나가기");
							System.out.print(">> ");
							select = input.nextLine();
							if(select.equals("3"))
								break;
							else if(select.equals("1")) {
								System.out.print("메뉴 수정 : ");
								menu = input.nextLine();
								if(menus.containsKey(menu) == true) {
									System.out.print("메뉴 가격 : ");
									price = input.nextLine();
									menus.put(menu, price);
									System.out.println(menu +"이/가 수정 되었습니다.");
								}else {
									System.out.println("등록된 메뉴가 아닙니다.");
								}
							}else if(select.equals("2")) {
								System.out.print("메뉴 삭제 : ");
								menu = input.nextLine();
								if(menus.containsKey(menu) == true) {
									menus.remove(menu);
									System.out.println(menu +"이/가 삭제 되었습니다.");
								}else {
									System.out.println("등록된 메뉴가 아닙니다.");
								}
							}else {
								System.out.println("메뉴를 확인 후 다시 입력하세요.");
							}
						}
						
						break;
			case "3": System.out.println("프로그램을 종료합니다."); System.exit(0);
			default:System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
		}
	
	}
}














