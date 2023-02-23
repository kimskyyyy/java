package operators;

import java.util.Scanner;

public class Quiz {

	/**
	 * 수를 입력받아 짝/홀수 구분하여 출력
	 * 수를 입력받아 3의 배수 참/거짓 구분하여 출력
	 * 두 수를 입력 받아 큰 수를 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		
		String result1 = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(num + " 은/는 " + result1);	
		
		String result2 = (num % 3 == 0) ? "3의 배수 이다." : "3의 배수가 아니다.";
		System.out.println(num + " 은/는 " + result2);
		
		System.out.print("두 수 입력 : ");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();		
		
		System.out.println("data: " + data1 + "," + "data2: " + data2 );
		
		int result3 = (data1 > data2) ? data1 : data2;
		System.out.println(data1 + "와/과 " + data2 + " 중 큰 수는 " + result3 + "입니다.");
				
		
		sc.close();
		

		
	}

}
