package arrays;

public class Ex07 {

	public static void main(String[] args) {
		int arr[][] = new int[][] {
			{10,20,30},
			{40,50,60},
			{70,80,90}
		};
		
		// for문 이용해서 출력하기
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// for문 이용하지 않고 출력하기
		System.out.print(arr[0][0] + " ");
		System.out.print(arr[0][1] + " ");
		System.out.print(arr[0][2] + " ");
		System.out.println();
		System.out.print(arr[1][0] + " ");
		System.out.print(arr[1][1] + " ");
		System.out.print(arr[1][2] + " ");
		System.out.println();
		System.out.print(arr[2][0] + " ");
		System.out.print(arr[2][1] + " ");
		System.out.print(arr[2][2] + " ");
		System.out.println();
	}

}
