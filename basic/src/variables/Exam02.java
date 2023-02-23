package variables;

public class Exam02 {

	public static void main(String[] args) {
		int data = 123, result;
		char ch = 'D';
		
		data = data + 10;
		
		// cf. 유니코드 A의 값 65, D는 68
		ch = 'D' + 3;
		
		result = data + ch;
		
		System.out.println("data = " + data);
		System.out.println("ch = " + ch);
		System.out.println("ch = " + (int)ch);
		System.out.println("result = " + result);
	}

}
