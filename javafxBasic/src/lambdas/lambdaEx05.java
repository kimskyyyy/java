package lambdas;

interface ILambdaEx05<S> {
	void lambda(S data);
}

public class lambdaEx05 {

	public static void main(String[] args) {
//		ILambdaEx05<Integer> ex05 = (aaaaaa) -> {
		ILambdaEx05<String> ex05 = (aaaaaa) -> {
			System.out.println("메서드 호출: " + aaaaaa);
		};
		
//		ex05.lambda("문자열");
//		ex05.lambda(123);
		
		ex05 = aaaaaa -> {
			System.out.println("메서드 호출: " + aaaaaa);
		};
		
		ex05.lambda("문자열");
//		ex05.lambda(123);
	}

}
