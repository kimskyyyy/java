package arrays;

public class Ex06 {

	public static void main(String[] args) {
		int[] arr = {4, 8, 2, 7, 6};
		
		for(int i = 0; i< arr.length -1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) { // 오름차순
				if(arr[i] < arr[j]) { //내림차순
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
