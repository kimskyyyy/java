package hashSets;

import java.util.ArrayList;
import java.util.HashSet;

public class Quiz1 {

	public static void main(String[] args) {
		/*
		 * HashSet을 이용하여 로또 번호 6개 출력하기(1-45)
		 */
		
		// 방법1
		boolean bool;
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0; i < 6; i++) {
			bool = hs.add((int)(Math.random()*45) +1);
			if(bool == false) {
				i--;
			}
		}
		ArrayList<Integer> list = new ArrayList<>(hs);
		list.sort(null); // 오름차순 정렬
		System.out.println(list);
		
		
		// 방법2
		HashSet<Integer> hs2 = new HashSet<>();
		while(hs2.size() != 6) {
			hs2.add((int)(Math.random()*45) +1);
		}			
		
		ArrayList<Integer> list2 = new ArrayList<>(hs2);
		list2.sort(null); // 오름차순 정렬
		System.out.println(list2);
	}

}
