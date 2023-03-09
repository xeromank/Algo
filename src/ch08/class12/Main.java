package ch08.class12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int x;
    int y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {

    public int solution(int m, int n, int[][] box) {

        int c1 = 0;
        int c0 = 0;

        Queue<Node> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(box[i][j] == 1){
                    c1++;
                    q.offer(new Node(i, j));
                }else if(box[i][j] == 0){
                    c0++;
                }
            }
        }

        if(c0 == 0){
            return 0;
        }

        int answer = 0;

        while(!q.isEmpty()){
            int len = q.size();

            for(int t=0; t<len; t++){
                Node node = q.poll();

                for(int l=0; l<4; l++){
                    int nx = node.x + moveX[l];
                    int ny = node.y + moveY[l];

                    if(nx == n || ny == m || nx < 0 || ny < 0) continue;
                    if(box[nx][ny] == 0){
                        box[nx][ny] = 1;
                        c1++;
                        c0--;
                        q.offer(new Node(nx, ny));
                    }
                }
            }
            answer++;
        }

        if(c0 > 0){
            return -1;
        }


        return answer;
    }

    static int[] moveX = {0, 0, -1, 1};
    static int[] moveY = {1, -1, 0, 0};

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int m = keyIn.nextInt();
        int n = keyIn.nextInt();
        int[][] box = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int input = keyIn.nextInt();
                box[i][j] = input;
            }
        }
        System.out.println(T.solution(m, n, box));
    }

}
