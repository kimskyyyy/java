package loopFor;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("반복 횟수: ");
		int repeat = in.nextInt();
		
//		for(int i = 1; i <= repeat; i++) {
//			System.out.println(i + "번 반복");
//		}
		
//		int i = 1;
//		for(; i <= repeat; ) {
//			System.out.println(i + "번 반복");
//			i++;
//		}
		
		int i = 1;
		for(; i <= repeat; i++) {
			System.out.println(i + "번 반복");
			i--;
		}
		
		in.close();
		
	}

}
