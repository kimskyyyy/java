package hashSets;

import java.util.HashSet;

public class Ex2 {

	public static void main(String[] args) {
		HashSet hs = new HashSet(); // 지네릭스 지정 안하면 Object형식으로 넣을 수 있음(권장하지 않음)
		
		hs.add(123);
		hs.add(1.23);
		hs.add("순대");
		hs.add(1.23);
		
		System.out.println("HashSet: " + hs);
	}

}
