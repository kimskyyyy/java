package arrays;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		arr[0] = 100;
		arr[1] = 100;
		arr[2] = 100;
		arr[3] = 100;
		arr[4] = 100;
//		arr[5] = 100; // Error. ArrayIndexOutOfBoundsException 배열 범위 초과
		
		System.out.println("arr[0]: " + arr[0]);
		System.out.println("arr[1]: " + arr[1]);
		System.out.println("arr[2]: " + arr[2]);
		System.out.println("arr[3]: " + arr[3]);
		System.out.println("arr[4]: " + arr[4]);
//		System.out.println("arr[5]: " + arr[5]); Error. ArrayIndexOutOfBoundsException 배열 범위 초과
		
	}

}
