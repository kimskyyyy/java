package conditions;

import java.util.Scanner;

public class Quiz1 {

	/**
	 * 수를 입력받아 3의 배수인 경우 출력
	 * 입력 받은 수의 절대값 출력
	 * 두 수를 입력 받아 큰 수 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		int num = sc.nextInt();
		
		if(num % 3 == 0) 
			System.out.println(num + "은/는 3의 배수이다.");
		
		if(num > 0)
		System.out.println(num + "의 절대값은 " + num);
		
		if(num < 0)
		System.out.println(num + "의 절대 값은 " + -(num));
		
		
		if(num < 0) {
			num = -num;
			System.out.println(num + "의 절대값은 " + num);			
		}
		
		
		System.out.print("두 수 입력 : ");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();		
	
		if(data1 > data2)
			System.out.println(data1 +  "와/과 " + data2 + " 중 큰 수는 " + data1 + "입니다.");
		
		System.out.println(data1 + " 와/과 " + data2 + " 중 큰 수는 " + data2 + "입니다.");
							
		
		sc.close();
		
	}

}
