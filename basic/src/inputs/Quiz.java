package inputs;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? ");
		String name = sc.nextLine();	
		
		System.out.print(name + "님의 국어 점수: ");
		int score1 = sc.nextInt();
		
		System.out.print(name + "님의 영어 점수: ");
		int score2 = sc.nextInt();
		
		System.out.print(name + "님의 수학 점수: ");
		int score3 = sc.nextInt();
		
		System.out.println("=================");
		System.out.println("이  름\t: " + name);
		System.out.println("=================");
		System.out.println("국  어\t: " + score1);
		System.out.println("영  어\t: " + score2);
		System.out.println("수  학\t: " + score3);
		System.out.println("=================");
		System.out.println("합  계\t: " + (score1 + score2 + score3));
		System.out.println("=================");
		
		
		sc.close();
		
	}

}
