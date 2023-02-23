package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int record = 0;
		int select;
		while (true) {
			System.out.println("\n== Up & Down Game ==");
			System.out.println("1. Game Start\n2. Game Score\n3. Game Exit");
			System.out.print("> ");

			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			
			if (select < 1 || select > 3) {
				System.out.println("확인 후 다시 입력하세요.");
				continue;
			}

			Random r = new Random();
			int com = r.nextInt(100) + 1;
			int count = 0;

			switch (select) {
			case 1:				
				System.out.println("<< Game Start >>\n정답: " + com);
				while(true) {
					count++;
					System.out.println("\n<< Player Turn >>");
					System.out.println("Input Number: ");
					int input = in.nextInt();
					if(input > com) {
						System.out.println("Down!!");
					} else if(input < com) {
						System.out.println("Up!!");
					} else {
						System.out.println("플레이어가 정답을 맞췄습니다!!");
						if(record > count || record == 0) {
							record = count;
						}
						break;
					}
				}					
				break;
			case 2:
				System.out.println("최고기록은 " + record + "번 입니다.");
				
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				System.exit(0);
				break;
			default: System.out.println("메뉴를 확인 후 다시 입력해주세요.");
			}

			continue;


		}

	}
	
}
