package arrays;

import java.util.Scanner;

public class Quiz4 {

	/*
	  두 수 a, b를 입력받아 2023년 a월 b일이 무슨 요일인지 출력하기
	  2023년 1월 1일은 토요일이라고 가정함
	  
	  연도 입력 안받아서 윤년구하기 제외함
	  입력 예외처리해야함

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 일 입력: ");
		int month = sc.nextInt();
		int day = sc.nextInt();
		int totalDay = 0;
		int result = 0;
		
		String[] week = {"금요일", "토요일", "일요일", "월요일", "화요일", "수요일", "목요일"};		
		
		for(int i = 1; i < month; i++) { // N월 전까지 일수 구하기 
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				totalDay += 31;
			} else if(i == 4 || i == 6 || i == 9 || i == 11) {
				totalDay += 30;
			} else {				// 2월
				totalDay += 28;			
			}				
		}
		
		totalDay += day;
		result = totalDay % 7;
		System.out.println(month + "월 " + day + "일 " + week[result]);		
		
	}

}
