package ch08.class11.review;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int x;
    int y;
    Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {

    public void solution() {
        chk[1][1] = 1;
        min = BFS();
        System.out.println(min);
    }

    public int BFS(){

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(1, 1));

        int l = 0;
        while (!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                Node n = q.poll();
                for(int j=0; j<4; j++){
                    int nx = n.x + moveX[j];
                    int ny = n.y + moveY[j];

                    if(nx > 7 || ny > 7 || nx < 1 || ny < 1) continue;
                    if(nx == 7 && ny == 7) return l+1;

                    if(chk[nx][ny] == 0 && arr[nx][ny] == 0){
                        chk[nx][ny] = 1;
                        q.offer(new Node(nx, ny));
                    }

                }
            }
            l++;
        }

        return l;
    }

    static int min = Integer.MAX_VALUE;
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
