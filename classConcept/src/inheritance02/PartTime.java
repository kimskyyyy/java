package inheritance02;

public class PartTime extends Employee {
	private int time;
	private int salary;
	
	public PartTime(String name, int time, int salary) {
		super.setName(name);
		this.time = time;
		this.salary = salary;
	}	
	
	public int getSalary() {
		return time*salary;
	}	

}
