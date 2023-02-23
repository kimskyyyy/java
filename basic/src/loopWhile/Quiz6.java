package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int select;
		while (true) {
			System.out.println("\n==== 동전 앞/뒤 맞추기 ====");
			System.out.println("1.앞면 / 2.뒷면 / 3.종료");
			System.out.print("선택 > ");

			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			
			if (select < 1 || select > 3) {
				System.out.println("확인 후 다시 입력하세요.");
				continue;
			}

//			int com = (int) (Math.random() * 2 + 1);
			Random r = new Random();
			int com = r.nextInt(2) + 1;
			System.out.println("com : " + com);

			System.out.println(" ==== 결과 ==== ");

			switch (select) {
			case 1:				
				System.out.println("선택 > " + 1);
				break;
			case 2:
				System.out.println("선택 > " + 2);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			}

			if (com == 1) {
				System.out.println("컴퓨터는 앞면을 선택했습니다.");
			} else if (com == 2) {
				System.out.println("컴퓨터는 뒷면을 선택했습니다.");
			} 

			if ((select == 1 && com == 1) || (select == 2 && com == 2)) {
				System.out.println("맞췄습니다!");
			} else  {
				System.out.println("땡! 틀렸습니다.");
			}
			in.close();
		}

	}

}
