package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("김상수");
		list.add("이변수");
		list.add("박참조");
		list.add("조클래스");
		list.add("지컬렉션");
		
		// 현재 리스트 출력
		System.out.println(list);
		
		// 변경할 인덱스 입력 받음
		System.out.println("변경할 위치: ");
		Scanner input = new Scanner(System.in);
		int index = input.nextInt();
		
		// 변경할 데이터 입력 받음
		System.out.println("변경 데이터: ");
		String element = input.next();
//		list.set(index,  element); // update
		list.add(index, element); // insert
		
		// 변경된 리스트 출력
		System.out.println(list);
		System.out.println("====== 결과 ======");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
			
		
	}

}
