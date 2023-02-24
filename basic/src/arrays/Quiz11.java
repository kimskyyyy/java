package arrays;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {		
		String[] arr = {"", "", ""};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print("\n입력(현재길이:" + arr.length + ") : ");		
				arr[i] = (sc.next()) + ",";
				for(int j = 0; j < arr.length; j++) {
					System.out.print(arr[j]);					
				}
			}			
		}
		


		
		
		

	
		
		
		
	}
	

}
