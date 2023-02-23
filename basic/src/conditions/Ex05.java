package conditions;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int data1, data2, max, min;
		
		System.out.println("두 수 입력: ");
		data1 = input.nextInt();
		data2 = input.nextInt();
		
		if(data1 > data2) {
			max = data1;
			min = data2;
		} else {
			max = data2;
			min = data1;
		}
		
		System.out.println("max: " + max + ", min: " + min);
		
		input.close();
	}

}
