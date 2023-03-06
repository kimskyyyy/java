package loopFor;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		 * 문제1
		 * 1 ~ 1000까지 합 구하기
		 * 3의 배수이면 제외하고, 3의 배수이면서 5의 배수인 것은 합함
		 */
		
		// 3과 5의 배수의 합계
		int i;
		int total = 0;
		for(i = 1; i <= 1000; i++) {
			if(i % 15 == 0) {
				total += i; 
			}				
		}
		System.out.println("1 ~ 1000까지 3과 5의 배수의 합계: " + total + "\n");
		
		
		// 1부터 1000까지 1씩 증가할 때, 3의 배수 제외하고 3과 5의 배수 합계는 합해서 계산
		total = 0;
		for(i = 1; i <= 1000; i++) {
			if(i % 3 != 0) {
				total += i;
			} else if(i % 5 == 0)
				total +=i;
		}
		System.out.println("1 ~ 1000까지 3의 배수는 제외하고, 3과 5 배수의 합계: " + total + "\n");
		
		
		/*
		 * 문제2
		 * 1부터 시작하여 홀수의 합이 10000을 넘지 않는 마지막 홀수 구하기
		 */
		total = 0;
		for(i = 1; ; i += 2) {
			total += i;
			if(total >= 10000)
				break;
		}
		System.out.println("마지막 홀수: " + i);
		
		
		/*
		 * 문제3
		 * 두 수를 입력 받아 작은수 ~ 큰수의 합계 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("\n두 수를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int max, min = 0;
		
		if(num1 > num2) {
			max = num1;
			min = num2;			
		} else {
			max = num2;
			min = num1;
		}
		
		total = 0;
		for(i = min; i <= max; i++) {
			total += i;			
		}
		System.out.println("합계: " + total);

		
		/*
		 * 강사님 답안
		 */
		int small = sc.nextInt();
		int big = sc.nextInt();
		
		if(small > big) {
			int tmp = small;
			small = big;
			big = tmp;
		}
		
		total = 0;
		for(i = small; i <= big; i++) {
			total += i;
		}
		
		System.out.println(small + " ~ " + big + "의 합계: " + total);
		
		
		
		
		
		/*
		 * 문제4
		 * 수를 입력 받아 소수인지 아닌지 판별
		 * 소수 7이라면 2 ~ 6으로 나누어 나머지 0이 한번도 없는 것
		 */
		
		System.out.println("\n수를 입력해주세요.");
		int num3 = sc.nextInt();
		String result = "";
		int count = 0;
		
		for(i = 2; i < num3; i++) {
			if(num3 % i == 0) {		
				count += i;
			} 			
		}
		if (count > 0) {
			result = "소수가 아닙니다.";
		} else {
			result = "소수입니다.";
		}
		
		System.out.println("\n" + num3 + " 은/는 " + result);
		
		
		/*
		 * 강사님 답안
		 */
		System.out.println("수 입력: ");
		int data = sc.nextInt();
		
		boolean result1 = true;
		for(i = 2; i < data; i++) {
//			System.out.println(data + " % " + i + " = " + (data % i));
			if(data % i == 0)
				result1 = false;
		}
		
		if(result1 == true) {
			System.out.println(data + "은/는 소수이다.");
		} else {
			System.out.println(data + "은/는 소수가 아니다.");
		}
		
		sc.close();
		
		
		
		
	}
	

}
