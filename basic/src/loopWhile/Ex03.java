package loopWhile;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("수 입력: ");
		int i = input.nextInt();
		
		// int형으로 표현할 수 있는 수 범위 2 147 000 000
		while(true) {
			int tmp = i % 10; // 현재 수의 1의 자리 값 구하기, 예) 123 -> 3, 12 -> 2, 1 -> 1
			i = i / 10;
			System.out.println(tmp + " ");
			if(i == 0);
			break;
		} 
		
		input.close();
	}

}
