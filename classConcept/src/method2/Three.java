package method2;

public class Three {

	private int data;
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public boolean result() {
		if(data % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
