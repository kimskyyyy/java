package arrays;

public class Quiz9 {
	public static void main(String[] args) {
		int arr[][] = new int[5][6];		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 45) + 1;
				
				// 중복 제거
				for(int z = 0; z < j; z++) {
					if(arr[i][z] == arr[i][j]) {
						j--;
						break;
					}
				}
			}
		}
		
		// 오름차순 정렬
//		for(int i = 0; i< arr.length -1; i++) {
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) { // 오름차순
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
		
		
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}		
	}
}
