package output;

public class Exam01 {

	// 실행: ctrl + F11
	public static void main(String[] args) {
		// 출력 후 개행(줄바꿈) 있음
		System.out.println("화면에 출력하는 기능");
		
		// 출력 수 개행(줄바꿈) 없음
		System.out.print("화면에 출력하는 기능");
		
		// 출력 수 개행(줄바꿈) 없음, formatString(서식문자) 사용 할 수 있음
		System.out.printf("화면에 출력하는 기능");
		
		/*
		 * 서식문자
		 * %d: 정수 출력
		 * %s: 문자열 출력
		 * %f: 실수 출력
		 * %.2f: 소수점 두 자리까지 출력
		 * %02d: 숫자를 출력할 때 두자리 구성해서 출력
		 * %04d: 숫자를 출력할 때 네자리 구성해서 출력
		 * %02d and %04d: 출력할 데이터가 두 자리, 네 자리 보다 적다면 0으로 채워서 출력
		 */


	}

}
