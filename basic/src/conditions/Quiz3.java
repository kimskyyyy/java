package conditions;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력: ");
		int data = sc.nextInt();
		
		String message = "";
		
		if(data > 0) {
			if(data % 3 == 0 && data % 4 == 0) {
				message = data + "은(는) 3의 배수이면서, 4의 배수입니다.";
			}else if(data % 3 == 0) {
				message = data + "은(는) 3의 배수입니다.";				
			}else if(data % 4 == 0) {
				message = data + "은(는) 4의 배수입니다.";
			}		
		} else if(data % 3 != 0 && data % 4 != 0) {
			message = data + "은(는) 3의 배수도 4의 배수도 아닙니다.";			
		}		
		else {
			message = "입력 데이터는 0입니다.";
		}	
		System.out.println(message);
		
		sc.close();
	} 	
}
