package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

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
		
		System.out.println("현재 입력된 데이터의 수: " + list.size());
		System.out.println("담겨 있는 모든 데이터: " + list);
		System.out.print("데이터 확인: ");
		String tmp = sc.next();
		
		// contains() 메서드를 이용해서 리스트 포함 여부 확인
		if(list.contains(tmp)) {
			System.out.println(tmp + "은(는) 존재합니다.");
		} else {
			System.out.println(tmp + "은(는) 존재하지 않습니다.");
		}
	}

}
