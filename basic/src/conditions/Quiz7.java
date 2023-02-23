package conditions;

import java.util.Scanner;

public class Quiz7 {

	/*
	 * 문제1
	 * 과자 1개는 1,000원 
	 * 한번에 10개 이상 구매 시 전체 금액의 10% 할인
	 * 한번에 100개 이상 구매 시 전체 금액의 12% 할인
	 * 과자 개수를 입력 받아 금액 출력
	 * 
	 * 문제2
	 * 커피 1잔은 2,000원
	 * 10개 초과 시 초과하는 양에 대해서만 1잔 1,500원
	 * 커피 개수를 입력 받아 금액 출력
	 * 
	 * 문제3
	 * 30분 거리의 기본요금 30,000원
	 * 10분 단위로 추가요금 5,000원 부가 - > 입력값 10단위로 10으로 나누기 
	 * 시간을 입력받아 요금을 계산해주는 계산기 만들기(분단위)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과자 개수를 입력해주세요 >>> ");
		int data = sc.nextInt();
		int price = 0;
		
		if(data < 10) { 
			price = data*1000;
		} else if(data >= 100) { 
			price = data*(int)(1000*0.88); // 형변환 하지않으려면 data * 88 /100
		} else if(data >= 10) {
			price = data*(int)(1000*0.9);		
		}

		System.out.println("과자 " + data + "개의 금액은 " + price + "원 입니다." );		
		
		
		// 문제2
		System.out.println("커피 잔 수를 입력해주세요 >>> ");
		int coffee = sc.nextInt();
		int price2 = 0;
		
		if(coffee <= 10) {
			price2 = coffee*2000;			
		}else { 
			price2 = (coffee-10)*(int)(2000*0.75);			
		}
		
		System.out.println();
		System.out.println("커피 " + coffee + "잔의 금액은 " + price2 + "원 입니다." );		
		
		
		// 문제3
		System.out.println("이용 시간을 입력해주세요 >>> ");
		int time = sc.nextInt();
		int price3 = 0;
		
		if(time <= 30) {
			price3 = 30000;
		} else {
			price3 = ((time - 30) / 10 * 5000) + 30000;
		}
		
		System.out.println();
		System.out.println("이용 시간은 " + time + "분이며, 이용 금액은 " + price3 + "입니다.");	
		
		
		
		sc.close();
		
	}
	
	

}
