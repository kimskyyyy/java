package operators;

public class Ex9 {

	public static void main(String[] args) {
		int data = 1;			// 0000 0001 == 1	
		
		data = data << 1;		// 0000 0010 == 2
		System.out.println("1. data <<= 1 : " + data);
		
		data = data <<= 1;		// 0000 0100 == 4
		System.out.println("2. data <<= 1 : " + data);
		
		data = data <<= 3 ;		// 0010 0000 == 32
		System.out.println("3. data <<= 3 : " + data);
		
		
		data = data >>= 1;		// 0001 0000 == 16
		System.out.println("1. data >>= 1 : " + data);
		
		data = data >>= 1;		// 0000 1000 == 8
		System.out.println("2. data >>= 1 : " + data);
		
		data = data >>= 1;		// 0000 0100 == 4
		System.out.println("3. data >>= 1 : " + data);
	}

}
