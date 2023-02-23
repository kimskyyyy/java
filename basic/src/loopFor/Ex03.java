package loopFor;

public class Ex03 {

	public static void main(String[] args) {
		int i, oddTotal, evenTotal;
		
		oddTotal = 0;
		evenTotal = 0;
		for(i = 1; i <=100; i++) {
			if(i % 2 == 1)
				oddTotal += i;
			else
				evenTotal = evenTotal + i;
		}
		System.out.println("1 ~ 100 홀수 합계: " + oddTotal);
		System.out.println("1 ~ 100 짝수 합계: " + evenTotal);
	}

}
