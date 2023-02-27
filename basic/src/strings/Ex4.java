package strings;

public class Ex4 {

	public static void main(String[] args) {
		String str = new String(" Have a nice day  ");
		
		String result = str.trim(); // 양쪽 끝 공백 제거
		System.out.println("--" + str + "--"); // 원본 문자열 양쪽 끝에 '--'추가하여 출력
		System.out.println("--" + result + "--"); // 양쪽 끝 공백 제거 후 출력
		
		String[] split = result.split(" "); // 문자열 자르기, 기준은 " "
		
		// 기본 for문
//		for(int = 0; i < split.length; i++) {
//			System.out.println(split[i]);
//		}

		
		// 향상 for문
		for(String p: split) {
			System.out.println(p);
		}
		
		// 010-****-1234
		String replace =result.replace(" ", "^"); // 문자열 대치(?)
		System.out.println("result: " + result);
		System.out.println("replace: " + replace);
		
		
	}

}
