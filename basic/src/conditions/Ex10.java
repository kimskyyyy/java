package conditions;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("수 입력 : ");
		String tmp = "";
		int data = 0;
		tmp = sc.next(); // 문자열
//		data = Integer.parseInt(tmp);
		try {
			data = Integer.parseInt(tmp);
		} catch (Exception e) {
			e.printStackTrace();
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
