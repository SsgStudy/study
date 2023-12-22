package String1.Array_2;

import java.util.Scanner;

public class Ex_9075 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int[] numbers = {0,0,0,0,0,0,0,0,0,0};

        for (int i = 0; i < 10; i++) {
            int n = input.nextInt();

            if(n == 0){
                break;
            }

            numbers[n%10] += 1;

        }

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= 1){
                System.out.printf("%d : %d개 \n", i, numbers[i]);
            }
        }

    }

}
