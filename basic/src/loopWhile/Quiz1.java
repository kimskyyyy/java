package loopWhile;

import java.util.Scanner;

public class Quiz1 {

	/*
	 * 문제1
	 * 영문자 'q'가 입력될 때 까지 반복 수행하기
	 * 
	 * 문제2
	 * 입력된 수의 각 자리수의 합을 구하는 프로그램 작성하기
	 * 
	 * 문제3
	 * 입력된 수를 거꾸로 정수형 변수에 담아 출력
	 * 예) 123 -> 321
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// 문제1
		while(true) {
			System.out.println("영문자를 입력하세요: ");
			char data = sc.next().toLowerCase().charAt(0);
			System.out.println("출력: " + data);
			if(data == 'q')
				break;			
		}

		
		
		// 문제2
		int total = 0;
		System.out.println("정수 입력: ");
		int data = sc.nextInt();
		System.out.println(data);
		
		while(true) {
			total = total + data % 10; // 123 % 10 = 3, 12 % 10 = 2, 1 % 10 = 1
			data /= 10;
			if(data == 0);
			break;
		} 
		System.out.println("의 각 자리수 합계: " + total);
		
		
		// 문제3
		total = 0;
		System.out.println("정수 입력: ");
		data = sc.nextInt();
		System.out.print(data);
		
		while(true) {
			total = total + data % 10; // 123 % 10 = 3 => 마지막 자리수 3, 12 % 10 = 2 => 둘째 자리수, 1 % 10 = 1 => 첫째 자리수
			data /= 10; // 123 / 10 = 12, 12 / 10 = 2, 1 / 10 = 0 
			if(data == 0)
				break;
			// 3 * 10 = 30, 32 * 10 = 320
			total *= 10;
		}
		System.out.println("의 거꾸로 된 정수: " + total);
				
		

	}

}
