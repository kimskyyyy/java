package inheritance01;

public class Student extends Person {
	private String subject;		
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void info() {
		System.out.println("이름: " + super.getName());
		System.out.println("나이: " + super.getAge());
		System.out.println("과목: " + subject);
	}	

}
