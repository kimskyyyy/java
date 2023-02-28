package hashSets;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex1 {
	// HashSet과 ArrayList 비교
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("라면");
		hs.add("김밥");
		hs.add("순대");
		hs.add("김밥"); // 중복 저장 x, 순서 보장 x
		System.out.println("HashSet: " + hs);
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("라면");
		arr.add("김밥");
		arr.add("순대");
		arr.add("김밥");
		System.out.println("ArrayList: " + arr);

	}

}
