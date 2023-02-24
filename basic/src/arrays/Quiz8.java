package arrays;

public class Quiz8 {
	/*
	 * 1. 5 x 5 2차원 배열 2개 만들기
	 * 2. 배열 1에 0 ~ 9 범위 난수 채우기
	 * 3. 배열 2에 a ~ z 범위 소문자 알파뱃 채우기
	 */
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		char arr2[][] = new char[5][5];
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 9) + 1;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 아스키 코드 97은 소문자 a
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = (char)((Math.random() * 26) + 97);
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}
