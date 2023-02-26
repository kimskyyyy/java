package arrays;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int size = 3, idx = 0;
		String[] arr = new String[size];

		while(true) {
			for(int i = idx; i < arr.length; i++) {
				System.out.print("입력(현재 길이:" + arr.length + ") : ");
				arr[i] = sc.next();
				idx++;
				for(int j = 0; j < idx; j++) {
					System.out.print(arr[j] + ", ");
				}

				System.out.println();
			}

			String[] tmp = arr; // 기존 배열의 참조값을 tmp에 저장
			size += 3;
			arr = new String[size]; // 새로운 배열 생성

			for (int i = 0; i < tmp.length; i++) {
				arr[i] = tmp[i]; // 기존 배열에서 새로운 배열로 데이터 이동.
			}
			System.out.println("증가됨(" + size + ")");
		}
		


		
		
		

	
		
		
		
	}
	

}
