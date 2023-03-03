package method1;

public class Sub {
	// 접근제어자: private, default, protected, public
	// 예약어: 접근제어자, static, return, 반환자료형(void, 모든 자료형), final, this, super
	
	// 멤버필드, 멤버변수
	private String name;
	private int age;
	
	
	// 생성자(클래스명과 이름이 같고, 반환형이 없음)
	public Sub() {
		
	}

	// 메서드
	public void method01() {
		System.out.println("sub class안에 method01 실행");
	}
	
	public void method02() {
		System.out.println("sub class안에 method02 실행");
	}
	
	public static void method03() {
		System.out.println("sub class안에 method03 실행");
	}
	
	
	
	
	


}
