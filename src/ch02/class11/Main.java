package ch02.class11;

import java.util.Scanner;

public class Main {

    public int solution(int l, int[][] ss) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l; i++) {
            int cnt = 0;
            for (int j = 0; j < l; j++) {
                for (int n = 0; n < 5; n++) {
                    if (ss[i][n] == ss[j][n]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                answer = i;
                max = cnt;
            }
        }
        return answer + 1;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int l = keyIn.nextInt();
        int[][] ss = new int[l][5];
        for (int i = 0; i < l; i++) {

            for (int j = 0; j < 5; j++) {
                ss[i][j] = keyIn.nextInt();
            }

        }
        System.out.println(T.solution(l, ss));
    }

}
