package method2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		 * 절대값을 구하는 함수를 정의하시오(Absolute.java)
		 * 
		 * 점수를 입력 받아 A ~ F학점을 출력하시오. (Grade.java)
		 * -90이상 A, 80 이상 B, 70 이상 C, 60이상 D, 그 외 F
		 */

		Scanner sc = new Scanner(System.in);
		
		// 절대값 구하기
		Absolute absolute = new Absolute();
		System.out.print("숫자를 입력하세요: ");
		absolute.setData(sc.nextInt());
		
		System.out.printf("%d의 절대값: %d\n", absolute.getData(), absolute.absNumber());
		
		
		// 학점 출력
		Grade grade = new Grade();
		System.out.print("점수를 입력하세요: ");
		grade.setData(sc.nextInt());
		
		System.out.printf("%d점의 학점: %s\n", grade.getData(), grade.getGrade());
		
		
		
	}

}
