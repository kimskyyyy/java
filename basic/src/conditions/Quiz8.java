package conditions;

import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String home = "";
		String office = "";
		boolean stop = true;
		
		while(stop) {
			System.out.println();
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			System.out.println("4. 종료");
			System.out.println(">>> ");
			
			int select = input.nextInt();
//			String select = input.next(); // case "1", "2", "3", "4"로 표현, 
//			input.nextLine(); // input.nextInt()에서 입력된 개행 제거
			switch(select) {
				case 1: System.out.println("우리집 등록: ");
						home = input.next(); break;
				case 2: System.out.println("회사 등록: ");
						office = input.next(); break;
				case 3: System.out.println("\n우리집: " + home + "\n회사: " + office); break;
				case 4: System.out.println("프로그램을 종료합니다.");
						System.exit(0);
						stop = false; break;
				default : System.out.println("다시 입력하세요.");
			}
		}
		input.close();
		
	}

}
