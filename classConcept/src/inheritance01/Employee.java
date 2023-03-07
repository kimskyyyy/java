package inheritance01;

public class Employee  extends Person {
	private String dept;
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void info() {
		System.out.println("이름: " + super.getName());
		System.out.println("나이: " + super.getAge());
		System.out.println("부서: " + dept);
	}

}
