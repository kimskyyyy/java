package lambdas;

interface ILambdaEx03{
	void lambda();
}

// 람다식으로 구현하기
public class LambdaEx03 {
	public static void main(String[] args) {
		ILambdaEx03 ex03 = () -> {
			System.out.println("메서드 호출");
		};
		ex03.lambda();
	}

}
