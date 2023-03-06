package method2;

public class Max {
	private int data1, data2;
	int largeNumber;
	
	public void setData1(int data) {
		this.data1 = data;
	}
	
	public void setData2(int data) {
		this.data2 = data;
	}
	
	public int getData1() {
		return data1;
	}
	
	public int getData2() {
		return data2;
	}
	
	public int largeNumber() {
		if(data1 > data2) {
			largeNumber = data1;
		} else if (data1 < data2) {
			largeNumber = data2;
		} 
		
		return largeNumber;
	}
	
	

}
