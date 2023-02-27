package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();

		String data1 = "김변수";
		String data2 = "이변수"; 
		String data3 = "박변수"; 
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		list.add("최변수");
		
		System.out.println("list.indexOf(\"최변수\"): " + list.indexOf("최변수")); // 해당 데이터의 인덱스 출력
		System.out.println("list.indexOf(\"최상수\"): " + list.indexOf("최상수")); // 데이터가 존재하지 않으면 -1 출력
		System.out.print("데이터 확인: ");
		String tmp = sc.next();

		// indexOf() 사용 이유: 데이터가 포함 되어있는지 확인하고, 데이터를 가지고 오는 것까지 하기 위해서 인덱스 값이 필요함 
		// add(index, data), set(index, data), get(index) 등의 메서드에 사용할 수 있음
		int index = list.indexOf(tmp);
		if(index != -1) {
			System.out.println(list.get(index) + "는 존재합니다.");
		} else {
			System.out.println(tmp + "는 존재하지 않습니다.");
		}
		
		
		// 데이터 활용 없이 출력하기
		System.out.println();
		if(list.indexOf(tmp) != -1) {
			System.out.println(tmp + "는 존재합니다.");
		} else {
			System.out.println(tmp + "는 존재하지 않습니다.");
		}
		
		
		

	}

}
