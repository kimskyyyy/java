package strings;

public class Quiz3A {
	public static void main(String[] args) {
		/*
		 * “FF590-2DX83-M81LZ-XDM7E-MKUT4” 문자열에 있는 정수의 합계를 구하세요.
		 * ex) 590 + 283 + 81 + 7 + 4 = 965
		 */
		
		String data = "FF590-2DX83-M81LZ-XDM7E-MKUT4";

		String strDatas[] = data.split("-");
		int[] intDatas = new int[strDatas.length];
		int i;
		for (i = 0; i < strDatas.length; i++) {
			String tmp = "";
			for (int j = 0; j < strDatas[i].length(); j++) {
				if (strDatas[i].charAt(j) >= '0' &&
						strDatas[i].charAt(j) <= '9')
					tmp += strDatas[i].charAt(j);// 2+8+3 = 283
			}
			intDatas[i] = Integer.parseInt(tmp);
		}

		int total = 0;
		System.out.print("결과 : ");
		for (i = 0; i < intDatas.length; i++) {
			total += intDatas[i];
			if (i < intDatas.length - 1)
				System.out.print(intDatas[i] + " + ");
		}
		System.out.println(intDatas[i - 1] + " = " + total);
	}
}

