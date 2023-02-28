package hashMaps;

import java.util.HashMap;

public class Ex3 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("선풍기", 10);
		map.put("에어컨", 100);
		map.put("건조기", 100);
		
		System.out.println("선풍기: " + map.get("선풍기") + "만원");
		System.out.println("선풍기: " + map.get("에어컨") + "만원");
		System.out.println("선풍기: " + map.get("건조기") + "만원");
		System.out.println("선풍기: " + map.get("없는키") + "만원"); // key가 없는 경우 null로 출력됨
	}

}
