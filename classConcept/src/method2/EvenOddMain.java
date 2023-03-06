package method2;

public class EvenOddMain {

	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		
		eo.setData(10);
		if(eo.result())
			System.out.println(eo.getData() + "은/는 " + "짝수입니다.");
		else
			System.out.println(eo.getData() + "은/는 " + "홀수입니다.");
		
		eo.setData(11);
		if(eo.result())
			System.out.println(eo.getData() + "은/는 " + "짝수입니다.");
		else
			System.out.println(eo.getData() + "은/는 " + "홀수입니다.");
	}

}
