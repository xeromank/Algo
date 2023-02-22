package ch08.class02;

import java.util.Scanner;

public class Main {

    public int solution(int c, int n, int[] arr) {
        return Math.max(sol(c, n, arr, 0, 0), sol(c, n, arr, 0, 0));
    }

    public int sol(int c, int n, int[] arr, int idx, int sum) {

        if (idx == n) {
            return sum;
        }

        int l = sol(c, n, arr, idx + 1, sum);
        int r = sum + arr[idx] > c ? sum : sol(c, n, arr, idx + 1, sum + arr[idx]);

        return Math.max(l, r);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int c = keyIn.nextInt();
        int n = keyIn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = keyIn.nextInt();
        }
        System.out.println(T.solution(c, n, arr));
    }

}
