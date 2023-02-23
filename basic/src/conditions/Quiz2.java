package conditions;

import java.util.Scanner;

public class Quiz2 {

	/**
	 * 수를 입력받아 5의 배수이다/아니다 구분하여 출력
	 * 입력 받은 수가 0보다 크고 100보다 작으면 적중범위, 아니면 비적중범위 출력
	 * 수를 입력 받아 짝수이고 3의 배수이다/아니다 구분하여 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		int num = sc.nextInt();		
		if(num % 5 == 0) { 
			System.out.println("입력: " + num + ", 결과: 5의 배수입니다.");
		} else {
			System.out.println("입력: " + num + ", 결과: 5의 배수가 아닙니다.");
		}
		
		
		System.out.print("수 입력: ");
		int num2 = sc.nextInt();
		if(0 < num2 && num2 < 100) {
			System.out.println("입력: " + num2 + ", 결과: " + num2 + " 은/는 적중범위입니다.");
		} else {
			System.out.println("입력: " + num2 + ", 결과: " + num2 + " 은/는 비적중범위입니다.");
		}
		
		System.out.print("수 입력: ");
		int num3 = sc.nextInt();		
		if(num3 % 2 == 0 && num3 % 3 == 0) { 
			System.out.println("입력: " + num3 + ", 결과: " + num3 + " 은/는 짝수이고 3의 배수입니다.");
		} else {
			System.out.println("입력: " + num3 + ", 결과: " + num3 + " 은/는 짝수이고 3의 배수가 아닙니다.");
		}
		
		sc.close();		
		
		
		
		
	}

}
