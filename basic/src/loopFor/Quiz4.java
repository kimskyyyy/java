package loopFor;

import java.util.Scanner;

public class Quiz4 {

	/*
	 * 두 수의 최대 공약수를 구하는 프로그램 작성하기
	 * 최대공약수 = 공약수 중 가장 큰 수
	 * ex
	 *  1071과 1029의 최대공약수 21
	 *  78696과 19332의 최대공약수 36 
	 */
	
	 public static int gcd(int num1, int num2){
	        if(num2 == 0) return num1;
	        else return gcd(num2, num1 % num2);
	    }
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수 입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int gcd = gcd(num1, num2);
        System.out.println(gcd);
        System.out.println(num1 * num2 / gcd);
        
        
        sc.close();
		
		

	}

}
