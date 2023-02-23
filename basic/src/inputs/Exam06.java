package inputs;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력: ");
		String tmp = sc.next();
		
		char data = tmp.charAt(0);
		System.out.println("문자 출력: " + data);
		
		sc.close();	
		
	}

}
