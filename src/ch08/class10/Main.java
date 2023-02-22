package ch08.class10;

import java.util.Scanner;

public class Main {

    public int solution(int[][] arr) {

        arr[1][1] = 1;
        sol(arr, 1, 1);

        return count;
    }
    static int count = 0;
    public void sol(int[][] arr, int i, int j){
        if(i > 7 || j > 7 || i < 1 || j < 1) return;

        if(i == 7 && j == 7) {
            count++;
            return;
        }

        int[] x = {0, 0, -1 , 1};
        int[] y = {-1, 1, 0 , 0};

        for(int t=0; t<4; t++){

            int tempX = i + x[t];
            int tempY = j + y[t];
            if(tempX > 7 || tempY > 7 || tempX < 1 || tempY < 1) continue;

            if(arr[i + x[t]][j + y[t]] == 0){
                arr[i + x[t]][j + y[t]] = 1;
                sol(arr, i + x[t], j + y[t]);
                arr[i + x[t]][j + y[t]] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int[][] arr = new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                arr[i][j] = keyIn.nextInt();
            }
        }

        System.out.println(T.solution(arr));
    }

}
