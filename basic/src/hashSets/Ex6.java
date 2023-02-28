package hashSets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("1. 대부");
		hs.add("2. 반지의 제왕");
		hs.add("3. 겨울왕국");
		hs.add("4. 다크 나이트");
		hs.add("5. 해리포터 ");
		hs.add("6. 공공의 적");
		System.out.println(hs);
		
		Scanner input = new Scanner(System.in);
		System.out.println("삭제 할 책: ");
		String name = input.nextLine();
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			if(name.equals(it.next())) {
				System.out.println("삭제완료");
				it.remove();
			}
		}
		
	}


}
