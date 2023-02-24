package arrays;

import java.util.Scanner;

public class Quiz10A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int floor;
		System.out.println("===== 아파트 입주자 정보 ======");
		while (true) {
			System.out.print("건물의 층수를 입력하세요 : ");
			try {
				floor = Integer.parseInt(sc.next());
			} catch (Exception e) {
				continue;
			}
			if (floor > 0)
				break;
		}
		
		String[][] pension = new String[floor][];

		for (int row = 0; row < pension.length; row++) {
			int room = 0;
			while (true) {
				System.out.print((row + 1) + "층의 총 호실 입력 : ");
				try {
					room = Integer.parseInt(sc.next());
				} catch (Exception e) {
					continue;
				}
				if (room > 0)
					break;
			}

			pension[row] = new String[room];
		}

		System.out.println("======= 아파트 층별 정보 =========");
		for (int row = 0; row < pension.length; row++)
			System.out.printf("%d층은 %d호실 까지 있습니다.\n", row + 1, pension[row].length);
		System.out.println();

		System.out.println("각 호실의 입주자 정보를 입력하세요.");
		for (int row = 0; row < pension.length; row++) {
			System.out.println((row + 1) + "층 정보를 입력하세요.");
			for (int col = 0; col < pension[row].length; col++) {
				System.out.printf("%d층 %d호실 : ", row + 1, col + 1);
				pension[row][col] = sc.next();
			}
			System.out.println();
		}

		System.out.println("======= 입주자 정보 =========");
		for (int row = 0; row < pension.length; row++) {
			for (int col = 0; col < pension[row].length; col++) {
				System.out.println((row + 1) + "층 " + (col + 1) + "호실 입주자 : " + pension[row][col]);
			}
			System.out.println();
		}
	}

}
