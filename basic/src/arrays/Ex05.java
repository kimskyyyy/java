package arrays;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr =new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "번째 입력: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}
			
	}

}
