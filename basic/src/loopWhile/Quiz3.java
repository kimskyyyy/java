package loopWhile;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
 
		/*
		 * 369게임
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요: ");
		int num = sc.nextInt();
		System.out.println("입력한 숫자: " + num);
		
		int clap = 0;
		int tmp = 0; // 몇자리 수가 들어올지 몰라서 임시로 넣어두는 변수
		
		for(int i = 1; i <= num; i++) { // 1 ~ 9
			while(true) {
				tmp = i % 10; // 123 % 10 = 3 => 마지막 자리수 3, 12 % 10 = 2 => 둘째 자리수, 1 % 10 = 1 => 첫째 자리수
				if(tmp == 3 || tmp == 6 || tmp == 9) {
					clap += 1;		
					System.out.println(i+ "일때 "+ "박수 횟수: " + clap);
				}
				tmp /= 10; // 123 / 10 = 12, 12 / 10 = 2, 1 / 10 = 0 


				if(tmp == 0)
					break;
			}
					
		}
		
		System.out.println("박수 횟수: " + clap);
		
		
		// 강사님 코드
		System.out.println("입력: ");
		int end = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= end; i++) {
			int j =i;
			while(true) {
				tmp = j % 10;
				if(tmp == 3 || tmp == 6 || tmp == 9) {
					count++;
					System.out.println(i + " ");
				}
				j /= 10;
				if(j==0)
					break;
			}
		}
		System.out.println("3, 6, 9의 개수: " + count);
		
		


	}

}
