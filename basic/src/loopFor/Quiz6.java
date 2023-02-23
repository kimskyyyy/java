package loopFor;

public class Quiz6 {

	// 이중 for문을 이용하여 출력하기
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++)
				System.out.print(i * j + "\t");
			System.out.println();
		}
	}

}
