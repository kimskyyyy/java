package conditions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = 0;
		
		System.out.print("수 입력 : ");
		try {
			data = sc.nextInt();
			// 예외가 발생할 코드
		}catch (InputMismatchException e) {
			// 예외가 발생 했을 때 동작할 코드를 작성한다.
			System.out.println("문의하세요. 입력 값을 확인 후 다시 시도하세요.");
			System.exit(0);// 프로그램을 종료
		}catch (NumberFormatException e) {
			// 예외가 발생 했을 때 동작할 코드를 작성한다.
			System.out.println("문의하세요. 입력 값을 확인 후 다시 시도하세요.");
			System.exit(0);// 프로그램을 종료
		}catch (Exception e) {
			// 예외가 발생 했을 때 동작할 코드를 작성한다.
			System.out.println("문의하세요. 입력 값을 확인 후 다시 시도하세요.");
			System.exit(0);// 프로그램을 종료
		}
		
		String message;
		
		if(data > 0) {
			if(data % 2 == 0) {
				message = data + "는(은) 양의 짝수입니다.";
			}else {
				message = data + "는(은) 양의 홀수입니다.";
			}
		}else if(data < 0) {
			if(data % 2 == 0) {
				message = data + "는(은) 음의 짝수입니다.";
			}else {
				message = data + "는(은) 음의 홀수입니다.";
			}
		}else {
			message = "입력 데이터는 0입니다.";
		}
		System.out.println(message);
		
		sc.close();

	}
}
