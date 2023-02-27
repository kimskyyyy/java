package arrayLists;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		// add(Object e), Object형이기 때문에 원하는 자료형 자유롭게 넣을 수 있음
		list.add(123);
		list.add(1.23);
		list.add("문자열");
		
		System.out.println("저장된 데이터: " + list);
		
//		int data = list.get(0); // error. Object형의 자료형이 int형에 넣을 수 없음
		int data1 = (int)list.get(0); // 강제형변환 cast하면 가능
		double data2 = (double)list.get(1); // 강제형변환(cast)하면 가능
		String data3 = (String)list.get(2); // 강제형변환(cast)하면 가능
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}

}
