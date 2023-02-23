package conditions;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";
		boolean stop = true;
		
		while(stop) {
			System.out.println("1. 이름 입력");
			System.out.println("2. 이름 출력");
			System.out.println("3. 종료");
			System.out.println(">>> ");
			
			int select = input.nextInt();
			switch(select) {
				case 1 : System.out.println("이름 입력: ");
						name = input.next(); break;
				case 2: System.out.println("이름: " + name); break;
				case 3: System.out.println("프로그램 종료합니다.");
//				System.exit(0);
						stop = false; break;
				default : System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
		}
		
		input.close();
		
	}

}
