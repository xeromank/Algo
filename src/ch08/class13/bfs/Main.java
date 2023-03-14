package ch08.class13.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
    int y;
}

public class Main {

    public void BFS(int n, int x, int y) {
        Queue<Node> q = new LinkedList<>();

        arr[x][y] = 0;
        q.offer(new Node(x, y));

        while (!q.isEmpty()) {
            int len = q.size();
            for (int t = 0; t < len; t++) {
                Node node = q.poll();
                for (int m = 0; m < 8; m++) {
                    int nx = node.x + moveX[m];
                    int ny = node.y + moveY[m];

                    if (nx > -1 && nx < n && ny > -1 && ny < n && arr[nx][ny] == 1) {
                        arr[nx][ny] = 0;
                        q.offer(new Node(nx, ny));
                    }
                }

            }
        }
    }

    public int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    answer++;
                    BFS(n, i, j);
                }
            }
        }

        return answer;
    }

    static int[] moveX = {0, 0, 1, -1, 1, 1, -1, -1};
    static int[] moveY = {1, -1, 0, 0, 1, -1, -1, 1};
    static int[][] arr;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = keyIn.nextInt();
                if (arr[i][j] == 0) {
                }
            }
        }
        System.out.println(T.solution(n, arr));
    }

}
