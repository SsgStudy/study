package Jungol.array1_9063_9073;

import java.util.Scanner;

public class Ex9069 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //윤년의 해에는 2월이 29일
        //평년일때는 2월이 28일
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while (true) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            System.out.printf("YEAR = %d\n", year);
            System.out.printf("MONTH = %d\n", month);
            if (year == 0) {
                break;
            }
            if (month > 12 || month < 0) {
                System.out.println("잘못 입력하였습니다.\n");
                continue;
            }
            if (year % 400 != 0 || (year % 4 != 0 && year % 100 == 0)) { //평년인 경우
                if (month == 1) { //평년이면서 2월인 경우
                    System.out.printf("입력하신 달의 날 수는 28일입니다\n");
                }
            } else { //그 외의 경우
                System.out.printf("입력하신 달의 날 수는 %d일입니다.\n", days[month - 1]);
            }

        }

    }
}
