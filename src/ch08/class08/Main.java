package ch08.class08;

import java.util.Scanner;

public class Main {

    public void DFS(int L, int n, int f) {
        if(success) return;

        if(L == n){
            int sum = 0;
            for(int i=0; i<n; i++){
                sum += c[i] * b[i];
            }

            if(sum == f){
                for(int i: b){
                    System.out.print(i + " ");
                }
                success = true;
            }

            return ;
        }


        for(int i=1; i<=n; i++){
            if(chk[i] == 0){
                chk[i] = 1;
                b[L] = i;
                DFS(L + 1, n, f);
                b[L] = 0;
                chk[i] = 0;
            }
        }

    }

    public int combination(int n, int r) {

        if (n == r) {
            return 1;
        }
        if (r == 0) {
            return 1;
        }

        return  combination(n - 1, r - 1) + combination(n - 1, r);

    }

    static int[] c;
    static int[] b;
    static int[] chk;
    static boolean success = false;
    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int f = keyIn.nextInt();

        c = new int[n];
        b = new int[n];
        chk = new int[n+1];
        for(int i=0; i<n; i++){
            c[i] = T.combination(n-1, i);
        }

        T.DFS(0, n, f);
    }

}
