package arrays;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int[] ints1 = new int[5];
		System.out.println("ints1: " + ints1);
		System.out.println("ints1: " + Arrays.toString(ints1));
		
		int[] ints2 = new int[] {1, 2, 3, 4, 5};
		System.out.println("ints2: " + ints2);
		
		int[] ints3 = {1, 2, 3, 4, 5}; // new int[] 생략 가능
		System.out.println("ints3: " + ints3);
		
		char[] chars1 = new char[5];
		System.out.println("chars1: " + chars1);
		
		char[] chars2 = new char[] {'a', 'b', 'c', 'd', 'e'};
		System.out.println("chars2: " + chars2);
		
		String[] strs1 = new String[5];
		System.out.println("strs1: " + strs1);
		
		String[] strs2 = new String[] {"111", "222", "333"};
		System.out.println(strs2);

		String[] strs3 = {"111", "222", "333"};
		System.out.println(strs3);
		
		
		
	}

}
