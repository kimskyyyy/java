package arrayLists;

import java.util.ArrayList;

public class Ex07 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		String data1 = "김변수";
		String data2 = "이변수"; 
		String data3 = "박변수"; 
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		list.add("최변수");
		
		System.out.println("담겨 있는 모든 데이터: " + list);
		System.out.println("데이터 존재 유무: " + list.isEmpty());
		list.clear();
		System.out.println();
		System.out.println("담겨 있는 모든 데이터: " + list);
		System.out.println("데이터 존재 유무: " + list.isEmpty());
		
	}

}
