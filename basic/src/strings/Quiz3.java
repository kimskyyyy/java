package strings;

public class Quiz3 {

	public static void main(String[] args) {
		/*
		 * "FF590-2DX83-M81LZ-XDM7E-MKUT4" 문자열에 있는 정수의 합계를 구하세요.
		 *  ex) 590 + 283 + 81 + 7 + 4 = 965
		 */
		
		String str = "FF590-2DX83-M81LZ-XDM7E-MKUT4";
		
		String strDatas[] = str.split("-");
		
		int index = 5;
		int sum = 0;
		String result = "";
		
		String test = "590";
		sum = Integer.parseInt(test);
		System.out.println(test);
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 0-9) {
				
			} else {
				
			}
			
		}
		
		
		String[] split = str.split("-");
		for(String p: split) {
			result += p;
		}
//		System.out.println(result);
		
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '-') {
				i++;
				String restr = str.replaceAll("[^0-9]","");	
				sum = Integer.parseInt(restr);
				System.out.println(restr);
				continue;
			}
		}
		System.out.println(sum);
		
		
//		String restr = result.replaceAll("[^0-9]","");			
//		System.out.println(restr);
		

		
	}

}
