package conditions;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("연도: ");
		int year = input.nextInt();
		String message = "평년";
		
//		if(year % 4 == 0 && year % 100 == 0) {
//			if(year % 400 == 0) {
//				System.out.println(year + "년은 윤년입니다.");
//			} else {
//				System.out.println(year + "년은 평년입니다.");
//			}
//		} else if(year % 4 == 0) {
//			System.out.println(year + "년은 윤년입니다.");
//		}
//		
//		System.out.println(year + "년은 평년입니다.");
//		
		
		if(year % 4 == 0) {
			message = "윤년";
			if(year % 100 == 0) {
				message = "평년";
				if(year % 400 == 0)
					message = "윤년";
			}
		}
		System.out.println(year + "년은 " + message + "입니다.");
		
		input.close();
		
	}
	

}
