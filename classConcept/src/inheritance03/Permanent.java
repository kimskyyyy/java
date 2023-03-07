package inheritance03;

public class Permanent extends Employee implements IEmployee {
	private int salary;
	
	public Permanent(String name, int salary) {
		super(name);
		this.salary = salary;
	}	
	
	public int getSalary() {
		return salary;
	}
}
