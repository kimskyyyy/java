package loopFor;

import java.util.Scanner;

public class Quiz9 {

	/**
	 * 문제1
	 * 2에서부터 입력된 어떤 수까지 존재하는 소수를 모두 출력하는 프로그램 작성
	 * 
	 * 문제2
	 * 3x + 2y = 10의 해 구하기. 단 x, y는 정수이며 0 <= x, y <= 10을 만족함
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력해주세요: ");
		int end = sc.nextInt();
		
//		int i, j, count = 0;
//		for(i = 2; i < end; i++) {
//			for(j = 2; j < end ; j++) {
//				if(end % j == 0) {
//					count++;
//					if(count == 0) {
//						System.out.println(i);
//						System.out.println(num);
//					}
//				}
//				
//
//			}	
//			
//		}
		
		
		for(int i = 2; i <= end; i++) {
			boolean result = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					result = false;
				}
			}
			if(result) {
				System.out.println(i + " ");
			}
		}
		
		// 강사님 코드
		System.out.println("\n\n");
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if(3*x + 2*y == 10) {
					System.out.println(x + ", " + y);
				}
				
			}
		}

		
		// 내가한 코드
		int x, y;
		for(x = 1; x <= 10; x++) {
			for(y = 1; x <= 10; y++) {
				if(3*x + 2*y == 10) {
					System.out.println(x + ", " + y);
				}
			}
				
		}

		
		
		
	}

}
