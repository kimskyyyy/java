package loopFor;

public class Ex07 {

	public static void main(String[] args) {
		
		int i, j, count = 0;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 10; j++) {
				count += 1;
			}
		}
		System.out.println("하위 for문 count: " + count);
	}

}
