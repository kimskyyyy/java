package loopFor;

public class Quiz1 {

	public static void main(String[] args) {
		/*
		 * 문제1. 다음과 같이 출력 
		 * 1. hello
		 * 2. hello
		 * 3. hello
		 * 4. hello
		 * 
		 */
		int i;
		for(i = 1; i <= 4; i++) {
			System.out.println(i + ". hello");
		}
		
		
		// 문제2. 1 ~100 까지 합 중 그 합이 528일 때 i값 출력		
		int total = 0;
		for(i = 1; i <= 100; i++) {
			total = i + total;
//			total += i;
			if(total == 528) {
				System.out.println("\n 1 ~ 100 까지 합이 528 일 때 i의 값: " + i + "\n");
				break; // 합이 528일 될 때 까지 반복, 100까지 반복하지 않도록 break 
			}
		}
		
		// 문제3. for문을 이용하여 5단위로 출력
		for(i = 1; i <= 25; i++) {
			System.out.print(i + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}

}
