package loopFor;

import java.util.Scanner;

public class Quiz8 {

	// 별찍기, 홀수를 입력받아 형태 만들기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("홀수를 입력하세요: ");
		int line = sc.nextInt();		
		
		int i, j, star, space;
		star = 1;
		space = line - 1;
		for (i = 0; i < line; i++) {		
			if(i < Math.round(line/2)) {
				for (j = 0; j < space ; j++) {
					System.out.print(" ");
				}
				
				for (j = 0; j < star; j++)
					System.out.print("*");
				
				star += 2;
				space--;
				
			} else {
				for (j = 0; j < space ; j++) {
					System.out.print(" ");
				}
				
				for (j = 0; j < star; j++)
					System.out.print("*");
				
				star -= 2;
				space++;
				
			}		
			
			
			System.out.println();		

			
		}
		
		
		// 강사님 코드
		star = 1;
		space = line / 2;
		for (i = 0; i < line; i++) {
			for (j = 0; j < space ; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < star; j++)
				System.out.print("*");
			
			System.out.println();
			
			if(i < line / 2) { 				
				star += 2;
				space--;
				
			} else {
				star -= 2;
				space++;				
			}		
			
		}
		
		
		space = 1;
		star = line - 1;
		for (i = 0; i < line; i++) {		
			if(i < Math.round(line/2)) {
				for (j = 0; j < star/2 ; j++) {
					System.out.print("*");
				}
				
				for (j = 0; j < space; j++)
					System.out.print(" ");
				
				for (j = 0; j < star/2 ; j++) {
					System.out.print("*");
				}
				
				star -= 2;
				space += 2;
				
			} else {
				for (j = 0; j < star/2; j++) {
					System.out.print("*");
				}
				
				for (j = 0; j < space ; j++) {
					System.out.print(" ");
				}
				
				for (j = 0; j < star/2; j++) {
					System.out.print("*");
				}

				
				star += 2;
				space -= 2;
				
			}		
			
			
			System.out.println();		

			
		}
		
		
		// 강사님 코드
		space = 1;
		star = line / 2;
		for (i = 0; i < line; i++) {
			for (j = 0; j < star ; j++) {
				System.out.print("*");
			}
			
			for (j = 0; j < space; j++)
				System.out.print(" ");
			
			for (j = 0; j < star ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			if(i < line / 2) { 				
				space += 2;
				star--;
				
			} else {
				space -= 2;
				star++;				
			}		
			
		}
		
		
		
		
		
		
		

	}

}
