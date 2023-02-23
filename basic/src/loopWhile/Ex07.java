package loopWhile;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0, sum = 0;
		while(true) {
			System.out.println("수입력(1 ~ 100): ");
			try {
				i = input.nextInt();
			} catch (Exception e) {
				input.nextLine(); // 입력 버퍼에 있는 데이터를 입력 받아 버퍼 청소
				continue;
			}
			if(i >= 1 && i <= 100)
				break; // 인접된 반복문 탈출
			else
				System.out.println("잘못 입력, 다시");
			
		}
//		for(int j = 1; j <=i; j++)
			
	}

}
