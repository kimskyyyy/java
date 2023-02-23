package arrays;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 배열의 길이를 입력하세요: ");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		System.out.println(length + "개의 배열이 생성되었습니다.");
		System.out.println("값을 입력하세요.");
		
		for(int i = 1; i < arr.length+1; i++) {
			System.out.print(i + "번째 값: ");
			arr[i-1] = sc.nextInt();
		}
		
		System.out.print("배열에 입력된 값은: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println("입니다.");
		
		
		for(int i = 0; i< arr.length -1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) { // 오름차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.print("정렬 후 값은: ");		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("입니다.");
		
		
		
		
		
	}

}
