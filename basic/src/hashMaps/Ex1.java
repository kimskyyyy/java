package hashMaps;

import java.util.HashMap;

public class Ex1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(0, "test");
		hm.put(1, "hello");
		
		System.out.println(hm.get(0)); // get(key) key값을 넣어서 value	반환
		System.out.println(hm.get(1));
	}

}
