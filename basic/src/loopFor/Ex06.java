package loopFor;

public class Ex06 {

	public static void main(String[] args) {
		
		for(int i = 1; ; i++) { // 비어있는 경우 true로 간주하여 무한 반복 => for 문의 식은 선택사항(없어도 문제 발생하지 않음)
			System.out.println(i + "번째 출력");
			
//			조건문에 작성하지 않고, if문으로 i 값이 10000일 때 break
//			if(i == 10000)
//				break;
			

		}
	}

}
