package method1;

public class Sub {
	// 접근제어자: private, default, protected, public
	// 예약어: 접근제어자, static, return, 반환자료형(void, 모든 자료형), final, this, super
	
	// 멤버필드, 멤버변수
	private String name;
	private int age;
	
	
	// 기본 생성자(클래스명과 이름이 같고, 반환형이 없음), 클래스가 만들어지면 자동으로 만들어지지만 다른 생성자가 만들어지는 경우 자동으로 만들어지지 않음!
	public Sub() {
		
	}
	
	// (매개변수 있는) 생성자
	public Sub(String name) {
		this.name = name;
	}

	// 메서드
	public void method01() {
		System.out.println("sub class안에 method01 실행");
	}
	
	public void method02() {
		System.out.println("sub class안에 method02 실행");
	}
	
	// method02() 메서드명은 같고, 매개변수 자료형이 다름
	public void method02(int data) {
		System.out.println("sub class안에 method02 실행");
	}
	
	// method02() 메서드명 같고, 매개변수 자료형이 다름
	public void method02(String data) {
		System.out.println("sub class안에 method02 실행");
	}
	
	// method02() 메서드명 같고, 매개변수 자료형, 개수가 다름
	public void method02(int data1, String data2) {
		System.out.println("sub class안에 method02 실행");
	}
	
	// method02() 메서드명 같고, 매개변수 개수 같고, 자료형도 같지만 매개변수 배치가 다름
	public void method02(String data1, int data2) {
		System.out.println("sub class안에 method02 실행");
	}
	
	public static void method03() {
		System.out.println("sub class안에 method03 실행");
	}
	
	
	
	
	


}
