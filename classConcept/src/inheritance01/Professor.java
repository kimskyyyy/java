package inheritance01;

public class Professor extends Person {
	private String major;
		
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void info() {
		System.out.println("이름: " + super.getName());
		System.out.println("나이: " + super.getAge());
		System.out.println("전공: " + major);
	}

}
