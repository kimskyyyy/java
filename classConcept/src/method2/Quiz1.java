package method2;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 큰 수 구하기
		Max max = new Max();
		System.out.print("두 수 입력: ");
		max.setData1(sc.nextInt());
		max.setData2(sc.nextInt());
		
		System.out.printf("%d와 %d 중 큰 수: %d\n", 
				max.getData1(), max.getData2(), max.largeNumber());
		
		
		
		// 소수 판별
		Prime prime = new Prime();
		
		System.out.print("수 입력: ");
		prime.setData(sc.nextInt());
		
		if(prime.isPrime()) {
			System.out.println(prime.getData() + "은/는 소수이다.");
		} else {
			System.out.println(prime.getData() + "은/는 소수가 아니다.");
		}
	}

}
