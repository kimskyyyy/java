package arrays;

import java.util.Scanner;

public class Quiz3 {

	/*
	  입력 받은 수 만큼 배열을 할당하고, 배열에 값 입력 및 출력하기
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 배열의 길이를 입력: ");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		System.out.println(length + "개의 배열이 생성되었습니다.");
		System.out.println("데이터를 입력하세요.");
		
		for(int i = 1; i < arr.length+1; i++) {
			System.out.print(i + "번째 데이터: ");
			arr[i-1] = sc.nextInt();
		}
		
		System.out.print("배열 데이터: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("입니다.");
		
//		for(int data : arr) {
//			System.out.println("배열 데이터: " + data + "입니다.");
//		}
		
		
	}

}
