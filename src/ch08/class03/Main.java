package ch08.class03;

import java.util.Scanner;

public class Main {
    static int max = 0;
    public int solution(int n, int m, int[][] arr) {
        return sol(n, m, arr, 0, 0, 0);
    }

    public int sol(int n, int m, int[][] arr, int idx, int tt, int tp) {

        if(tt > m) return 0;
        if(idx == n) return max = Math.max(max, tp);

        int point = arr[idx][0];
        int time = arr[idx][1];

        sol(n, m, arr, idx+1, tt, tp);
        sol(n, m, arr, idx+1, tt + time, tp + point);

        return max;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int m = keyIn.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = keyIn.nextInt();
            arr[i][1] = keyIn.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }

}
