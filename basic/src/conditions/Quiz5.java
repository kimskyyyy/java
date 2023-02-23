package conditions;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학점을 입력해주세요 >> ");
		char grade = sc.next().toUpperCase().charAt(0);
		
		if(grade == 'A' || grade == 'B') {
			System.out.println("참 잘했어요.");
		} else if(grade == 'C' || grade == 'D') {
			System.out.println("분발합시다.");
		} else if(grade == 'F') {
			
		}
		
		sc.close();	
			
	}

}
