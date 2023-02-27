package strings;

public class Quiz1 {

	public static void main(String[] args) {
		/*
		 * "Have a nice day Have a nice day Have a nice day"
		 * 위 문자열에서 a의 위치를 저장하여 출력하시요.
		 * 결과: 1, 5, 13, 17, 21, 29, 33, 37, 45
		 */
		// 내가 작성한 코드
		String str = "Have a nice day Have a nice day Have a nice day";
		
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				result = result + i + " ";
			}
		}
		System.out.println(result);
		
		
		
		// 배열에 넣는 코드
		int[] indexs = new int[str.length()];
		int index = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a')
				indexs[index++] = i;
		}
		
		for(int i = 0; i < index; i++)
			System.out.print(indexs[i] + " ");
		System.out.println();
		
	}
	
	


}
