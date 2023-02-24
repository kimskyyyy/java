package arrays;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = 0;
		int room = 0;
		String name = "";
		int roomArr[][] = {{101, 102, 103}, {201, 202, 203}};	
		String nameArr[][] = new String[2][3];
		
		
		while(true) {
			System.out.println("1. 입실 \n2. 퇴실 \n3. 전체보기 \n4. 종료 \n>>");
			
			try {
				select = sc.nextInt();
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
				sc.nextLine();
				continue;
			}
			if(select < 1 || select > 4) {
				System.out.println("입력 범위는 1 ~ 4 입니다.");
				continue;
			}
				
			
			switch(select) {
			
			case 1 :
				System.out.print("입실 호수 선택: ");
				room = sc.nextInt();
				System.out.println("입실자 이름: ");
				name = sc.next();
				// 투숙객 있는지 없는지 확인하고 저장
				for(int i = 0; i < roomArr.length; i++) {
					for(int j = 0; j < roomArr.length+1; j++) {
						if(roomArr[i][j] == room && nameArr[i][j] == null) {
							nameArr[i][j] = name;
						} else {
							System.out.println("해당 호수 투숙객이 존재합니다.");
						}
					}
				}
				
				break;
				
				
			case 2 :
				System.out.print("퇴실 호수 선택: ");
				room = sc.nextInt();
				
				for(int i = 0; i < roomArr.length; i++) {
					for(int j = 0; j < roomArr.length+1; j++) {
						if(roomArr[i][j] == room) {
							name = nameArr[i][j];
							nameArr[i][j] = null;
							System.out.println(name + "님 퇴실 되었습니다.");
						}
					}
				}
				
				break;
				
			
			case 3 :
				for(int i = 0; i < roomArr.length; i++) {
					System.out.println(i+1 + "층 입실정보");
					for(int j = 0; j < roomArr.length+1; j++) {
						System.out.println(roomArr[i][j] + "호실 투숙객: " + nameArr[i][j]);
					}
				}
				break;
			
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			
			
			
			
			}
			
			System.out.println();
		}
	}

}
