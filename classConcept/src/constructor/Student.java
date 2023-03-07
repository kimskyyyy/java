package constructor;

public class Student {
	private String name;
	private int kor, eng, math, total;
	private double average;
	
	// alt + shift + s -> Generate Constructors using Fields...
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotal() {
		setTotal();
		return total;
	}
	
	private void setTotal() {
		this.total = kor + eng + math;
	}
	
	public double getAverage() {
		average = (kor + eng + math) / 3.0;
		String result = String.format("%.2f", average);
		average = Double.parseDouble(result);
		return average;
	}

	
}







