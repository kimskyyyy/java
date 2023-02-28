package hashSets;

import java.util.HashSet;

public class Ex3 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		boolean bool;
		bool = hs.add("라면"); System.out.println(bool);
		bool = hs.add("고길동"); System.out.println(bool);
		bool = hs.add("현대인"); System.out.println(bool);
		bool = hs.add("고길동"); System.out.println(bool); // 중복 데이터라서 데이터 추가 불가 false 반환
		
		System.out.println("HashSet: " + hs);
		System.out.println(hs.remove("라면")); // 데이터가 있고 삭제가 완료되면 true 반환
		System.out.println(hs.remove("김밥")); // 데이터가 없어서 삭제하지 못한 경우 false 반환
		System.out.println("HashSet: " + hs);
	}

}
