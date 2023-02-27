package strings;

public class Ex3 {

	public static void main(String[] args) {
		String str = "abc defg";
		
		System.out.println(str.length()); // 문자열의 길이
		System.out.println(str.charAt(str.length()-1));  // 인덱스는 0부터 시작하기 때문에 길이 -1
		System.out.println(str.charAt(0) == 'a');
		System.out.println(str.charAt(0) == 'c');
		System.out.println(str.charAt(0) - 32); // 소문자 a는 97, 97-32 = 65
		System.out.println((char) (str.charAt(0) - 32)); // 65는 대문자 A
		
		String addStr;
		addStr = "";
		System.out.println(addStr);
		addStr += "b";
		System.out.println(addStr);
	}

}
