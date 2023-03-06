package method1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); // 필요 시 메모리에 올려서 사용
		list.add("asd");
		
		Scanner sc = new Scanner(System.in); // cf. Sanner()는 기본생성자 없음
		sc.next();
		
		Random r = new Random();
		r.nextInt();
		
		Math.random(); // static 메서드(프로그램 시작부터 끝까지 메모리에 올라와있음, 자주사용되는 것들)
		System.out.println();
		
		Sub.method03();
		
		Sub sub = new Sub();
		sub.method01();
		sub.method02(); // 필요 시 메모리에 올려서 사용(부하가 생길 수 있으나 메모리 공간을 차지하지 않는 장점이 있음)
		sub.method03(); // 가능하나 warning, static 메서드이므로 Sub.method03(); 로 호출하는 것을 권장
		
		
		// println() 다형성
		System.out.println();
		System.out.println(10);
		System.out.println('a');
		
		
		
		// Object는 최상위 클래스이기 때문에 Object를 상속받아 다양한 형태의 데이터를 넣을 수 있음 => 다형성
		Object intData = 10;
		Object doubleData = 10.123;
		Object strData = "string";
		
	}

}
