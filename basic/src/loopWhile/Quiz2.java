package loopWhile;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		 * 쌀 102통(102KG), 1통 == 1kg
		 * 쥐 1마리가 20g 쌀먹음, 쥐 2마리 있음, 1일 40, 2일 80, 3일 120, 4일 160 => 
		 * 10일 마다 쥐가 2배씩 증가함, day*10 10일마다 쥐가 2배 # 1일 2마리, 10일 4마리, 20일에 8마리, 30일 16마리 => 쥐*2
		 * 며칠만에 창고의 쌀이 모두 쥐의 먹이가 될까?
		 * 그리고 쥐는 총 몇마리???
		 */
		
		int rice = 102000;
		int mouse = 2;
		int day = 0;
		while(rice > 0) {
			rice = rice - (mouse * 20);
			day = day + 1;
			
			if(day % 10 == 0) {
				mouse = mouse * 2;
			}
			
		}
		System.out.println("day: " + day + "\nmouse: " + mouse);
		
		
		
		/*
		 * 1*2-2*3+3*4-4*5+5*6-...와 같은 규칙으로 합계를 구할 때 합이 100이 넘는 마지막 수 2개를 구하는 프로그램 작성
		 */
		
		int odd = 1;
		int even = 2;
		int sum = 0; // 작은합계
		int sw = 0;
		while(true) {
			if(sw == 0) {
				sum = sum + (odd * even);
				sw = 1;
			} else {
				sum = sum - (odd * even);
				sw = 0;
			}	

			if (sum >= 100)
				break;
			odd++;
			even++;
			
		}
		System.out.println("\n수1: " + odd + "\n수2: " + even);		
		
		
		
		int data = 1, total = 0;
		while(true) {
			if(data % 2 == 1) {
				total += data * (data + 1);
			} else {
				total -= data * (data + 1);
			}
			if (total > 100)
				break;
				data++;
		}
		System.out.println("\n합: " + total);
		System.out.println("마지막 두 수: " + data + ", " + (data + 1));

	}

}
