package ch08.class09;

import java.util.Scanner;

public class Main {

    public void solution() {
        DFS(1, 0);
    }

    public void DFS(int i, int Lv) {
        if (Lv == m) {
            for (int x : chk) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int j = i; j <= n; j++) {
                chk[Lv] = j;
                DFS(j + 1, Lv + 1);
            }
        }
    }

    static int n;
    static int m;
    static int[] chk;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        n = keyIn.nextInt();
        m = keyIn.nextInt();
        chk = new int[m];
        T.solution();
    }

}
