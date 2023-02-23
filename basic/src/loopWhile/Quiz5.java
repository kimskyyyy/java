package loopWhile;

import java.util.Scanner;

public class Quiz5 {

	//  가위 바위 보 게임
	// 예외처리 필요!!!!!
	// 코드 중복 줄이기, 승리조건 규칙성 있음(규칙성으로 코드 간결화 할 수 있음)
	public static void main(String[] args) {
	
		boolean stop = true;
		int com = 0;
		String result = "";
		
		while(stop) {
			System.out.println("===가위 바위 보 게임===");
			System.out.println("숫자를 선택하세요(1. 가위 / 2. 바위 / 3. 보 / 0. 종료) >>");
			Scanner input = new Scanner(System.in);
			
		int select = input.nextInt();
		
		switch(select) {
		case 1: System.out.println("가위를 선택하셨군요!?");
				com = (int)(Math.random() * 3 + 1);
				if (com == 1) {
					result = "컴퓨터는 가위를 냈어요! \nDraw";
				} else if(com == 2) {
					result = "컴퓨터는 바위를 냈어요! \nLose";
				} else {
					result = "컴퓨터는 보를 냈어요! \nWin";
				}
				System.out.println(result);				

				break;
		case 2: System.out.println("바위를 선택하셨군요!?");
				com = (int)(Math.random() * 3 + 1);
				if (com == 1) {
					result = "컴퓨터는 가위를 냈어요! \nWin";
				} else if(com == 2) {
					result = "컴퓨터는 바위를 냈어요! \nDraw";
				} else {
					result = "컴퓨터는 보를 냈어요! \nLose";
				}
				System.out.println(result);	
				
				break;		
		case 3: System.out.println("보를 선택하셨군요!?");
				com = (int)(Math.random() * 3 + 1);
				if (com == 1) {
					result = "컴퓨터는 가위를 냈어요! \nLose";
				} else if(com == 2) {
					result = "컴퓨터는 바위를 냈어요! \nWin";
				} else {
					result = "컴퓨터는 보를 냈어요! \nDraw";
				}
				System.out.println(result);	
		
		break;	
		case 0: System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				stop = false;
				break;
		default : System.out.println("다시 입력하세요.");
	}
		
		
		
	}

	}
	
}
