package arrays;

import java.util.Scanner;

public class Quiz2 {

	/*
	  국어, 영어, 수학, 총점, 평균을 구하는 프로그램 작성
	  0 ~ 100사이 점수만 입력되도록 구현
	  과목들 배열로 만들기
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String[] subjects = {"국어", "영어", "수학"}; //  과목만 추가/삭제하면 다른 코드 변경없어도 됨
		int scores[] = new int[subjects.length + 1];
		
		for(int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i] + " 점수: ");
			try {
				scores[i] = sc.nextInt();
			} catch(Exception e) {
				sc.nextLine();
				continue;
			}
			
			if (scores[i] < 0 && scores[i] > 100) {
				System.out.println("0 ~ 100사이 점수를 입력해주세요.");
				continue;
			}

			// 배열의 마지막 인덱스에는 점수 합계를 넣어줌
			scores[scores.length-1] += scores[i];
		}

		System.out.println("총점: " + scores[scores.length-1]);
		System.out.println("평균: " + (scores[scores.length-1])/3);

		
	}

}
