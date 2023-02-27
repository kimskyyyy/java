package strings;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String data1 = "문자열";
		String data2 = new String("문자열");
		
		char[] datas = {'문', '자', '열'}; 
		String data3= new String(datas); // 배열 문자형 데이터를 String 으로
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		System.out.println("data2: " + data2);
	}

}
