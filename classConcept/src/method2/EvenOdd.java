package method2;

public class EvenOdd {
	private int data;
	
	public void setData(int data) {
		this.data = data;
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
