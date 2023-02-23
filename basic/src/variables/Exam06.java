package variables;

public class Exam06 {

	public static void main(String[] args) {
		byte b = 97;
		short s = 20;
		char c = 'A';
		float f = 1.23f;
		
		s = b;
		c = (char)b;
		s = (short)c;
		c = (char)s;
//		f = (float)5.11;
		f = (float)f;
	}

}
