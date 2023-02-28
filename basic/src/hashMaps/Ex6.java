package hashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		
		map.put("선풍기", "10");
		map.put("에어컨", "100");
		map.put("건조기", "100");
		map.put("선풍기", "1000");
		
		Iterator<String> itk = map.keySet().iterator();
		
		while(itk.hasNext()) {
			String key = itk.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		Iterator<String> itv = map.values().iterator();
		while(itv.hasNext()) { // hasNest() 메서드는 읽어 올 요소가 있으면 true 없으면, false 반환 
			String value = itv.next(); // next()메서드는 다음 요소를 읽어온다
			System.out.println(value);
		}
	}

}
