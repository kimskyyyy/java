package loopWhile;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in); 
		int min = 1;
		int max = 100;
		int userWin = 0;
		int userLose = 0;
		int comWin = 0;
		int comLose = 0;
		
		while (true) {
			System.out.println("=== Up & Down Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. Game Exit");
			System.out.print("> ");
			String select = sc.next();

			switch(select) {
				case "1": 
					System.out.println("<< Game Start >> ");
					Random r = new Random();
					int random = r.nextInt(100) + 1;
					System.out.println("정답: " + random);

					
					while(true){
						System.out.println("<< player turn >> ");
						System.out.print("input number : ");
						int user = 0;
						try {
							user = sc.nextInt();
						} catch (Exception e) {
							System.out.println("숫자를 입력하세요.");
							sc.nextLine();
							continue;
						}
						if(user < 1 || user > 100) {
							System.out.println("입력 범위는 1 ~ 100 입니다.");
							continue;
						}
							
						if(user > random) {
							max = user-1;
							System.out.println("Down!!");
							System.out.println("사용자가 " + user + "을(를) 불렀기 때문에 컴퓨터의 난수 최대값 " + max + "(으)로 조정");
							System.out.println("맞추어야 하는 정답: " + random);
							System.out.println("컴퓨터가 다음에 부를 값: " + min + " ~ " + max +" 사이");
							System.out.println("사용자 턴이 끝났습니다. 계속하려면 엔터키를 누르세요.");
							System.in.read();
							
						} else if(user < random) {
							min = user+1;
							System.out.println("Up!!");
							System.out.println("사용자가 " + user + "을(를) 불렀기 때문에 컴퓨터의 난수 최소값 " + min + "(으)로 조정");
							System.out.println("맞추어야 하는 정답: " + random);
							System.out.println("컴퓨터가 다음에 부를 값: " + min + " ~ " + max +" 사이");
							System.out.println("사용자 턴이 끝났습니다. 계속하려면 엔터키를 누르세요.");
							System.in.read();
						} else {
							System.out.println("플레이어가 정답을 맞췄습니다.!!");
							userWin++;
							comLose++;
							break;
						}						
					
						System.out.println("<< Computer turn >> ");
						int com =  r.nextInt(max-min) + min;
						System.out.println("input number : " + com);
							
						if(com > random) {
							max = com-1;
							System.out.println("Down!!");
							System.out.println("컴퓨터가 " + com + "을(를) 불렀기 때문에 컴퓨터의 난수 최대값 " + max + "(으)로 조정");
							System.out.println("맞추어야 하는 정답: " + random);
							System.out.println("컴퓨터가 다음에 부를 값: " + min + " ~ " + max +" 사이");
						} else if(com < random) {
							min = com+1;
							System.out.println("Up!!");
							System.out.println("컴퓨터가 " + com + "을(를) 불렀기 때문에 컴퓨터의 난수 최소값 " + min + "(으)로 조정");
							System.out.println("맞추어야 하는 정답: " + random);
							System.out.println("컴퓨터가 다음에 부를 값: " + min + " ~ " + max +" 사이");
						} else {
							System.out.println("컴퓨터가 정답을 맞췄습니다.!!");
							comWin++;
							userLose++;
							break;
						}
	
					}
					break;
				case "2": System.out.printf("\n현재 스코어\n플레이어: %d승 %d패 \n컴퓨터: %d승 %d패\n", userWin, userLose, comWin, comLose);
							break;
				case "3": System.out.println("프로그램을 종료합니다."); System.exit(0);
				default : System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
		}
		
	}

}
