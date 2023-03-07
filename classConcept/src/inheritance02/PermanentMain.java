package inheritance02;

public class PermanentMain {
	public static void main(String[] args) {
		Permanent permanent1 = new Permanent("김변수", 3000000);
		Permanent permanent2 = new Permanent("이상수", 4000000);
		Permanent permanent3 = new Permanent("박참조", 5000000);
		
		System.out.println("이름: " + permanent1.getName());
		System.out.println("급여: " + permanent1.getSalary() + "원");
		
		System.out.println("이름: " + permanent2.getName());
		System.out.println("급여: " + permanent2.getSalary() + "원");
		
		System.out.println("이름: " + permanent3.getName());
		System.out.println("급여: " + permanent3.getSalary() + "원");
		
		// 3명의 이름, 시간, 시급 입력
		// 3명의 이름, 급여 출력
		
		PartTime partTime1 = new PartTime("김파트", 160, 9500);
		PartTime partTime2 = new PartTime("이파트", 160, 10000);
		PartTime partTime3 = new PartTime("박파트", 160, 15000);
		
		System.out.println("이름: " + partTime1.getName());
		System.out.println("급여: " + partTime1.getSalary() + "원");
		
		System.out.println("이름: " + partTime2.getName());
		System.out.println("급여: " + partTime2.getSalary() + "원");
		
		System.out.println("이름: " + partTime3.getName());
		System.out.println("급여: " + partTime3.getSalary() + "원");
	}
}
