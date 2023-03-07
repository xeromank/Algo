package ch08.class10.review;

import java.util.Scanner;

public class Main {

    public void solution() {
        chk[1][1] = 1;
        DFS(1, 1);
        System.out.println(count);
    }
    public void DFS(int x, int y){
        if(x == 7 && y == 7){
            count++;
            return;
        }


        for(int i=0; i<4; i++){
            int nx = x + moveX[i];
            int ny = y + moveY[i];

            if(nx > 7 || ny > 7 || nx < 1 || ny < 1){
                continue;
            }

            if(chk[nx][ny] == 0 && arr[nx][ny] == 0){
                chk[nx][ny] = 1;
                DFS(nx, ny);
                chk[nx][ny] = 0;
            }
        }
    }

    static int count = 0;
    static int[][] chk = new int[9][9];
    static int[][] arr;
    static int[] moveX = {-1, 1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        arr = new int[8][8];
        for(int i=1; i<8; i++){
            for(int j=1; j<8; j++){
                arr[i][j] = keyIn.nextInt();
            }
        }

        T.solution();
    }

}
