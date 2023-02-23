package conditions;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수 입력: ");
		String select = sc.next();
		
		switch (select) {
		case "1": System.out.println("case 1: " + select); break;
		case "2": System.out.println("case 2: " + select); break;
		case "3": System.out.println("case 3: " + select); break;
		default: System.out.println("default: 1, 2, 3이 아닌 수");
		}
		
		System.out.println("다음 문장");		
		
		sc.close();
	}

}
