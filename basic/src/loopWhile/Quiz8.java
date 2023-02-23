package loopWhile;

import java.util.Random;
import java.util.Scanner;

/*
 * 선택 1
 * 배팅 금액 넣을거면 넣기?
 * 주사위 3번 돌리기 
 * 주사위 범위 1~6
 * 주사위 총합
 * 컴퓨터 랜덤값과 사용자 랜덤값 비교
 * 결과에 따라 배팅 금액 증감
 * 선택 2 게임 스코어 보여주기
 * 선택 3 게임 종료 
 * 배팅 금액 모두 잃어도 게임 종료
 */
public class Quiz8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int select;
		while (true) {
			System.out.println("\n=== Dice Game ==");
			System.out.println("1. Game Start\n2. Game Score\n3. End Game");
			System.out.print(">> ");

			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			
			if (select < 1 || select > 3) {
				System.out.println("확인 후 다시 입력하세요.");
				continue;
			}


			int user = 0;
			int com = 0;
			int seed = 10000;
			int bat = 0;
			int count = 0;
			char game = 'y';
			int win = 0;
			int lose = 0;
			int draw = 0;
			
			switch (select) {
			case 1:				
				System.out.println("게임을 시작합니다.\n배팅 금액: " + seed);
				while(true) {
					count++;
					System.out.println("\n주사위를 돌리겠습니다.");
					Random r = new Random();
					int dice1 = r.nextInt(6) + 1;
					int dice2 = r.nextInt(6) + 1;
					int dice3 = r.nextInt(6) + 1;
					int comDice1 = r.nextInt(6) + 1;
					int comDice2 = r.nextInt(6) + 1;
					int comDice3 = r.nextInt(6) + 1;
					// 컴퓨터의 주사위는 3~18까지 랜덤값으로 뽑을 수 있음
					user = dice1 + dice2 + dice3;
					com = comDice1 + comDice2 + comDice3;
					System.out.println("1번째 주사위: " + dice1);
					System.out.println("2번째 주사위: " + dice2);
					System.out.println("3번째 주사위: " + dice3);

					System.out.println("당신의 주사위 총 합: " + user);
					System.out.println("배팅 금액을 정해주세요: ");
					bat = in.nextInt();
					if(bat > seed) {
						System.out.println("배팅 금액은 현재 가지고있는 금액을 초과할 수 없습니다. \n현재 가진 금액은 " + seed + "원 입니다.\n배팅 금액을 다시 입력해주세요.");
						bat = in.nextInt();
					}
					System.out.println("=== 결과 ===");
					System.out.println("당신의 눈: " + user);
					System.out.println("상대의 눈: " + com);
					if(user > com) {
						seed += bat;
						win ++;
						System.out.println("이겼습니다." + bat + "원을 얻었습니다.\n잔액: " + seed);
					} else if(user < com) {
						seed -= bat;
						lose ++;
						System.out.println("졌습니다." + bat + "원을 잃습니다.\n잔액: " + seed);						
					} else {
						draw ++;
						System.out.println("무승부 입니다.");
					}
					
					if(seed <= 0) {
						System.out.println("배팅 금액을 모두 잃었습니다. 종료합니다.");
						System.exit(0);
					} else {
						System.out.println("게임을 계속하시겠습니까? (y/n): ");
						game = in.next().toLowerCase().charAt(0);
						if (game=='y') {
							System.out.println("배팅 금액: " + seed);
						} else if(game == 'n') { 
							System.out.println("게임을 종료합니다.");
							System.exit(0);
						} else {
							System.out.println("y/n 을 입력해주세요.");
						}
						
					}				

				}					
			case 2:
				System.out.println("현재 " + count + "전 " + win + "승 " + draw + "무 " + lose + "패 입니다.");
				System.out.printf("현재 %d전 %d승 %d무 %d패 입니다.\n");
				
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
