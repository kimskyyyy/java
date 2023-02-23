package inputs;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		String data;
		
		System.out.print("데이터 입력: ");
		// input.next(): 공백과 줄바꿈을 입력 문자열의 끝으로 사용
		data = sc.next();
		System.out.println("입력 받은 데이터: " + data);
		
		sc.nextLine(); // 위에서 입력했던 데이터가 buffer에 남아 있기에 buffer 청소용 
		System.out.println("데이터 입력: ");
		// input.nextLine(): 줄바꿈만 입력 문자열의 끝으로 사용
		data = sc.nextLine();
		System.out.println("입력 받은 데이터: " + data);
		
		sc.close();
	}

}
