package output;

public class Exam03 {

	public static void main(String[] args) {
		double data1 = 10;
		double data2 = 3;
		
		// 소수점 이하 16자리
		System.out.println(data1 / data2);
		
		// 소수점 이하 0자리
		System.out.printf("%.0f", data1 / data2);
		System.out.println();
		System.out.printf("%.1f", data1 / data2);
		System.out.println();
		System.out.printf("%.2f", data1 / data2);
		System.out.println();
		System.out.printf("%.3f", data1 / data2);
		
		String.format("%.3f", data1 / data2);
		

		System.out.println();
		System.out.println("-------------");
		
		int data3 = 7;
		
		System.out.println(data3);
		System.out.printf("%02d", data3);
		
		System.out.println(data3);
		System.out.printf("%03d", data3 + 4);
	}

}
