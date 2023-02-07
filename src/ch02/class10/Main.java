package ch02.class10;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] ss) {
        int answer = 0;

        int[] x = {-1, 1, 0, 0};
        int[] y = {0, 0, -1, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean b = true;
                for(int t=0; t<4; t++){
                    int cx = i + x[t];
                    int cy = j + y[t];

                    if(cx >=0 && cx < n && cy >= 0 && cy < n && ss[i][j] <= ss[cx][cy]){
                        b = false;
                        break;
                    }
                }
                if(b) answer++;


//                int t = i - 1 < 0 ? 0 : ss[i - 1][j];
//                int b = i + 1 == n ? 0 : ss[i + 1][j];
//                int l = j - 1 < 0 ? 0 : ss[i][j - 1];
//                int r = j + 1 == n ? 0 : ss[i][j + 1];
//
//                if (s > t && s > b && s > l && s > r) {
//                    answer++;
//                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int l = keyIn.nextInt();
        int[][] ss = new int[l][l];
        for (int i = 0; i < l; i++) {

            for (int j = 0; j < l; j++) {
                ss[i][j] = keyIn.nextInt();
            }

        }
        System.out.println(T.solution(l, ss));
    }

}
