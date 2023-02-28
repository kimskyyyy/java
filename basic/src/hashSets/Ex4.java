package hashSets;

import java.util.HashSet;

public class Ex4 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		System.out.println("isEmpty(): " + hs.isEmpty()); // HashSet이 비었는지 확인, 비었으면 true 반환
		
		boolean bool;
		bool = hs.add("라면"); System.out.println(bool);
		bool = hs.add("고길동"); System.out.println(bool);
		bool = hs.add("현대인"); System.out.println(bool);
		bool = hs.add("고길동"); System.out.println(bool); // 중복 데이터라서 데이터 추가 불가 false 반환
		
		System.out.println("isEmpty(): " + hs.isEmpty()); // HashSet이 비었는지 확인, 비어있지 않으면 false 반환
		
		if(hs.contains("고길동")) { // "고길동" 데이터 존재하는지 확인
			System.out.println("데이터가 존재합니다.");
		} else {
			System.out.println("데이터가 존재하지 않습니다.");
		}
		
	}

}
