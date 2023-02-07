package ch02.class12.second;

import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int t = 0; t < m; t++) {
                    int p1 = 0;
                    int p2 = 0;
                    for (int e = 0; e < n; e++) {
                        if(arr[t][e] == i){
                            p1 = e;
                        }

                        if(arr[t][e] == j){
                            p2 = e;
                        }
                    }
                    if(p1 < p2) cnt++;
                }
                if(cnt == m) answer++;
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
