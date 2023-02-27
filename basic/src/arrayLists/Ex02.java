package arrayLists;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		// <자료형> : 제너릭(Generic)
		// 자료형: Wrapper Class
		/*
		 * Wrapper Class  종류
		   - Byte
		   - Character
		   - Short
		   - Integer
		   - Long
		   - Float
		   - Double
		   - Boolean
		   
		   자료형을 지정하면 컴파일 단계에서 자료형 에러를 잡을 수 있음
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<>();// 뒤에 <Integer> 생략 가능
		
		list.add(123);
		list.add(456);
		list.add(1);
		
		Integer data1 = 123;
		Integer data2 = 456; 
		int data3 = 789; // int형도 Integer로 변환되서 들어감, 순수 데이터 저장 할 때 사용
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		
		
		System.out.println(list);
		
		int data4 = list.get(0);
		Integer data5 = list.get(1);
		Integer data6 = list.get(2);
		
		System.out.println(data4);
		System.out.println(data5);
		System.out.println(data6);
		
	}

}
