package inheritance03;

public class PartTime extends Employee implements IEmployee {
	private int time;
	private int salary;
	
	public PartTime(String name, int time, int salary) {
		super(name); // 생성자 호출은 부모를 호출하거나 자식을 호출하거나 둘 중 하나만 호출가능 
//		this(); // 불가
		this.time = time;
		this.salary = salary;
	}	
	
	public int getSalary() {
		return time*salary;
	}	

}
