package ch08.class07;

import java.util.Scanner;

public class Main {

    public int solution(int n, int r) {

        int answer = DFS(n, r);
        return answer;
    }

    public int DFS(int n, int r){

        if(n == r) return 1;
        if(r == 0) return 1;


        if(this.arr[n-1][r-1] == 0){
            return this.arr[n-1][r-1] = DFS(n-1, r-1) + DFS(n-1, r);
        }

        return this.arr[n-1][r-1];
    }

    int[][] arr;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int r = keyIn.nextInt();

        T.arr = new int[5][3];

        System.out.println(T.solution(n, r));
    }

}
