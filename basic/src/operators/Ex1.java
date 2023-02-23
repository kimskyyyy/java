package operators;

public class Ex1 {

	public static void main(String[] args) {
		int data1 = 9, data2 = 2;

		System.out.println(data1 + " + " + data2 + " = " + (data1 + data2));
		System.out.println(data1 + " - " + data2 + " = " + (data1 - data2));
		System.out.println(data1 + " * " + data2 + " = " + (data1 * data2));
		System.out.println(data1 + " / " + data2 + " = " + (data1 / data2)); // 몫
		System.out.println(data1 + " % " + data2 + " = " + (data1 % data2)); // 나머지
		/*
		 * 배수, 약수, 소수, 수의 범위
		 * 
		 * x % 2 = 0,1
		 * 2 % 2 = 0
		 * 3 % 2 = 1
		 * 4 % 2 = 0
		 * 5 % 2 = 0
		 * 
		 * x % 3 = 0, 1, 2
		 * 3 % 3 = 0
		 * 4 % 3 = 1
		 * 5 % 3 = 2
		 * 6 % 3 = 0
		 * 
		 * 수의 범위
		 * x % 100 = 0~99
		 * 
		 * 약수 x % (1~x) = 0
		 * 6 % 1 = 0
		 * 6 % 2 = 0
		 * 6 % 3 = 0
		 * 6 % 4 = 2
		 * 6 % 5 = 1
		 * 6 % 6 = 0
		 * 
		 * 소수 x % (1과 자기자신을 제외한 범위의 수)로 나누었을때 나머지가 0이 없는 수는 소수.
		 * 7 % 2 = 1
		 * 7 % 3 = 1
		 * 7 % 4 = 3
		 * 7 % 5 = 2
		 * 7 % 6 = 1
		 */
	}
}
