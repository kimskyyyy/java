package loopFor;

public class Quiz5 {

	// 구구단
	public static void main(String[] args) {
		int i, j;
		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++)
				System.out.println(i + " * " + j + " = " + i * j);
			System.out.println();
		}
	}

}
