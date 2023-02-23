package loopFor;

public class Ex02 {

	public static void main(String[] args) {
		int i, total = 0;
		
		for(i = 1; i <= 100; i++) {
			total = total +i;
		}
		System.out.println("for문이 종료된 후: " + i);
		System.out.println("1 ~ 100:" + total);
		
		total = 0;
		for(i = 333; i <= 897; i++) {
			total = total +i;
		}
		System.out.println("for문이 종료된 후: " + i);
		System.out.println("333 ~ 897:" + total);
	
		total = 0;
		for(i = 1; i <= 100; i += 2) {
			total = total + i;
		}
		System.out.println("for문이 종료된 후: " + i);
		System.out.println("1 ~ 100 홀수의 합: " + total);
		
		total = 0;
		for(i = 2; i <= 100; i += 2) {
			total = total +i;
		}
		System.out.println("for문이 종료된 후: " + i);
		System.out.println("1 ~ 100 짝수의 합: " + total);
		
		
		// for문 안에 if문을 넣어서 홀수의 합 구하기
		total = 0;
		for(i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				total = total + i;
			}
		}
		System.out.println("1 ~ 100 홀수의 합: " + total);
		
		
		// for문 안에 if문을 넣어서 홀수의 합과 개수 구하기
		total = 0;
		int count = 0;
		for(i = 1; i<= 100; i++) {
			if(i % 2 == 1) {
				total = total + i;
				count++;
			}
		}
		System.out.println("1 ~ 100 홀수의 합: " + total);
		System.out.println("1 ~ 100 홀수의 개수: " + count);
	}

}
