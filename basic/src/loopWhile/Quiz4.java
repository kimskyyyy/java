package loopWhile;

import java.util.Scanner;

public class Quiz4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id = "";
		String pw = "";
		String loginId = "";
		String loginPw = "";
		boolean stop = true;
		
		while(stop) {
			System.out.println();
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 나가기");
			System.out.println(">>> ");
			
			int select = input.nextInt();
//			String select = input.next(); // case "1", "2", "3", "4"로 표현, 
			input.nextLine(); // input.nextInt()에서 입력된 개행 제거
			switch(select) {
				case 1: System.out.println("저장할 아이디 입력: ");
						id = input.next();
						System.out.println("저장할 비밀번호 입력: ");
						pw = input.next();
						System.out.println("저장된 ID: " + id + ", 저장된 PW: " + pw);
						break;
				case 2: System.out.println("아이디 입력: ");
						loginId = input.next(); 
						System.out.println("비밀번호 입력: ");
						loginPw = input.next(); 
						
						if(id.equals(loginId) && pw.equals(loginPw)) {
							System.out.println("인증 성공 !!!");	
						} else {
							System.out.println("인증 실패 !!!");	
						}
						
						break;											
				case 3: System.out.println("프로그램을 종료합니다.");
						System.exit(0);
						stop = false;
						break;
				default : System.out.println("다시 입력하세요.");
			}
		}
		input.close();
		
	}
	

}
