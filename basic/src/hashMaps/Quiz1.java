package hashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz1 {

	/*
	 * HashMap을 이용하여 간단한 메뉴판 만들기
	 * 1. 메뉴등록: 존재하는 메뉴이면 존재하는 메뉴입니다.
	 * 2. 메뉴별 가격 보기
	 * 3. 종료
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> menus = new HashMap<>();
		String menu = "";
		int price = 0;		
		
		while(true) {
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1: 
				System.out.print("메뉴명을 입력해주세요: ");
				menu = sc.next();
				if(menus.get(menu) == null) {
					System.out.print("가격을 입력해주세요: ");
					price = sc. nextInt();
					
					menus.put(menu, price);
					
				} else {
					System.out.println("이미 존재하는 메뉴입니다.");
				}				
				break;
				
			case 2: 				
				
				// 출력 방법 1
				System.out.println(menus);	
				
				System.out.println();
				
				
				// 출력 방법 2
				Iterator<String> itk = menus.keySet().iterator();
				
				while(itk.hasNext()) {
					String key = itk.next();
					System.out.println(key + " : " + menus.get(key));
				}
				
				break;
				
			case 3:
				System.out.println("=== 종료 ===");
				System.exit(0);
				break;
				
			default: 
				System.out.println("메뉴를 확인해주세요.");
			}
			
		}
		
	}

}
