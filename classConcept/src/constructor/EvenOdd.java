package constructor;

public class EvenOdd {
	private int data;
	
	// 기본 생성자
	public EvenOdd() {	
		// 처음 인스턴스가 되면서 준비할 내용
	}
	
	// 생성자
	public EvenOdd(int data) {
		this.data = data;	
		result();
	}
	
	
	public int getData() {
		return data;
	}
	
	// 짝수면 true, 홀수면 false
	public boolean result() {
		if(data % 2 == 0)
			return true;
		else
			return false;
	}

}
