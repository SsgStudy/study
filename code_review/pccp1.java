package programmers;


//프로그래머스 https://school.programmers.co.kr/learn/courses/30/lessons/250137?language=java
//PCCP 기출 1번 문제
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;
        int bandageTime = bandage[0];
        int bandageRecover = bandage[1];
        int bandageFinallyRecover = bandage[2];
        int fightTime = Integer.MIN_VALUE;
        int success = 0;

        for (int[] attack : attacks) {

            if (attack[0] > fightTime) {
                fightTime = attack[0];
            }
        }

        int count=0;

        for (int i = 0; i <= fightTime; i++) {
            if(attacks[count][0] == i)
            {
                currentHealth -= attacks[count][1];
                if(currentHealth <= 0)
                {
                    return -1;
                }
                success = 0;
                count++;
            }
            else
            {
                success++;
                currentHealth += bandageRecover;
                if(success == bandageTime)
                {
                    currentHealth += bandageFinallyRecover;
                    success = 0;
                }

                if(currentHealth > health)
                {
                    currentHealth = health;
                }
            }
        }

        return currentHealth;
    }
}


public class bandaging {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3, 2, 7},	20	,new int[][]{{1, 15}, {5, 16}, {8, 6}}));
    }
}
