package loopWhile;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0, sum = 0;
		while (true) {
			System.out.println("수 입력(1 ~ 100): ");
			i = input.nextInt();
			
			if (i >= 1 && i <= 100)
				break;
			else
				System.out.println("잘못 입력, 다시 입력해주세요.");
		}
		
		for (int j = 1; j<= i; j++)
			sum += j;
		System.out.println("입력 받은 수 까지의 합: ");
	}

}
