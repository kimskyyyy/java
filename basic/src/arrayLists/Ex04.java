package arrayLists;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		String data1 = "김변수";
		String data2 = "이변수"; 
		String data3 = "박변수"; 
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		list.add("최변수");
		
		// 향상 for문 사용
		for(String s : list) {
			System.out.println(s);
		}
		
		// 인덱싱 for문 사용
		System.out.println("size(): " + list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}


}
