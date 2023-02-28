package hashMaps;

import java.util.HashMap;

public class Ex2 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put(0, 1000);
		hm.put(1, "hello");
		hm.put("naver", "https://www.naver.com");
		
		// HashMap은 '{}'괄호 안에 출력됨
		System.out.println(hm.get(0));
		System.out.println(hm.get(1));
		System.out.println(hm.get("naver"));
		System.out.println(hm);
	}

}
