package arrays;

import java.util.Scanner;

public class Quiz12A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] pension = new String[12][13];
        int r, c;
        String number ="";
        while (true) {
            System.out.println("1. 입실");
            System.out.println("2. 퇴실");
            System.out.println("3. 전체보기");
            System.out.println("4. 종료");
            System.out.print(">> ");

            String select = sc.next();
            switch(select) {
                case "1" :
                    while(true) {
                        System.out.print("입실 호수 선택 : ");
                        number = sc.next();
                        try {
                            if(number.length() == 3) {
                                r = Integer.parseInt(number.charAt(0) + "") - 1;
                                c = Integer.parseInt(number.charAt(1) + "" + number.charAt(2)) - 1;
                            }else if(number.length() == 4) {
                                r = Integer.parseInt(number.substring(0, 2)) - 1;
                                c = Integer.parseInt(number.substring(2, 4)) - 1;
                            }else {
                                System.out.println("입실 호수를 확인 후 다시 입력하세요.");

                                continue;
                            }
                        } catch (Exception e) {

                            System.out.println("입실 호수를 확인 후 다시 입력하세요.");
                            continue;
                        }

                        if(r >= 0 && r < pension.length && c >= 0 && c < pension[r].length)
                            break;
                        System.out.println("입실 호수를 확인 후 다시 입력하세요.");
                    }

                    if(pension[r][c] == null) {
                        System.out.print("입실자 이름 : ");
                        sc.nextLine();
                        pension[r][c] = sc.nextLine();
                        System.out.println(number + "호실에 입실되었습니다.");
                    }else {
                        System.out.println("사용 중입니다");
                    }

                    break;
                case "2" :

                    while(true) {
                        System.out.print("퇴실 호수 선택 : ");
                        number = sc.next();
                        try {
                            if(number.length() == 3) {
                                r = Integer.parseInt(number.charAt(0) + "") - 1;
                                c = Integer.parseInt(number.charAt(1) + "" + number.charAt(2)) - 1;
                            }else if(number.length() == 4) {
                                r = Integer.parseInt(number.substring(0, 2)) - 1;
                                c = Integer.parseInt(number.substring(2, 4)) - 1;
                            }else {
                                System.out.println("퇴실 호수를 확인 후 다시 입력하세요.");
                                continue;
                            }
                        } catch (Exception e) {
                            System.out.println("퇴실 호수를 확인 후 다시 입력하세요.");
                            continue;
                        }

                        if(r >= 0 && r < pension.length && c >= 0 && c < pension[r].length)
                            break;
                        System.out.println("퇴실 호수를 확인 후 다시 입력하세요.");
                    }
                    if(pension[r][c] != null) {
                        System.out.println(pension[r][c] + "님 퇴실 되었습니다.");
                        pension[r][c] = null;
                    }else {
                        System.out.println("입실한 기록이 없습니다.");
                    }

                    break;
                case "3" :
                    for(int row = 0; row < pension.length; row++) {
                        System.out.println(row + 1 + "층 입실정보");
                        for(int col = 0; col < pension[row].length; col++) {
                            if(col < 9)
                                System.out.println((row+1) + "0" + (col + 1) +"호실 투숙객 : " + pension[row][col]);
                            else
                                System.out.println((row+1) + "" + (col + 1) +"호실 투숙객 : " + pension[row][col]);
                        }
                    }
                    break;
                case "4" : System.out.println("프로그램을 종료합니다."); System.exit(0);
                default : System.out.println("메뉴를 확인 후 다시 입력하세요");
            }
        }


    }
}

