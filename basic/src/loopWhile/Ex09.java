package loopWhile;

import java.util.Random;

public class Ex09 {

	public static void main(String[] args) {
		Math.random(); // 실수, 범위: 0.0 < Math.random() < 1.0
		
		// 자료형 선택
		Random r = new Random();
		r.nextInt(); // 정수의 난수
		r.nextDouble(); // 실수의 난수
		
		
		for(int i = 1; i <= 3; i++)
			System.out.println(Math.random());
		
		for(int i = 1; i <= 3; i++)
			System.out.println((int)(Math.random() * 10) + 5); // 5 <= Math.random() * 10 < 15 정수
		
		for(int i = 1; i <= 3; i++)
			System.out.println((int)(Math.random() * 10)); // 0 <= Math.random() * 10 < 10 정수
		
		for(int i = 1; i <= 3; i++)
			System.out.println((int)(Math.random() * 100)); // 0 <= Math.random() * 100 < 100 정수, 개수는 100개
		
		System.out.println();
		for(int i = 1; i <= 3; i++)
			System.out.println(r.nextInt(10) + 11); // 0 <= r.nextInt(10) < 10 정수, 개수는 10개
		
		System.out.println();
		int begin = 33;
		int end = 89;
		for(int i = 1; i <= 3; i++)
			System.out.println(r.nextInt(end - begin + 1) + begin); //  시작값 ~ 끝값 랜덤
		
		System.out.println();
		for(int i = 1; i <= 3; i++)
			System.out.println((int)(Math.random() * (end - begin + 1)) + begin); //  시작값 ~ 끝값 랜덤
		

	
	
	}

}
