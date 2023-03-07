package constructor;

public class PartTime {
	private String name;
	private int time;
	private int salary;
	
	public PartTime(String name, int time, int salary) {
		this.name = name;
		this.time = time;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}	
	
	public int getSalary() {
		return time*salary;
	}	

}
