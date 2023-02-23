package conditions;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력: ");
		char select = sc.next().charAt(0);
		
		switch (select) {
			case 'a':
				System.out.println("case a: " + select);
				break;
			case 'A':
				System.out.println("case A: " + select);
				break;
			case '0':
				System.out.println("case 0: " + select);
				break;
			default:
				System.out.println("default: a, A, 0이 아닌 수 ");			
			
			
		}
		
		System.out.println("다음 문장");
		
		sc.close();
	}


}
