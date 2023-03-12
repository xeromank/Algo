package ch08.class13;

import java.util.Queue;
import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr, int[][] chk) {


        int answer = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 1 && chk[i][j] == 0){
                    answer++;
                    DFS(n, i, j);
                }
            }
        }

        return answer;
    }

    public void DFS(int n, int i, int j){
        if(arr[i][j] == 1 && chk[i][j] == 0){
            chk[i][j] = 1;

            for(int m=0; m<8; m++){
                int nI = i + moveX[m];
                int nJ = j + moveY[m];

                if(nI > -1 && nI < n && nJ > -1 && nJ < n){
                    DFS(n, nI, nJ);
                }
            }
        }
    }

    static int[] moveX = {0, 0, 1, -1, 1, 1, -1, -1};
    static int[] moveY = {1, -1, 0, 0, 1, -1, -1, 1};
    static int[][] arr;
    static int[][] chk;
    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        arr = new int[n][n];
        chk = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = keyIn.nextInt();
                if(arr[i][j] == 0){
                    chk[i][j] = 1;
                }
            }
        }
        System.out.println(T.solution(n, arr, chk));
    }

}
