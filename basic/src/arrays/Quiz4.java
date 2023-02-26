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

		String[] week = {"금요일", "토요일", "일요일", "월요일", "화요일", "수요일", "목요일"};	// 	1월 1일이 토요일이라 금요일을 인덱스 0에 배치함
		int [] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int mon, day, totalDay = 0;


		while(true) {
			System.out.println("월 일 입력: ");

			try {
				mon = sc.nextInt();
				day = sc.nextInt();

			} catch (Exception e) {
				System.out.println("날짜를 확인해주세요.");
				continue;
			}

			if (mon >= 1 && mon <= 12 && day >= 1 && day <= month[mon-1])
				break;
		}

		for(int i = 0; i < mon-1; i++) {
			totalDay += month[i];
		}
		
		totalDay += day;
		int result = totalDay % 7;
		System.out.println(mon + "월 " + day + "일 " + week[result]);
		
	}

}
