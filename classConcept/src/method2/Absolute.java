package method2;

public class Absolute {
	private int data;
	private int result;

	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public int absNumber() {
		if(data < 0) {
			data = data * -1;
			result = data;
		} else {
			result = data;
		}
		return result;
	}
	
	
}
