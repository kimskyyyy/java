package loopFor;

public class Quiz7 {

	// 이중 for문을 이용하여 출력하기
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 25; i += 5) {
			for (j = 0; j <= 4; j++)
				System.out.print(i + j + "\t");
			System.out.println();
		}

	}

}
