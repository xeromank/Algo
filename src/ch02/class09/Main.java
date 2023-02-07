package ch02.class09;

import java.util.Scanner;

public class Main {

    public int solution(int l, int[][] ss) {
        int answer = Integer.MIN_VALUE;

        int acc1;
        int acc2;
        int acc3 = 0;
        int acc4 = 0;
        for (int i = 0; i < l; i++) {
            acc1 = 0;
            acc2 = 0;
            for (int j = 0; j < l; j++) {
                acc1 += ss[i][j];
                acc2 += ss[j][i];

                if (i == j) {
                    acc3 += ss[i][j];
                    acc4 += ss[i][l - j - 1];
                }
            }

            answer = Math.max(answer, acc1);
            answer = Math.max(answer, acc2);
        }
        answer = Math.max(answer, acc3);
        answer = Math.max(answer, acc4);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int l = keyIn.nextInt();
        int[][] ss = new int[l][l];
        for (int i = 0; i < l; i++) {

            for (int j = 0; j < l; j++) {
                ss[i][j] = keyIn.nextInt();
            }

        }
        System.out.println(T.solution(l, ss));
    }

}
