package conditions;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력: ");
		int data = sc.nextInt();
		if (data %3 == 0) {
			System.out.println(data + "은/는 3의 배수입니다.");
		} else {
			System.out.println(data + "은/는 3의 배수가 아닙니다.");
		}
		
		sc.close();		
	}

}
