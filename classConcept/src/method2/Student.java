package method2;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// alt + shift + s -> generate getters and setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public int getTotal() {
//		return getKor() + getEng() + getMath();
		return kor + eng + math;
	}
	
	public double getAverage() {
		double average = getTotal() / 3.0;
		String result = String.format("%.2f", average);
		average = Double.parseDouble(result);
		return average;
	}

}
