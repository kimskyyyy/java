package arrays;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== 아파트 입주자 정보 =====");
		System.out.println("건물의 층수를 입력하세요 : ");
		int length = input.nextInt();
		int[][] arr = new int[length][];
		String[][] nameArr = new String[length][];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "층의 총 호실 입력 : ");
			int n = input.nextInt();
			arr[i] = new int[n];
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "층은 " + arr[i].length + "호실 까지 있습니다.\n");
		}
		
		System.out.println();
		
		
		
		
		
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				
//				System.out.println(i + 1 + "층의 입주자 정보를 입력하세요.");
//				String name = input.nextLine();
//				arr[i][j] = nam;
//			}
//		}
		
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
