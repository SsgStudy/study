package com.example.string2;

public class Pascal9080 {

    static int[][] dp = new int[6][6];

    public static void main(String[] args) {
        dp[1][1] = 1;
        pascal(5);

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

    }

    /*      1
            1 1
            1 2 1
            1 3 3 1
            1 4 6 4 1 */

    public static void pascal(int num)
    {
        for (int i = 2; i < num+1; i++) {
            for (int j = 1; j <= i; j++) {
                if(j-1 == 0)
                {
                    dp[i-1][j-1] = 0;
                }
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];

            }
        }
    }
}
