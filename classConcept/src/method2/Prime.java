package method2;

public class Prime {
	private int data;
	private boolean result = true;
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public boolean isPrime() {
		for(int i = 2; i < data; i++) {
			if(data % i == 0)
				result = false;
		}
		
		return result;
	}

}
