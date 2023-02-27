package arrays;

import java.util.Scanner;

public class Quiz13A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 과목 배열
		String[] subjects = new String[] { "국어", "영어" };

		// 학급 수 입력 받기
		System.out.print("총 학급 수: ");
		int classCount = input.nextInt();
		
		// 학생 이름 넣을 studentNames 2차원 배열 생성, 행 수: 학급 수
		String[][] studentNames = new String[classCount][];
		
		// 점수 넣을 scores 3차원 배열 생성, 
		int[][][] scores = new int[classCount][][];

		for (int i = 0; i < studentNames.length; i++) {
			System.out.print(i + 1 + "반 인원 수: ");
			int peopleCount = input.nextInt();
			studentNames[i] = new String[peopleCount];
			scores[i] = new int[peopleCount][subjects.length + 3];
		}

		for (int i = 0; i < studentNames.length; i++) {
			for (int j = 0; j < studentNames[i].length; j++) {
				System.out.print(i + 1 + "반의 " + (j + 1) + "번 째 학생이름:  ");
				studentNames[i][j] = input.next();
				int sum = 0;
				for (int k = 0; k < subjects.length; k++) {
					System.out.print(subjects[k] + ": ");
					scores[i][j][k] = Integer.parseInt(input.next());
					sum += scores[i][j][k];
				}
				scores[i][j][subjects.length] = sum;
			}
		}
		
		// 석차 저장 영역 1로 초기화 
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j][subjects.length+1] = 1;
				scores[i][j][subjects.length+2] = 1;
			}
		}
		
		// 반 석차
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				for (int k = 0; k < scores[i].length; k++) {
					if (scores[i][j][subjects.length] < scores[i][k][subjects.length])
						scores[i][j][subjects.length + 1]++;
				}
			}
		}
		
		// 전교 석차
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				for (int k = 0; k < scores.length; k++) {
					for (int l = 0; l < scores[k].length; l++) {
						if (scores[i][j][subjects.length] < scores[k][l][subjects.length])
							scores[i][j][subjects.length + 2]++;
					}
				}
			}
		}

		System.out.println("이름\t국어\t영어\t총점\t반석차\t전교석차\t평균");
		for (int i = 0; i < studentNames.length; i++) {
			for (int j = 0; j < studentNames[i].length; j++) {
				System.out.print(studentNames[i][j] + "\t");
				for (int k = 0; k < scores[i][j].length; k++) {
					System.out.print(scores[i][j][k] + "\t");
				}
				System.out.print((double) (scores[i][j][subjects.length] / subjects.length));
				System.out.println();
			}

		}

	}
}

