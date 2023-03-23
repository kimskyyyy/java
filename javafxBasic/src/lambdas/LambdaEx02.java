package lambdas;

interface ILambdaEx02 {
	void lambda();
}

public class LambdaEx02 {
	public static void main(String[] args) {
		ILambdaEx02 ex02 = new ILambdaEx02() {
			// 오버라이드해서 구현하기
			@Override
			public void lambda() {
				System.out.println("메서드 호출");				
			}			
		};
		
		ex02.lambda();
	}
}
