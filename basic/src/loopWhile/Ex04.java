package loopWhile;

public class Ex04 {

	public static void main(String[] args) {
		int data = 1, total = 0;
		do {
			total += data;
			data++;
		} while (data <= 10);
		
	System.out.println("합계: " + total);
	
	}

}
