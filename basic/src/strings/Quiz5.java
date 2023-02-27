package strings;

public class Quiz5 {

	public static void main(String[] args) {
		/*
		 * String str = "김개똥 -2017년 \n홍길동구리 -2015년 \n선우선녀 -2018년";
		 */
		
		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
		System.out.println("====변경 전 str====");
		System.out.println(str);
		
		str = str.replace("-", ":");
		str = str.replaceAll("[0-9][0-9][0-9][0-9]", "1999");
		System.out.println("====변경 후 str====");
		System.out.println(str);


		

	}

}
