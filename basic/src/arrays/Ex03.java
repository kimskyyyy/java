package arrays;

public class Ex03 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println("arr.length: " + arr.length);
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = (i+1)*100;

		for(int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "]: " + arr[i]);
		
		/*
		  향상 for문
		  for(배열에 저장된 데이터를 저장할 변수 : 배열(두 개 이상 데이터 저장소)) {
		  
		  }
		 */
		
		for(int data : arr) {
			System.out.println(data);
		}

		
	}

}
