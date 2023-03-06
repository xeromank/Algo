package ch08.class09.review;

import java.util.Scanner;

public class Main {

    public void solution(int n, int m) {
        int[] arr = new int[m];
        DFS(n, m, 0, 1, arr);
    }

    public void DFS(int n, int m, int L, int i, int[] arr){
        if(m == L){
            for (int p : arr) {
                System.out.print(p + " ");
            }
            System.out.println();
        }else{
            for(int j=i; j<=n; j++){
                arr[L] = j;
                DFS(n, m, L+1, j+1, arr);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int m = keyIn.nextInt();
        T.solution(n, m);
    }

}
