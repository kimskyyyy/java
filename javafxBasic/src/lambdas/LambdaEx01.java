package lambdas;

interface ILambdaEx01 {
	void lambda();
}

// 구현체 따로 만들어서 구현하기
class LambdaImplEx01 implements ILambdaEx01 {

	@Override
	public void lambda() {
		System.out.println("메서드 호출");		
	}
	
}
public class LambdaEx01 {

	public static void main(String[] args) {
		LambdaImplEx01 ex01 = new LambdaImplEx01();
		ex01.lambda();

	}

}
