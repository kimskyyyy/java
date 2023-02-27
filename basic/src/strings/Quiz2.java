package strings;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		 * "It is a fun java programming" 문자열에서
		 * 'a'의 개수와 'g' 개수와 문자(공백을 제외한)의 총 개수를 출력하시오.
		 */
		
		String str = "It is a fun java programming";
		String result = "";
		int a = 0;
		int g = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				a++;
			}
		}
		System.out.println("a의 개수: " + a);
		
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'g') {
				g++;
			}
		}
		System.out.println("g의 개수: " + g);

		// 공백을 제거한 문자열 저장
		String[] split = str.split(" "); // 문자열 자르기, 기준은 " "	
		for(String p: split) {
			result += p;
		}	
		
		
		System.out.println("공백을 제외한 문자의 총 개수: " + result.length());
		
		
		
		
		// for문 한번에 돌려서 구하기
		a = 0;
		g = 0;
		int space = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {	
				a++;
			} else if(str.charAt(i) == 'g') {
				g++;
			} else if(str.charAt(i) != ' ')
				space++;			
		}
		
		System.out.println("a의 개수: " + a);
		System.out.println("g의 개수: " + g);		
		System.out.println("공백을 제외한 문자의 총 개수: " + space);
		
		
	}

}
