package arrays;

import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] age = new int[5];
		
		for(int i = 1; i < name.length+1; i++) {
			System.out.println(i + "번째 정보 입력");
			System.out.print("이름: ");			
			name[i-1] = sc.next();
			System.out.print("나이: ");	
			age[i-1] = sc.nextInt();
		}
		
//		for(int i = 0; i < name.length; i++) {
//			System.out.print("\n" + i + "정보\n이름: " + name[i] + ", 나이: " + age[i] + "세");			
//		}
		
		
		for(int i = 0; i< age.length -1; i++) {
			for(int j = i + 1; j < age.length; j++) {
				if(age[i] > age[j]) { // 오름차순
					int tmp = age[i];
					age[i] = age[j];
					age[j] = tmp;
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		
		System.out.print("\n나이 순으로 정렬: ");		
		for(int i = 0; i < age.length; i++) {
			int sort = i + 1;
			System.out.print("\n" + sort + "정보\n이름: " + name[i] + ", 나이: " + age[i] + "세");
		}

		
		
		
		
		
	}

}
