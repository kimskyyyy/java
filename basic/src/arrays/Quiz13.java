package arrays;

import java.util.Scanner;

/*
석차 구하기
가변 배열 생성 후데이터 입/출력 하기
 */
public class Quiz13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int classRoom;
        while (true) {
            System.out.print("총 학급 수 : ");
            try {
                classRoom = Integer.parseInt(sc.next());
            } catch (Exception e) {
                continue;
            }
            if (classRoom > 0)
                break;
        }

        String[][] school = new String[classRoom][];

        for (int row = 0; row < school.length; row++) {
            int student = 0;
            while (true) {
                System.out.print((row + 1) + "반의 인원 수 : ");
                try {
                    student = Integer.parseInt(sc.next());
                } catch (Exception e) {
                    continue;
                }
                if (student > 0)
                    break;
            }

            school[row] = new String[student];
        }


        for (int row = 0; row < school.length; row++) {
            for (int col = 0; col < school[row].length; col++) {
                System.out.printf("%d반의 %d번째 학생이름: ", row + 1, col + 1);
                school[row][col] = sc.next();

            }
            System.out.println();
        }

        System.out.println("======= 출력 =========");
        for (int row = 0; row < school.length; row++) {
            for (int col = 0; col < school[row].length; col++) {
                System.out.println((row + 1) + "반 " + (col + 1) + "번 : " + school[row][col]);
            }
            System.out.println();
        }
    }
}
