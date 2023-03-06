package method2;

public class Grade {
	private int data;
	private char grade;
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public char getGrade() {
		if(data >= 90 ) {
			grade = 'A';
		} else if(data >= 80) {
			grade = 'B';
		} else if(data >= 70) {
			grade = 'C';
		} else if(data >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}
	
	

}
