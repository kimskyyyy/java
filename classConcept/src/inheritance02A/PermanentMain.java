package inheritance02A;

import java.util.ArrayList;

public class PermanentMain {
	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<>();
		
		emps.add(new Permanent("김변수", 3000000));
		emps.add(new Permanent("이상수", 4000000));
		emps.add(new Permanent("박참조", 5000000));
		emps.add(new PartTime("김파트", 160, 9500));
		emps.add(new PartTime("이파트", 160, 10000));
		emps.add(new PartTime("박파트", 160, 15000));
		
		for(Employee e : emps) {
			System.out.println("이름 : " + e.getName());
			System.out.println("급여 : " + e.getSalary()+"원");
		}
		
//		Employee emp1 = new Permanent("김변수", 3000000);
//		Employee emp2 = new Permanent("이상수", 4000000);
//		Employee emp3 = new Permanent("박참조", 5000000);
//	
//		Employee emp4 = new PartTime("김파트", 160, 9500);
//		Employee emp5 = new PartTime("이파트", 160, 10000);
//		Employee emp6 = new PartTime("박파트", 160, 15000);
		
//		System.out.println("이름 : " + emp1.getName());
//		System.out.println("급여 : " + emp1.getSalary()+"원");
//		System.out.println("이름 : " + emp2.getName());
//		System.out.println("급여 : " + emp2.getSalary()+"원");
//		System.out.println("이름 : " + emp3.getName());
//		System.out.println("급여 : " + emp3.getSalary()+"원");
//		System.out.println("이름 : " + emp4.getName());
//		System.out.println("급여 : " + emp4.getSalary()+"원");
//		System.out.println("이름 : " + emp5.getName());
//		System.out.println("급여 : " + emp5.getSalary()+"원");
//		System.out.println("이름 : " + emp6.getName());
//		System.out.println("급여 : " + emp6.getSalary()+"원");
		
	}
}
