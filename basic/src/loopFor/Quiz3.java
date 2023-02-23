package loopFor;

import java.math.BigInteger;

public class Quiz3 {

	public static void main(String[] args) {
		/*
		 * 문제1
		 * 1 ~ 1000까지의 자연수 중 4로 나누어도, 6으로 나누어도 나머지가 1인 수의 합 출력
		 */		
		int i;		
		int total = 0;
		for(i = 1; i <= 1000; i++) {
			if(i % 4 == 1 && i % 6 == 1) { // i % 12 == 0으로 표현 가능
				total += i;
			}
		}
		System.out.println("1 ~ 1000 사이 자연수 중 4와 6으로 나누었을 때 나머지가 1인 수의 합: " + total);
		
		
		/*
		 * 문제2
		 * 첫날 1원 저축, 둘째날은 전날의 두배 저축하는 방식으로 30일 동안 저축한 금액 구하기
		 */
		total = 1;
		for(i = 1; i <= 30; i++) { // i가 일
			for(int j = 2; j <= 2; j++) {
				total = total * j;
			}
			
			/*
			 * 1일 1원
			 * 2일 2원
			 * 3일 4원
			 * 4일 8원
			 */
		}
		System.out.println("총금액: " + total + "원");
		
		
		// 강사님 코드
		
		
		
		/*
		 *  문제3
		 *  체스판 첫번째 사각형에는 밀알 1개
		 *  체스판 두번째 사각형에는 밀알 2개
		 *  체스판 세번째 사각형에는 밀알 4개
		 *  ...
		 *  체스판 n번째 사각형에는 밀알 n개
		 *  총 64 개의 밀알을 채울 때, 밀알의 총계 구하기
		 */
		
		int seed = 1;
		int total1 = 0;
		for(i = 1; i <= 64; i++) {
			total1 += seed;
			seed *= 2;
			System.out.println(i + "번째 사각형: " + total1);			
		}
		System.out.println("총개수: " + total);
		
		
		
		// 큰 수 처리
//		BigInteger milTotal = new BigInteger("0");
			BigInteger milTotal = BigInteger.ZERO;
			BigInteger milSeed = BigInteger.ONE;
			BigInteger two = new BigInteger("2");
			
			for(i = 1; i <= 64; i++) {
				milTotal = milTotal.add(milSeed);
				milSeed.multiply(two);
				System.out.println(i + "번째 사각형: " + milTotal);
			}
			System.out.println("밀알 총 개수: " + milTotal);
		
		
	}
	

	

}
