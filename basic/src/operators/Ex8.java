package operators;

public class Ex8 {

	public static void main(String[] args) {
		int data1 = 55, data2 = 22, or = 0, and = 0, xor = 0;
		/**
		 * data1 == 55(10) == 0011 0111(2)
		 * data2 == 22(10) == 0001 0110(2)
		 * or:				  0011 0111 == 55(1)
		 * and:				  0001 0110 == 22(10)
		 * xor:				  0010 0001 == 33(10)
		 */
		
		or = data1 | data2;
		and = data1 & data2;
		xor = data1 ^ data2;
		
		System.out.println("data1 | data2 = " + or);
		System.out.println("data1 & data2 = " + and);
		System.out.println("data1 ^ data2 = " + xor);
	}

}
