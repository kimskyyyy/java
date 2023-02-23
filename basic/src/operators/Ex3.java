package operators;

public class Ex3 {

	public static void main(String[] args) {
		// 논리 연산자 
		// || 하나라도 true인 경우 true
		System.out.println("false || false: " + (false || false));
		System.out.println("false || true: " + (false || true));
		System.out.println("true || false: " + (true || false));
		System.out.println("true || true: " + (true || true));		
		
		System.out.println();
		// && 둘 다 true인 경우 true
		System.out.println("false && false: " + (false && false));
		System.out.println("false && true: " + (false && true));
		System.out.println("true && false: " + (true && false));
		System.out.println("true && true: " + (true && true));
		
		System.out.println();
		System.out.println("!true: " + !true);
		
		System.out.println("!false: " + !false);

	}

}
