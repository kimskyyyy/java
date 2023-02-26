package arrays;

public class Quiz9 {
	public static void main(String[] args) {
		int arr[][] = new int[5][6];		
		
		for(int i = 0; i < arr.length; i++) { // 행 반복
			for(int j = 0; j < arr[i].length; j++) { // 열 반복
				arr[i][j] = (int)(Math.random() * 45) + 1;
				
				// 중복 제거
				for(int z = 0; z < j; z++) {
					if(arr[i][z] == arr[i][j]) {
						j--;
						break;
					}
				}
			}

			// 오름차순 정렬
			for(int j = 0; j < arr[i].length; j++) {
				for(int z = 0; z < j; z++) {
					if(arr[i][z] > arr[i][j]) {
						int tmp = arr[i][z];
						arr[i][z] = arr[i][j];
						arr[i][j] = tmp;
					}
				}
			}
		}

		// 출력 반복
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}		
	}
}
