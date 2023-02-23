package conditions;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력: ");
		int select = sc.nextInt();
		
		switch (select) {
			case 1:
				System.out.println("case 1: " + select);
				break;
			case 2:
				System.out.println("case 2: " + select);
				break;
			case 3:
				System.out.println("case 3: " + select);
				break;
			default:
				System.out.println("default: ");
		
			
			
			
		}
		System.out.println("다음 문장");
		
		
		sc.close();
	}

}
