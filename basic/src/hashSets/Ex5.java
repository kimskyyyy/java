package hashSets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Ex5 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("1. 대부");
		hs.add("2. 반지의 제왕");
		hs.add("3. 겨울왕국");
		hs.add("4. 다크 나이트");
		hs.add("5. 해리포터 ");
		hs.add("6. 공공의 적");
		
		
		System.out.println();
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String data2 = it.next();
			System.out.println(data2);
		}
		
		System.out.println();
		ArrayList<String> list = new ArrayList<>(hs);
		System.out.println(list);
		list.sort(null); // 오름차순 정렬
		System.out.println(list);

		Collections.sort(list); // 오름차순 정렬
		System.out.println(list);		
		Collections.reverse(list); // 내림차순 정렬(오름차순 정렬 후 reverse해서 내림차순의 결과를 얻음)
	}

}
