package ch02.class12;

import java.util.Scanner;

public class Main {

    public int solution(int sc, int tc, int[][] ss) {
        int answer = 0;

        for(int i=0; i<sc; i++){
            for(int j=0; j<sc; j++){
                int cnt = 0;
                for(int k=0; k<tc; k++){
                    int pi=0, pj=0;
                    for(int s=0; s<sc; s++){
                        if(ss[k][s] == i+1) pi = s;

                        if(ss[k][s] == j+1) pj = s;
                    }
                    if(pi < pj) cnt++;
                }

                if(cnt == tc){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        int m = keyIn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = keyIn.nextInt();
            }
        }

        System.out.print(T.solution(n, m, arr));
    }

}
