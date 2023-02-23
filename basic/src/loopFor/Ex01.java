package loopFor;

public class Ex01 {

	public static void main(String[] args) {
		int i;
		// 0 1 2 3 4 5
		for(i = 0 ; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("for문이 종료 된 후: " + i);
	
		// 1 2 3 4 5
		for(i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		for(i = 11; i <= 20; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		for(i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		for(i = 20; i <= 10; i--) {
			System.out.print(i + " ");
		}
		
	}

}
