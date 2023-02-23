package loopFor;

import java.util.Scanner;

public class Quiz10 {

	/*
	 * 1 ~ 1000 사이에 있는 자연수에 대하여 자기 자신의 수를 제외한 모든 약수의 합이 자신과 같아지는 수(완전수) 구하기
	 * 예) 6의 약수 = 1, 2, 3, 6
	 * 자기 자신을 뺀 합계가 자신이 나오는 경우 완전수
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 1000사이 수를 입력해주세요: ");
		int num = sc.nextInt();
		
		// 약수구하기
		int i, total = 0;
		for(i = 1; i < num; i++) {
			if(num % i == 0) {
				total += i;
				System.out.print(i + " ");
				if(total == num) {
					System.out.println( "\n" + num + "의 완전수는 " + total);
				}
			}
		}

		
		for(i = 1; i < 1000; i++) {
			total = 0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					total += j;
					if(i == 6 || i == 28 || i == 496) {
						System.out.print(j + " ");
					}			
			}
							
		}
			if(total == i)
				System.out.println("\n" + i);
		}
		
		sc.close();		
	}

}
