package conditions;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("세 수 입력: ");
		int data1 = input.nextInt();
		int data2 = input.nextInt();
		int data3 = input.nextInt();
		int max= data1; 
		int min = data2;		
		
		if(data1 < data2) {
			max = data2;
			min = data1;
		} 		
		
		if(max < data3) {
			max = data3;
		} else if(min > data3) {
			min = data3;
		}
		
		System.out.println(data1 + ", " + data2 + ", " + data3 + "중 최대값: " + max);
		System.out.println(data1 + ", " + data2 + ", " + data3 + "중 최소값: " + min);

		input.close();
		
	}

}
