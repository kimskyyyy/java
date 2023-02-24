package arrays;

public class Quiz5 {

	public static void main(String[] args) {
		int[] arr = new int[6] ;

		for (int i = 0; i < 6; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;

			// 중복 제거
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
			

		}
		
		
		for(int i = 0; i< arr.length -1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) { // 오름차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

}
