package inheritance02A;

// 추상 클래스: 추상 메서드를 갖고 있는 클래스
public abstract class Employee {
	// 생성자 이용하는 방법
	private String name;	

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	// 메서드 -> 추상케서드
	// 메서드: 필수로 정의하지 않아도 된다면 추상 메서드아닌 그냥 일반 메서드 정의
//	public int getSalary() {
//		return 0;
//	}
	
	// 추상메서드: 내용은 없음! 내용은 자식이 필수로 정의
	public abstract int getSalary();
}
